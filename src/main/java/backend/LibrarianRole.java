package backend;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibrarianRole {
    private BookDatabase bookDatabase;
    private StudentBookDatabase sBDatabase;

    public LibrarianRole() throws IOException {
        this.bookDatabase = new BookDatabase("Books.txt");
        bookDatabase.readFromFile();
        this.sBDatabase = new StudentBookDatabase("StudentsBooks.txt");
        sBDatabase.readFromFile();
    }


    public void addBook(String id, String title, String authorName, String publisherName, int quantity) throws IOException {

        this.bookDatabase.insertRecord(new Book(id, title, authorName, publisherName, quantity));
        this.bookDatabase.saveToFile();
    }


    public Book[] getListOfBooks(){
        return this.bookDatabase.returnAllRecords().toArray(new Book[0]);
    }


    public StudentBook[] getListOfBorrowingOperations(){
        return this.sBDatabase.returnAllRecords().toArray(new StudentBook[0]);
    }


    public int borrowBook(String studentId, String bookId, LocalDate borrowDate) throws IOException {
        for(Record book : this.bookDatabase.returnAllRecords())
        {
            book = (Book)book;
            if(book.getSearchKey().equals(bookId))
            {
                if(((Book) book).getQuantity() == 0)
                    return 0;
            }
        }
        for(Record studentBook : this.sBDatabase.returnAllRecords())
        {
            studentBook = (StudentBook)studentBook;
            if(((StudentBook) studentBook).getStudentId().equals(studentId))     ///////////
            {
                if(studentBook.getSearchKey().equals(bookId))
                    return 1;
            }
        }
        for(Record book : this.bookDatabase.returnAllRecords()){
            book = (Book) book;
            if(book.getSearchKey().equals(bookId)) {
                ((Book) book).setQuantity(((Book) book).getQuantity() - 1);
                this.bookDatabase.saveToFile();
            }

        }
        this.sBDatabase.insertRecord(new StudentBook(studentId, bookId, borrowDate));
        this.sBDatabase.saveToFile();
        return 2;
    }
    public double returnBook(String studentId, String bookId, LocalDate returnDate) throws IOException {
        int delay;
        Record target = this.bookDatabase.getRecord(bookId);
        Book m = (Book) target;
        m.setQuantity(m.getQuantity() + 1);
        this.bookDatabase.saveToFile();
        String key = studentId + "," + bookId;


        Record target2 = this.sBDatabase.getRecord(key);
        StudentBook n = (StudentBook) target2;
        delay = (int) ChronoUnit.DAYS.between(n.getBorrowDate(), returnDate);
        this.sBDatabase.deleteRecord(key);
        this.sBDatabase.saveToFile();
        if (delay < 7)
            return 0;
        else
            return (delay - 7) * 0.5;
    }
    public void logout() throws IOException {
        this.bookDatabase.saveToFile();
        this.sBDatabase.saveToFile();
    }
    }

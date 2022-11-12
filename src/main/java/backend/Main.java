package backend;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Locale;
import java.time.temporal.ChronoUnit;

//public class Main {
//    public static void main(String[] args) throws IOException, ConcurrentModificationException {
//        //Book b1 = new Book("B2394","Physics","Albert Einstein","Princeton University",10);
//        //Book b2 = new Book("B2394","Physics","Albert Einstein","Princeton University",2);
//        //BookDatabase d1 = new BookDatabase("Book.txt");
//        //d1.readFromFile();
//        //d1.insertRecord(b1);
//        //d1.saveToFile();
//        //d1.insertRecord(b2);
//        //d1.saveToFile();
////        d1.readFromFile();
////        Book book =(Book) d1.returnAllRecords().get(0);
////        book.setQuantity(book.getQuantity()+1);
////        d1.saveToFile();
//        //System.out.println(LocalDate.now());
//
//        //System.out.println(d1.returnAllRecords());
//
//    }
//}
public class Main {
//    public static void test1() throws IOException {
//        AdminRole admin = new AdminRole("Librarians.txt");
//        LibrarianUser[] arrayOfLibrarianUsers = admin.getListOfLibrarians();
//        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
//        //System.out.println(record.size());
//        admin.addLibrarian("L1100", "Mariam", "mariam@gmail.com", "Alexandria", "01011845684");
//        arrayOfLibrarianUsers = admin.getListOfLibrarians();
//        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
//        System.out.println(arrayOfLibrarianUsers[2].lineRepresentation());
//        admin.removeLibrarian("L1400");
//        arrayOfLibrarianUsers = admin.getListOfLibrarians();
//        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
//        System.out.println(arrayOfLibrarianUsers[2].lineRepresentation());
//        admin.removeLibrarian("L1600");
//        arrayOfLibrarianUsers = admin.getListOfLibrarians();
//        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
//        System.out.println(arrayOfLibrarianUsers[3].lineRepresentation());
//        admin.logout();
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        test1();
//    }
public static void printTheBorrowingResult(int result, String studentId, String bookId) {
    switch (result) {
        case 1 ->
                System.out.println("The student with id = " + studentId + " has already borrowed a copy of the book with id = " + bookId + " and hasn't returned it yet.");
        case 2 ->
                System.out.println("The student with id = " + studentId + " has successfully borrowed a copy of the book with id = " + bookId + ".");
        case 0 ->
                System.out.println("All copies of the book with id = " + bookId + " have been borrowed and no copy is left for the student with id = " + studentId);
    }
}

    public static void printTheBorrowingFee(double result, String studentId, String bookId) {
        System.out.println("The student with id = " + studentId + " should pay a return fee of " + result + " US dollars for the book with id " + bookId);

    }

    public static void test1() throws IOException {
        System.out.println("Test1:\n------");
        LibrarianRole librarian = new LibrarianRole();
        Book[] books = librarian.getListOfBooks();
        System.out.println("Current number of books = " + books.length);
        librarian.addBook("B2391", "Fire & Blood", "George R. R. Martin", "Bantam Books", 4);
        books = librarian.getListOfBooks();
        System.out.println("Current number of books = " + books.length);
        StudentBook[] borrowingOperations = librarian.getListOfBorrowingOperations();
        System.out.println("Current number of ongoing borrowing operations = " + borrowingOperations.length);
        int result = librarian.borrowBook("5000", "B2398", LocalDate.of(2022, 5, 15));
        printTheBorrowingResult(result, "5000", "B2398");
        result = librarian.borrowBook("6000", "B2398", LocalDate.of(2022, 5, 17));
        printTheBorrowingResult(result, "6000", "B2398");
        result = librarian.borrowBook("7000", "B2398", LocalDate.of(2022, 5, 18));
        printTheBorrowingResult(result, "7000", "B2398");
        result = librarian.borrowBook("6000", "B2398", LocalDate.of(2022, 5, 19));
        printTheBorrowingResult(result, "6000", "B2398");
        borrowingOperations = librarian.getListOfBorrowingOperations();
        System.out.println("Current number of ongoing borrowing operations = " + borrowingOperations.length);
        librarian.logout();
    }

    public static void test2() throws IOException {
        System.out.println("Test2:\n------");
        LibrarianRole librarian = new LibrarianRole();
        Book[] books = librarian.getListOfBooks();
        System.out.println("Current number of books = " + books.length);
        StudentBook[] borrowingOperations = librarian.getListOfBorrowingOperations();
        System.out.println("Current number of ongoing borrowing operations = " + borrowingOperations.length);
        int result = librarian.borrowBook("4000", "B2391", LocalDate.of(2022, 5, 18));
        printTheBorrowingResult(result, "4000", "B2391");
        result = librarian.borrowBook("4000", "B2391", LocalDate.of(2022, 5, 19));
        printTheBorrowingResult(result, "4000", "B2391");
        result = librarian.borrowBook("4000", "B2398", LocalDate.of(2022, 5, 19));
        printTheBorrowingResult(result, "4000", "B2398");
        double fee = librarian.returnBook("5000", "B2398", LocalDate.of(2022, 5, 20));
        printTheBorrowingFee(fee, "5000", "B2398");
        fee = librarian.returnBook("6000", "B2398", LocalDate.of(2022, 5, 29));
        printTheBorrowingFee(fee, "6000", "B2398");
        result = librarian.borrowBook("8000", "B2399", LocalDate.of(2022, 5, 19));
        printTheBorrowingResult(result, "8000", "B2399");
        result = librarian.borrowBook("4000", "B2399", LocalDate.of(2022, 5, 19));
        printTheBorrowingResult(result, "4000", "B2399");
        borrowingOperations = librarian.getListOfBorrowingOperations();
        System.out.println("Current number of ongoing borrowing operations = " + borrowingOperations.length);
        librarian.logout();
    }

    public static void main(String[] args) throws IOException {
        test1();
        System.out.println("------------------------------------------------------------------");
        test2();

    }
}

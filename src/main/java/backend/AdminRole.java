package backend;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;
import constants.FileNames;

public class AdminRole  {
    private LibrarianUserDatabase database;
    private String fileName = FileNames.LIBRARIANS_FILENAME;
    public AdminRole() {
        database = new LibrarianUserDatabase(fileName);
        database.readFromFile();
    }

    public void addLibrarian(String librarianId, String name, String email, String address, String phoneNumber){
        LibrarianUser newLibrarian = new LibrarianUser(librarianId, name, email, address, phoneNumber);
        this.database.insertRecord(newLibrarian);
        this.database.saveToFile();
    }


    public LibrarianUser[] getListOfLibrarians()  {
        return this.database.returnAllRecords().toArray(new LibrarianUser[0]);
    }


    public void removeLibrarian(String key)  {
        this.database.deleteRecord(key);
        this.database.saveToFile();
    }


    public void logout()  {
        this.database.saveToFile();
    }
}

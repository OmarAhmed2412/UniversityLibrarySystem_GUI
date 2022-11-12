package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import constants.FileNames;

public class BookDatabase extends DataBase {

    public BookDatabase(String fileName) {
        super(fileName);
        this.setFileName(FileNames.BOOKS_FILENAME);
    }


        public Book createRecordFrom (String line)
        {
            String[] BookData = line.split(",");
            Book book = new Book(BookData[0], BookData[1], BookData[2], BookData[3], Integer.parseInt(BookData[4]));
            return book;
        }
}

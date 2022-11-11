package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentBookDatabase extends DataBase{

    public StudentBookDatabase(String fileName) throws IOException {
        super(fileName);
    }

    public StudentBook createRecordFrom (String line)
    {
        String[] StudentBookData = line.split(",");
        return new StudentBook(StudentBookData[0], StudentBookData[1], LocalDate.parse(StudentBookData[2]));

    }
}

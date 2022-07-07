package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        // Difference between checked and unchecked exception
        // Checked is checked for at compile time. Java makes you deal with it before it even runs the code
        // To deal with it you surround it by a try/catch block or
        // add a throws declaration in the method signature

        readFile("myFile.txt");

    }

    private static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);   // Could throw exception if name of file does not exist.
        }                                                   // This is a checked exception. Java makes you deal with it at compile time.
        catch (FileNotFoundException fnfe) {
            System.out.println("file does not exist");
        }
    }

}


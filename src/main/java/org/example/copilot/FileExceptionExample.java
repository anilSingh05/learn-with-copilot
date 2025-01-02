package org.example.copilot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Implement a method that reads a file and throws a FileException if the file is not found
public class FileExceptionExample {
    // Implement a method that reads a file and throws a FileException if the file is not found
    public void readFile(String fileName) throws FileNotFoundException {
        // Implement a method that reads a file and throws a FileException if the file is not found
        try {
            // Implement a method that reads a file and throws a FileException if the file is not found
            // Read file
            FileInputStream fileInputStream = new FileInputStream(fileName);

        } catch (Exception e) {
            // Implement a method that reads a file and throws a FileException if the file is not found
            throw new FileNotFoundException("File not found");
        }
    }
}

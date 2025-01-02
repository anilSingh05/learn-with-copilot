package org.example.copilot;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandilingExample {

    // Design a program that prompts user to enter their age. Use a try-catch block to handle the
    //InputMismatchException that may occur if the user enters a non-numeric value. Additionally declare a checked exception
    //       (i.e. InvalidAgeException) and throw it if user enters a negative age
    public static void main(String[] args) throws InvalidAgeException {
        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative");
            }else{
                System.out.println("Age is: " + age);
            }
        } catch (InputMismatchException | InvalidAgeException e) {
            System.out.println("Invalid input");
        }
    }
}


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
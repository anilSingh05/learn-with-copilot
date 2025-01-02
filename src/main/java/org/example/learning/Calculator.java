package org.example.learning;

public class Calculator {

    // write the logic to implement calculator functions
    public static int calculatorFun(int a, int b, String operation) {
        switch (operation) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
            default:
                return 0;
        }
    }

}

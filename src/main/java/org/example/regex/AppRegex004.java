package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppRegex004 {
    public static void main(String[] args) {
        String email = "example@example.com"; // replace with the email you want to validate

        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is not valid.");
        }
    }
}
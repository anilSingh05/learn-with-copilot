package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppRegex003 {
    public static void main(String[] args) {
        String password = "paSsword123@"; // replace with the password you want to validate

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid.");
        }
    }
}
package org.example.regex;

public class AppRegex {
    // please give me simple Hello World regex example in Java
    public static void main(String[] args) {
        withOutPattern();
        withPatternMatcher();
    }

    private static void withPatternMatcher() {
        // Write a regex to match Hello World using Pattern and Matcher
        String text = "Hello World";
        String regex = "Hello World*";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(text);
        if(matcher.matches())
            System.out.println("withPatternMatcher :: Matched");
        else
            System.out.println("withPatternMatcher :: Not Matched");
    }

    private static void withOutPattern() {
        String text = "Hello World";
        String regex = "Hello World*";
        boolean isMatch = text.matches(regex);
        if(isMatch)
            System.out.println("withOutPattern :: Matched");
        else
            System.out.println("withOutPattern :: Not Matched");
    }
}

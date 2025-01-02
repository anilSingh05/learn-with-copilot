package org.example.regex;



public class AppRegex002 {
    // I have a text "A cat and Dogs are friends" please  write  new program for finding the pattern for  [abc]
    public static void main(String[] args) {
        withOutPattern();
        withPatternMatcher();
    }

    private static void withOutPattern() {
        String text = "A cat and Dogs are friends";
        String regex = "[abc]";
        boolean isMatch = text.matches(regex);
        if(isMatch)
            System.out.println("withOutPattern :: Matched");
        else
            System.out.println("withOutPattern :: Not Matched");
    }

    private static void withPatternMatcher() {
        // Write a regex to match Hello World using Pattern and Matcher
        String text = "A cat and Dogs are friends";
        String regex = "[abc]";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(text);
        while(matcher.find())
        {
            System.out.println("withPatternMatcher :: Matched" + "Start index: " + matcher.start()
                    + "End index: " + matcher.end()
                    + "Found: " + matcher.group());
        }
    }


}

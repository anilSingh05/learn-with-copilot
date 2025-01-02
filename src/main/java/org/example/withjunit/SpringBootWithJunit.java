package org.example.withjunit;

public class SpringBootWithJunit {
    // Implement  a method to check whether given list is sublist of another list
    public static boolean isSubList(int[] list, int[] subList) {
        int i = 0;
        int j = 0;
        while (i < list.length && j < subList.length) {
            if (list[i] == subList[j]) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return i == list.length;
    }

    // method to check correct concatenation of two strings
    public static String isConcatenation(String str1, String str2) {
        return str1+str2;
    }
}

package com.bridgelabz;

import java.util.Arrays;

public class StringAnagramOrNot {
    /**
     * checking Strings are anagram or not
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean isAnagram(String a, String b) {
        /*
        Converting two Strings in to character array and sort it to find it is equal or not
         */
        if (a.length() != b.length()) {
            return false;
        } else {
            char[] x = a.toLowerCase().toCharArray();
            char[] y = b.toLowerCase().toCharArray();
            Arrays.sort(x);
            Arrays.sort(y);
            return Arrays.equals(x, y);
        }
    }


    public static void main(String[] args) {

        String a = "abcd";
        String b = "dcba";
        if (isAnagram(a, b)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are not Anagrams");
        }

    }
}

package com.hackerrank.problem;

//Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another string if it comes later in a lexicographically sorted list.
//
//Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:
//
//It must be greater than the original word
//It must be the smallest word that meets the first condition
//
//        Example
//The next largest word is
//
//        .
//
//Complete the function biggerIsGreater below to create and return the new string meeting the criteria. If it is not possible, return no answer.

import java.util.Arrays;

public class BiggerIsGreater {

    /*
     * Complete the 'biggerIsGreater' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING w as parameter.
     */

    public static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        for (int i = chars.length - 2; i >= 0; i--) {
            if (chars[i] < chars[i + 1]) {
                for (int j = chars.length - 1; j > i; j--) {
                    if (chars[j] > chars[i]) {
                        char temp = chars[i];
                        chars[i] = chars[j];
                        chars[j] = temp;

                        char[] prefix = Arrays.copyOfRange(chars, 0, i + 1);
                        char[] postfix = Arrays.copyOfRange(chars, i + 1, chars.length);
                        Arrays.sort(postfix);
                        return String.join("", String.copyValueOf(prefix), String.copyValueOf(postfix));
                    }
                }
            }
        }
        return "no answer";
    }
}

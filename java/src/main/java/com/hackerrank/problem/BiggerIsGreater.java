package com.hackerrank.problem;

import java.util.Arrays;

public class BiggerIsGreater {

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

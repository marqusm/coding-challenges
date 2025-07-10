package com.leetcode.problem;

public class RomanToInteger {
    public int romanToInt(String s) {
        int a = 0;
        int b = 0;
        int sum = 0;
        while (a < s.length()) {
            while (true) {
                b++;
                if (b > s.length()) {
                    System.out.println("b at the end");
                    sum += getNumber(s.substring(a, b - 1));
                    a = b;
                    break;
                }
                String current = s.substring(a, b);
                System.out.println("a:" + a + ", b:" + b + ", curr=" + current);
                System.out.println("checking number: " + getNumber(current));
                if (getNumber(current) < 0) {
                    sum += getNumber(s.substring(a, b - 1));
                    a = b - 1;
                    b = a;
                    continue;
                }
            }
            a++;
        }
        return sum;
    }

    private boolean isLegalNumber(String s) {
        System.out.println("isLegal:" + s);
        return true;
    }

    private int getNumber(String s) {
        System.out.println("getNumber:" + s);
        switch (s) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
        }
        if (s.length() > 0 && s.length() < 4 ) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(0) != s.charAt(i)) {
                    return -1;
                }
            }
            return getNumber(s.charAt(0) + "") * s.length();
        }
        return -1;
    }
}

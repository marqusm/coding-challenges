package com.leetcode.problem;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandCenter(s, i, i);
            int len2 = i + 1 >= s.length() ? 0 : expandCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandCenter(String s, int left, int right) {
        int len = left == right ? -1 : 0;
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            len += 2;
        }
        return len;
    }
}

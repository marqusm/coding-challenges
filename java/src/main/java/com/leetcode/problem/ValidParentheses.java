package com.leetcode.problem;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.empty()) return false;
                    if (stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.empty()) return false;
                    if (stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.empty()) return false;
                    if (stack.pop() != '{') return false;
                    break;
            }
        }
        return stack.empty();
    }
}

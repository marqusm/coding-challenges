package com.leetcode.problem;

import java.util.Stack;

class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = tokens.length - 1; i >= 0; i--) {
            stack.push(tokens[i]);
        }

        while (stack.size() > 1) {
            String a = stack.pop();
            String b = stack.pop();
            String op = stack.pop();

            switch (op) {
                case "+":
                    stack.push(Integer.parseInt(a) + Integer.parseInt(b) + "");
                    break;
                case "-":
                    stack.push(Integer.parseInt(a) - Integer.parseInt(b) + "");
                    break;
                case "*":
                    stack.push(Integer.parseInt(a) * Integer.parseInt(b) + "");
                    break;
                case "/":
                    stack.push(Integer.parseInt(a) / Integer.parseInt(b) + "");
                    break;
            }
        }

        return Integer.parseInt(stack.getFirst());
    }
}

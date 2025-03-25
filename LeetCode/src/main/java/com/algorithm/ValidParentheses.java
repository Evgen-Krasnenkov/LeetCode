package com.algorithm;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[' || ch == '(' || ch == '{') {
                chars.push(ch);
            } else if (chars.empty()) {
                return false;
            } else {
                if ((ch == ')' && chars.peek() != '(')
                        || (ch == ']' && chars.peek() != '[')
                        || (ch == '}' && chars.peek() != '{')
                ) {
                    return false;
                } else {
                    chars.pop();
                }
            }
        }
        return chars.empty();
    }

}

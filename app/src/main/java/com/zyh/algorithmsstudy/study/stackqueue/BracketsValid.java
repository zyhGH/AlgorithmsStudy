package com.zyh.algorithmsstudy.study.stackqueue;

import java.util.Stack;

/**
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合
 */
public class BracketsValid {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(')');
            }else if (c == '[') {
                stack.push(']');
            }else if (c == '{') {
                stack.push('}');
            }else {
                if (stack.size() == 0 || c != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValidTest(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' : stack.push(')');
                case '[' : stack.push(']');
                case '{' : stack.push('}');
                default:
                    if (stack.isEmpty() || s.charAt(i) != stack.pop()) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}

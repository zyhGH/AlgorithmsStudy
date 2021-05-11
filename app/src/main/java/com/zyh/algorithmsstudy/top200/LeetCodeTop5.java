package com.zyh.algorithmsstudy.top200;

import java.util.LinkedList;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串
 */

//TODO 暂时还没弄出来
public class LeetCodeTop5 {
    public static void main(String[] args) {
        longestPalindrome("bb");
    }

    public static String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        int length = s.length();
        String result;
        int subLength = 0;
        int start = 0;
        int max = 0;

        for (int i = 0; i < length; i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                subLength++;
                left--;
            }
            while (right < length && s.charAt(right) == s.charAt(i)) {
                subLength++;
                right++;
            }
            while (left >= 0 && right < length && s.charAt(right) == s.charAt(left)) {
                subLength += 2;
                left--;
                right++;
            }
            if (right - left > subLength) {
                max = right - left;
                start = left;
            }
        }
        result = s.substring(start + 1, start + max);
        System.out.println(result);
        return result;
    }
}

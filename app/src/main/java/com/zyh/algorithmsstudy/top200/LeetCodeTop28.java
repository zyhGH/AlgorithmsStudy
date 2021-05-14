package com.zyh.algorithmsstudy.top200;

public class LeetCodeTop28 {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("") || haystack.equals(needle)) return 0;
        if (needle.length() > haystack.length()) return -1;

        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return i;
            }
        }
        return -1;
    }
}

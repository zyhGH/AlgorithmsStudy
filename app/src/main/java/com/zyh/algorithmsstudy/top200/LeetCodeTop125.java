package com.zyh.algorithmsstudy.top200;

public class LeetCodeTop125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }

    public static boolean isPalindrome(String s) {
        s = s.trim();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char a = s.charAt(left);
            char b = s.charAt(right);

            if (!((a >= '0' && a <= '9') || (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))) {
                left++;
                continue;
            }
            if (!((b >= '0' && b <= '9') || (b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z'))) {
                right--;
                continue;
            }
            if (a >= 'A' && a <= 'Z') a += 32;
            if (b >= 'A' && b <= 'Z') b += 32;
            if (a != b) {
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
}

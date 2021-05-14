package com.zyh.algorithmsstudy.top200;

public class LeetCodeTop7 {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int a = x % 10;
            x /= 10;
            rev = rev * 10 + a;
        }
        return (int)rev == rev ? (int)rev : 0;
    }
}

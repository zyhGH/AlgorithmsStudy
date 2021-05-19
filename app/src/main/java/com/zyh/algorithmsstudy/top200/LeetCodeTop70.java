package com.zyh.algorithmsstudy.top200;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 */
public class LeetCodeTop70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int i = 1;
        int j = 2;
        for (int k = 3; k <= n; k++) {
            int temp = i + j;
            i = j;
            j = temp;
        }
        return j;
    }

}

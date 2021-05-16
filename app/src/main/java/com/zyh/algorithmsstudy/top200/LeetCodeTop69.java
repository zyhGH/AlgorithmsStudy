package com.zyh.algorithmsstudy.top200;

/**
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
 */
public class LeetCodeTop69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }

    public static int mySqrt(int x) {
        int s = 1;
        int e = x;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (x / mid >= mid) {
                s = mid + 1;
            }else {
                e = mid - 1;
            }
        }
        return e;
    }
}

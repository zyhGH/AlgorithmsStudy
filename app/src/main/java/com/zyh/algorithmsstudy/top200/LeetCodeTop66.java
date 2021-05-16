package com.zyh.algorithmsstudy.top200;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 */
public class LeetCodeTop66 {

    public static void main(String[] args) {
        int[] ints = plusOne(new int[]{9,8,9});
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "  ");
        }
    }

    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];
        int hasPlusOne = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                result[i] = (digits[i] + 1) % 10;
                if ((digits[i] + 1) / 10 > 0) {
                    hasPlusOne = 1;
                }else {
                    hasPlusOne = 0;
                }
            }else {
                result[i] = (digits[i] + hasPlusOne) % 10;
                if ((digits[i] + hasPlusOne) / 10 > 0) {
                    hasPlusOne = 1;
                }else {
                    hasPlusOne = 0;
                }
            }

        }
        if (result[0] == 0) {
            int[] plusResult = new int[digits.length + 1];
            plusResult[0] = 1;
            return plusResult;
        }else {
            return result;
        }
    }
}

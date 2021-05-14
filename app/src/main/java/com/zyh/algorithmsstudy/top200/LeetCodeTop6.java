package com.zyh.algorithmsstudy.top200;

import android.os.Handler;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列
 */
public class LeetCodeTop6 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);
    }

    public static String convert(String s, int numRows) {
        char[][] array = new char[numRows][s.length() / numRows];
        int row = 0;
        int col = 0;
        int c = 0;
        int chari = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i % numRows == 0) {
                chari = chari * -1;
            }
            col = col + chari;
            System.out.println(col + "    " + i);
            /*
            col = col + c;
            array[row][col + c] = s.charAt(i);*/
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                System.out.println(i + "   " + j);
            }
        }
        return "";
    }
}

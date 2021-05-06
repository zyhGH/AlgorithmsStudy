package com.zyh.algorithmsstudy.leetCode;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列
 * 其实就是按照从下到上从左到右排
 */
public class LeetCode6 {
    public static void main(String[] args) {

    }

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        int row = 0;
        int line = 0;
        boolean goDown = true;
        int[][] temp = new int[numRows][s.length() / numRows];


        for (int i = 0; i < s.length(); i++) {
            if (goDown) {
                row++;
            }else {
                row--;
            }
            if (row == 0) {
                goDown = true;
            }else if (row == numRows - 1){
                goDown = false;
            }
            temp[row][line] = s.charAt(i);
        }
        return "";
    }
}

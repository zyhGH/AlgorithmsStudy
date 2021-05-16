package com.zyh.algorithmsstudy.top200;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class LeetCodeTop53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            result = Math.max(result, temp);
            if (temp < 0) temp = 0;
        }
        return result;
    }
}

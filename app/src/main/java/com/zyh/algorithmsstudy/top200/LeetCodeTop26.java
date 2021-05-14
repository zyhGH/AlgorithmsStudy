package com.zyh.algorithmsstudy.top200;

public class LeetCodeTop26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[result]) {
                result++;
                nums[result] = nums[i];
            }
        }
        return result + 1;
    }
}

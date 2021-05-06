package com.zyh.algorithmsstudy.leetCode;

public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 1) return 1;

        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[temp] != nums[i]) {
                temp++;
                nums[temp] = nums[i];
            }
        }
        return ++temp;
    }
}

package com.zyh.algorithmsstudy.top200;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target
 * 请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标
 */
public class LeetCodeTop1 {
    public static void main(String[] args) {
        int[] test = new int[]{2, 7, 11, 15};
        for (int a : twoSum(test, 9)) {
            System.out.println(a);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}

package com.zyh.algorithmsstudy.top200;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素
 */
public class LeetCodeTop136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer integer = map.get(nums[i]);
                map.put(nums[i], integer + 1);
            }else {
                map.put(nums[i], 1);
            }
        }
        for (Integer a: map.keySet()) {
            Integer integer = map.get(a);
            if (integer == 1) return a;
        }
        return 0;
    }
}

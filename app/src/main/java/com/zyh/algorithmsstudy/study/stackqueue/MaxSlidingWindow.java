package com.zyh.algorithmsstudy.study.stackqueue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 滑动窗口最大值
 * 给你一个整数数组 nums，
 * 有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位
 */
public class MaxSlidingWindow {
    public static void main(String[] args) {
        maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) return nums;

        LinkedList<Integer> queue = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        int temp = 0;

        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) {
                queue.pollLast();
            }
            queue.offerLast(nums[i]);
        }
        result[temp++] = queue.peekFirst();
        for (int j = k; j < nums.length; j++) {
            if (nums[j - k] == queue.peekFirst()) { //表示queue里有k个元素了 因为最大的一直在最前面 出现更大的前面会被删除
                queue.pollFirst();
            }
            while (!queue.isEmpty() && queue.peekLast() < nums[j]) {
                queue.pollLast();
            }
            queue.offerLast(nums[j]);
            result[temp++] = queue.peekFirst();
        }
        return result;
    }
}

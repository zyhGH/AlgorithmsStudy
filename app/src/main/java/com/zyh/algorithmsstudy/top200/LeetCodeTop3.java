package com.zyh.algorithmsstudy.top200;

import java.util.LinkedList;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LeetCodeTop3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        LinkedList<Character> queue = new LinkedList<>();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            while (queue.contains(s.charAt(i))) {
                result = Math.max(result, queue.size());
                queue.poll();
            }
            queue.offer(s.charAt(i));
        }
        return Math.max(result, queue.size());
    }
}

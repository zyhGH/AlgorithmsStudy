package com.zyh.algorithmsstudy.allquestion;

import java.util.HashMap;

public class Number3 {
    public static void main(String[] args) {
        lengthOfLongestSubstring("dvdf");
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();
        int max = 0;
        for (int start = 0, end = 0; end < c.length; end++) {
            if (map.containsKey(c[end])) {
                start = Math.max(map.get(c[end]) + 1, start);
            }
            max = Math.max(max, end - start + 1);
            map.put(c[end], end);
        }
        return max;
    }
}

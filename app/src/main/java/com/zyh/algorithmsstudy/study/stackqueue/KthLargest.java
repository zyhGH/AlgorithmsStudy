package com.zyh.algorithmsstudy.study.stackqueue;

import java.util.PriorityQueue;

/**
 * 设计一个找到数据流中第 k 大元素的类（class）。注意是排序后的第 k 大元素，不是第 k 个不同的元素。
 */
public class KthLargest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (pq.size() < k) {
            pq.offer(val);
        } else {
            if (pq.peek() < val) {
                pq.poll();
                pq.offer(val);
            }
        }
        return pq.peek();
    }
}

class KthLargestTest {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargestTest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    public int add(int val) {
        if (pq.size() < 3) {
            pq.offer(val);
        }else {
            if (pq.peek() < val) {
                pq.poll();
                pq.offer(val);
            }
        }
        return pq.peek();
    }
}


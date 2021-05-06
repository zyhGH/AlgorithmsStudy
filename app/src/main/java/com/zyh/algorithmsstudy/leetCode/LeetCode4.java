package com.zyh.algorithmsstudy.leetCode;

/**
 * 查找两个数组的中位数
 */
public class LeetCode4 {
    public static void main(String[] args) {
        double v = findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0});
        System.out.print(v);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int temp = 0;

        int[] tempArray = new int[nums1.length + nums2.length];

        while(index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] <= nums2[index2]) {
                tempArray[temp++] = nums1[index1++];
            }else {
                tempArray[temp++] = nums2[index2++];
            }
        }

        while (index1 < nums1.length) {
            tempArray[temp++] = nums1[index1++];
        }
        while (index2 < nums2.length) {
            tempArray[temp++] = nums2[index2++];
        }

        int index = tempArray.length / 2;
        if (tempArray.length % 2 == 0) {
            return ((double) tempArray[index] + (double)tempArray[index - 1]) / 2;
        }else {
            return (double) tempArray[index];
        }
    }
}

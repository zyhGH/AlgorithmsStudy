package com.zyh.algorithmsstudy.top200;

public class LeetCodeTop4 {
    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int[] result = new int[nums1.length + nums2.length];
        int temp = 0;

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] <= nums2[index2]) {
                result[temp++] = nums1[index1++];
            }else {
                result[temp++] = nums2[index2++];
            }
        }
        while (index1 < nums1.length) {
            result[temp++] = nums1[index1++];
        }
        while (index2 < nums2.length) {
            result[temp++] = nums2[index2++];
        }

        double c;
        if (result.length % 2 == 0) {
            c = (double)(result[temp / 2] + result[temp / 2 - 1]) / 2;
        }else {
            c = result[temp / 2];
        }
        System.out.println(c);
        return c;
    }
}

package com.zyh.algorithmsstudy.top200;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCodeTop88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int r = 0;
        int[] result = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[r++] = nums1[i++];
            }else {
                result[r++] = nums2[j++];
            }
        }
        if (i < m) {
            while (r < result.length) {
                result[r++] = nums1[i++];
            }
        }
        if (j < n) {
            while (r < result.length) {
                result[r++] = nums2[j++];
            }
        }
        for (int k = 0; k < result.length; k++) {
            nums1[k] = result[k];
        }
    }
}

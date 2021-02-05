package com.zyh.algorithmsstudy.search;

public class Search {
    public static void main(String[] args) {
        System.out.println(insertBinary(new int[]{0,0,1,1,3,3,4,5,7,8}, 2));
    }

    //二分法查找第一个等于给定值的元素的下标
    private static int binarySearch(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] >= value) {
                if (value == a[mid])
                    result = mid;
                high = mid - 1;
            }else {

                low = mid + 1;
            }
        }
        return result;
    }

    /*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

    你可以假设数组中无重复元素*/
    private static int insertBinary(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            }else if (nums[mid] < target) {
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return low;
    }
}

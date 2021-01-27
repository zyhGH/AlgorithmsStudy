package com.zyh.algorithmsstudy.sort;

public class ThreeImportantSort {
    public static void main(String[] args) {
        quickSort(new int[]{3,5,5,6,2,1,8});
    }

    /**
     * 插入排序
     * @param a
     */
    private static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                }else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    /**
     * 归并排序
     */
    private static void mergeSort(int[] a) {
        makeGroup(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void makeGroup(int[] a, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        makeGroup(a, start, mid);
        makeGroup(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[end - start + 1];

        while(i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            }else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        int s = i;
        int e = mid;
        if (j <= end) {
            s = j;
            e = end;
        }

        while(s <= e) {
            temp[k] = a[s];
            k++;
            s++;
        }

        for (int l = 0; l < end - start + 1; l++) {
            a[l + start] = temp[l];
        }
    }


    /**
     * 快速排序
     */
    private static void quickSort(int[] a) {
        createGroup(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void createGroup(int[] a, int start, int end) {
        if (start >= end) return;

        int mid = findMid(a, start, end);
        createGroup(a, start, mid - 1);
        createGroup(a, mid + 1, end);
    }

    private static int findMid(int[] a, int start, int end) {
        int temp = a[end];
        int i = start;
        for (int j = i; j < end; j++) {
            if (a[j] < temp) {
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i++;
            }
        }

        int tmp = a[end];
        a[end] = a[i];
        a[i] = tmp;
        return i;
    }
}

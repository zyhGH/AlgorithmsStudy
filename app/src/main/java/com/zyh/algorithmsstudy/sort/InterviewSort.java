package com.zyh.algorithmsstudy.sort;

public class InterviewSort {
    public static void main(String[] args) {
        mergeSort(new int[]{3, 0, 5, 6, 2, 1, 8});
    }

    /**
     * 快排
     */
    public static void quickSort(int[] arr) {
        createGroup(arr, 0, arr.length - 1);

        for (int a:
        arr){
            System.out.print(a + " ");
        }
    }

    public static void createGroup(int[] a, int start, int end) {
        if (start >= end) return;

        int pivot = getPivot(a, start, end);
        createGroup(a, start, pivot - 1);
        createGroup(a, pivot + 1, end);
    }

    public static int getPivot(int[] a, int start, int end) {
        int num = a[end];
        int s = start;

        for (int i = s; i < end; i++) {
            if (a[i] < num) {
                int temp = a[s];
                a[s] = a[i];
                a[i] = temp;
                s++;
            }
        }

        a[end] = a[s];
        a[s] = num;
        return s;
    }


    /**
     * 归并
     */
    public static void mergeSort(int[] a) {
        makeGroup(a, 0, a.length - 1);
        for (int b:
                a){
            System.out.print(b + " ");
        }
    }

    public static void makeGroup(int[] a, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        makeGroup(a, start, mid);
        makeGroup(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    public static void merge(int[] a, int start, int mid, int end) {
        int s = start;
        int m = mid + 1;
        int k = 0;
        int[] arr = new int[end - start + 1];

        while (s <= mid && m <= end) {
            if (a[s] <= a[m]) {
                arr[k++] = a[s++];
            }else {
                arr[k++] = a[m++];
            }
        }

        int realStart = s;
        int realEnd = mid;
        if (m <= end) {
            realStart = m;
            realEnd = end;
        }

        while (realStart <= realEnd) {
            arr[k++] = a[realStart++];
        }

        for (int i = 0; i < end - start + 1; i++) {
            a[i + start] = arr[i];
        }
    }
}

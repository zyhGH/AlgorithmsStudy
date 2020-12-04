package com.zyh.algorithmsstudy.sort;

public class Sort {
    public static void main(String[] args) {
        int[] a = new int[]{3,5,6,4,1,7,0};
        selectionSort(a);
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int value : a) {
            System.out.print(value);
        }
    }

    private static void insertSort(int[] a) {   //{3,5,6,4,1,7,0}
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            for(; j >= 0; j--) {    //与temp前面的已排序数组比较
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                }else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
        for (int value : a) {
            System.out.print(value);
        }
    }

    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        for (int value : a) {
            System.out.print(value);
        }
    }

    private static void bubbleSort2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void insertSort2(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                }
            }
            a[j + 1] = temp;
        }
    }
}

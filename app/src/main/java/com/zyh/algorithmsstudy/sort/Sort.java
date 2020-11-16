package com.zyh.algorithmsstudy.sort;

public class Sort {
    public static void main(String[] args) {
        int[] a = new int[]{3,5,6,4,1,7};
        selectionSort(a);
    }

    private static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
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

    private static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            for(; j >= 0; j--) {
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
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int value : a) {
            System.out.print(value);
        }
    }
}

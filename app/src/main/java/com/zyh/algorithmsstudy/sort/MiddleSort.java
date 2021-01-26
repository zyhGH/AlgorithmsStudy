package com.zyh.algorithmsstudy.sort;

public class MiddleSort {
    public static void main(String[] args) {
        sort1(new int[]{5, 6, 3, 9, 1, 4});
    }

    //归并
    /*private static void sort1(int[] a) {
        mergeSort(a, 0, a.length - 1);
        for (int value : a) {
            System.out.println(value);
        }
    }

    private static void mergeSort(int[] a, int p, int r) {
        if (p >= r) return;
        int q = (p + r) / 2;
        mergeSort(a, p, q);
        mergeSort(a, q + 1, r);
        merge(a, p, q, r);
    }

    private static void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] tempArr = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tempArr[k] = a[i];
                i++;
            } else {
                tempArr[k] = a[j];
                j++;
            }
            k++;
        }
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }

        // 将剩余的数据拷贝到临时数组tmp
        while (start <= end) {
            tempArr[k++] = a[start++];
        }
        for (int l = 0; l < r - p + 1; l++) {
            a[l + p] = tempArr[l];
        }
    }*/

    private static void sort1(int[] a) {
        makeGroup(a, 0, a.length - 1);
        for (int value : a) {
            System.out.println(value);
        }
    }

    private static void makeGroup(int[] a, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        makeGroup(a, start, mid);
        makeGroup(a, mid + 1, end);
        groupSort(a, start, mid, end);
    }

    private static void groupSort(int[] a, int start, int mid, int end) {
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





    /*// 快速排序，a是数组，n表示数组的大小
    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println("i=" + a[i]);
        }
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;

        int q = partition(a, p, r); // 获取分区点
        quickSortInternally(a, p, q-1);
        quickSortInternally(a, q+1, r);
    }

    //初始：5, 6, 3, 9, 1, 4
    //第一次：3，1，4，9，6，5   区分点为2
    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];   //取这个数来和数组的其他数做比较
        int i = p;      //这个指针是用来告诉你该换第几个数了 比如最小的放在index=0 然后index=1
        for(int j = p; j < r; j++) {
            if (a[j] < pivot) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
            }
        }

        //下面的三步是告诉你 该换一个区分点了 因为前一个区分点已经用过了
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

        return i;
    }*/

    /*private static void quickSort(int[] a) {
        makeGroup(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println("i=" + a[i]);
        }
    }

    private static void makeGroup(int[] a, int start, int end) {
        if (start >= end) return;

        int p = findMiddle(a, start, end);
        makeGroup(a, start, p - 1);
        makeGroup(a, p + 1, end);
    }

    private static int findMiddle(int[] a, int start, int end) {
        int pivot = a[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (a[j] < pivot) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        int temp = a[end];
        a[end] = a[i];
        a[i] = temp;
        return i;
    }*/
}

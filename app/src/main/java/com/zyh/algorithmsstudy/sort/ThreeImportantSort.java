package com.zyh.algorithmsstudy.sort;

public class ThreeImportantSort {
    public static void main(String[] args) {
        mergeSort(new int[]{3,0,5,6,2,1,8});
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
        makeGroup1(a, 0, a.length - 1);
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
     * 复写归并
     * @param a
     * @param start
     * @param end
     */
    public static void makeGroup1(int[] a, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;
        makeGroup1(a, start, mid);
        makeGroup1(a, mid + 1, end);
        merge1(a, start, mid, end);
    }

    public static void merge1(int[] a, int start, int mid, int end) {
        int s = start;
        int m = mid + 1;
        int k = 0;

        int[] temp = new int[end - start + 1];
        while (s <= mid && m <= end) {
            if (a[s] <= a[m]) {
                temp[k++] = a[s++];
            }else {
                temp[k++] = a[m++];
            }
        }
        int rS = s;
        int rE = mid;
        if (m <= end) {
            rS = m;
            rE = end;
        }
        while (rS <= rE) {
            temp[k++] = a[rS++];
        }
        for (int i = 0; i < end - start + 1; i++) {
            a[i + start] = temp[i];
        }
    }


    /**
     * 快速排序
     */
    private static void quickSort(int[] a) {
        createGroup1(a, 0, a.length - 1);
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
            if (a[j] < temp) {      //比他pivot小的就放在左边，不用管排序
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                i++;        //当碰见比他小的 i就要++了
            }
        }

        int tmp = a[end];   //从这一步开始的操作就是要判断，如果有数比a[end]大的话，a[end]要移到i的位置上去
        a[end] = a[i];
        a[i] = tmp;
        return i;
    }


    /**
     * 复写快排
     * @param a
     * @param start
     * @param end
     */
    private static void createGroup1(int[] a, int start, int end) {
        if (start >= end) return;

        int pivot = getPivot(a, start, end);
        createGroup1(a, start, pivot - 1);
        createGroup1(a, pivot + 1, end);
    }

    private static int getPivot(int[] a, int start, int end) {
        int num = a[end];
        int i = start;
        for (int j = i; j < end; j++) {
            if (a[j] < num) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
            }
        }
        int temp = a[end];
        a[end] = a[i];
        a[i] = temp;

        return i;
    }
}

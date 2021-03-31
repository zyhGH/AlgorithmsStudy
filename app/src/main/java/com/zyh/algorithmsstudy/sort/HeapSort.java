package com.zyh.algorithmsstudy.sort;

public class HeapSort {
    public static void main(String[] args) {
        heapSort(new int[]{3, 0, 5, 6, 2, 1, 8});
    }

    public static void heapSort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {   //为什么是a.length / 2,因为完全二叉树每一层，最左边排列起来就是1，2，4，8，16
            buildAdjust(a, a.length, i);                //而最后一排全是叶子节点，所以不用算，从右往左，从下往上，第一个就是a.length / 2 - 1
        }

        for (int i = a.length - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            buildAdjust(a, i, 0);
        }

        for (int num : a) {
            System.out.println(num);
        }
    }

    /**
     * 交换的其实是一棵子树 i为子树的顶点位置
     * @param a
     * @param length
     * @param i
     */
    public static void buildAdjust(int[] a, int length, int i) {
        int k = i, temp = a[i], index = 2 * k + 1;

        while (index < length) {
            if (index + 1 < length) {
                if (a[index] < a[index + 1]) {
                    index = index + 1;
                }
            }

            if (a[index] > temp) {
                a[k] = a[index];
                k = index;
                index = 2 * k + 1;
            } else {
                break;
            }
        }
        a[k] = temp;
    }


}

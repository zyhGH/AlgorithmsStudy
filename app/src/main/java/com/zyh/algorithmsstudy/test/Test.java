package com.zyh.algorithmsstudy.test;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.offer(10);
        list.offer(10);
        list.offer(10);
        list.offerFirst(11);
        list.offerLast(12);

        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println();
        for (int a : list) {
            System.out.println(a);
        }
    }
}

package com.zyh.algorithmsstudy.test;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        a();
    }

    static int temp = 0;

    public static void a() {
        System.out.println(temp++);
        a();
    }
}

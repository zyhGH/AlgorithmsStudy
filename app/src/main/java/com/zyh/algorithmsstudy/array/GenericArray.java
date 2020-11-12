package com.zyh.algorithmsstudy.array;

import java.util.Objects;

/**
 * 实现一个支持动态扩容的数组
 */

public class GenericArray<T> {
    public T[] array;
    private int size;   //已存放

    public GenericArray(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(int index, T data) {
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("add failed! Require index < 0 || index > size.");
        }
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[index] = data;
        size++;
    }
}

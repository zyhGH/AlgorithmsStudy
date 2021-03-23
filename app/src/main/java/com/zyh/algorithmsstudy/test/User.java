package com.zyh.algorithmsstudy.test;

import androidx.annotation.NonNull;

import java.io.Serializable;

class User implements Serializable {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @NonNull
    @Override
    protected User clone() throws CloneNotSupportedException {
        return new User(name, age);
    }
}

class MyThread extends Thread {
    int a;

    public MyThread(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (a < 1000) {
            a += 1;
            System.out.println(getName() + "     " + a);
        }
    }
}
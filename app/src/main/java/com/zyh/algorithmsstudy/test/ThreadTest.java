package com.zyh.algorithmsstudy.test;

public class ThreadTest {
    volatile static int a = 1;

    public static void main(String[] args) {

        ThreadTest tt = new ThreadTest();
        tt.threadRun();
    }

    public void threadRun() {
        new AThread().start();
        new AThread().start();
    }

    synchronized void enterAndExit(String name) throws Exception {
        System.out.println("进入该方法");
        System.out.println("退出该方法");
    }

    class AThread extends Thread {
        @Override
        public void run() {
            try {
                enterAndExit("aaa");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

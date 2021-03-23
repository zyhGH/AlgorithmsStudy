package com.zyh.algorithmsstudy.test;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                MyHandler handler = new MyHandler();
                handler.sendEmptyMessage(0);

            }
        }).start();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("bbbb");
//            }
//        });
    }

    static int temp = 0;

    public static void a(int[] a, int[] h) {
        System.out.println("1");
        int c = 0, d = 0;
        int f = c + d;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < h.length; j++) {
                System.out.println(a[i]);       //O(n^2)
            }
        }
    }

    public void b(int a, int b) {
        while (a < b) {
            System.out.println(a);       //O(n^2)
            a = a*2;        //O(logN)
        }
    }

    class MyTask extends AsyncTask {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Object doInBackground(Object[] objects) {
            return null;
        }
    }
}

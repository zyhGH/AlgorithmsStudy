package com.zyh.algorithmsstudy.test;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;

public class MyHandler extends Handler {

    @Override
    public void handleMessage(@NonNull Message msg) {
        super.handleMessage(msg);
        if (msg.what == 0) {
            System.out.println("aaaaa");
        }
    }
}

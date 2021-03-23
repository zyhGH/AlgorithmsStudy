package com.zyh.algorithmsstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.zyh.algorithmsstudy.array.GenericArray;
import com.zyh.algorithmsstudy.test.MyHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {
                ((TextView)findViewById(R.id.tv)).setText("eeeee");
            }
        }).start();
        /*findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyHandler handler = new MyHandler();
                handler.sendEmptyMessage(0);

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Log.e("qwe", "bbbb");
                    }
                });
            }
        });*/
    }
}
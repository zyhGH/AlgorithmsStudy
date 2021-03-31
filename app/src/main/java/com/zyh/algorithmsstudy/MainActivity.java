package com.zyh.algorithmsstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.zyh.algorithmsstudy.array.GenericArray;
import com.zyh.algorithmsstudy.test.MyHandler;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                startActivity(intent);
            }
        });
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                ((TextView) findViewById(R.id.tv)).setText("eeeee");
//            }
//        }).start();
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

    void upload() throws Exception {
        URL url = new URL("https://www.baidu.com");
        URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty("Range", "byte=50-");
        InputStream is = urlConnection.getInputStream();
        int len = 0;
        byte buffer[] = new byte[1024];
        FileOutputStream fos = new FileOutputStream("c:", true);
        while ((len = is.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
        }
        is.close();
        fos.close();
    }
}
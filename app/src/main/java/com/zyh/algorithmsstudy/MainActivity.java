package com.zyh.algorithmsstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.zyh.algorithmsstudy.array.GenericArray;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GenericArray<String> array = new GenericArray<>(2);
        array.add(0,"2");
        array.add(1,"2");
        array.add(2,"2");
        array.add(3,"2");
        array.add(4,"2");
    }
}
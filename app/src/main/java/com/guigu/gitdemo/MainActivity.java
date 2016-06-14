package com.guigu.gitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG", "TEST");
        Log.e("TAG", "TEST2");
        Log.e("TAG", "TEST3");
        Log.e("TAG", "TEST4");
    }
}

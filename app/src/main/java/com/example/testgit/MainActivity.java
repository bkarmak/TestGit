package com.example.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String test = "Hello world";
        Log.d("bk", test);
        Log.d("zk", test);
        Log.d("ck", test);
        Log.d("dk", test);
        Log.d("ek", test);
        int ok = 9;
        Log.d("mk", ""+ok);

    }
}

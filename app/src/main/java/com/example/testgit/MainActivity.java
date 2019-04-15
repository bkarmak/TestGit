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
<<<<<<< HEAD
<<<<<<< HEAD
        Log.d("zk", test);
=======

        Log.d("ck", test);
>>>>>>> Add log with tag ck
=======
        Log.d("ck", test);
        Log.d("dk", test);
        Log.d("ek", test);
>>>>>>> Add log with tag ek
    }
}

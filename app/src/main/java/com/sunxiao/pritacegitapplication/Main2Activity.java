package com.sunxiao.pritacegitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Activity02Older();
    }
    private void Activity02Older(){
        Log.e("print","activity02"+":::old");
         Log.e("print","activity02"+":::old");
    }
}

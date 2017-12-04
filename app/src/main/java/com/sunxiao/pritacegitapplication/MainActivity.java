package com.sunxiao.pritacegitapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Activity01Older();
        Activity01new();

    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this ,Main3Activity.class);
                startActivity(in);
            }
        });
    }
    private void Activity01Older(){
        Log.e("print","activity01"+":::old"+"1111111111111111111111111111111111111");
    }
    private void Activity01new(){
        Log.e("print","activity01"+":::old");
    }
}

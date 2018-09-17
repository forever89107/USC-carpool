package com.example.windows.uscpool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

      //返回 功能制做
        //取的button3 元件
        Button button3 = (Button) findViewById(R.id.button3);
        //設定button3 的listener
        button3.setOnClickListener(buttonListner);

    }
    private Button.OnClickListener buttonListner = new
            Button.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(register.this, HOME.class);

                    //執行附帶資料的itent
                    startActivity(intent);
                }
            };


}


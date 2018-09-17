package com.example.windows.uscpool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class functionselection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functionselection);

        //司機註冊按鈕 　功能制做
        //取的button10 元件
        Button button10 = (Button) findViewById(R.id.button10);
        //設定button10 的listener
        button10.setOnClickListener(buttonListner);


        //司機註冊按鈕 　功能制做
        //取的button7 元件
        Button button7 = (Button) findViewById(R.id.button7);
        //設定button10 的listener
        button7.setOnClickListener(buttonListner7);


    }
    private Button.OnClickListener buttonListner = new
            Button.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(functionselection.this,driverregister.class);

                    //執行附帶資料的itent
                    startActivity(intent);
                }
            };



    private Button.OnClickListener buttonListner7 = new
            Button.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(functionselection.this,driveriu2.class);

                    //執行附帶資料的itent
                    startActivity(intent);
                }
            };

}
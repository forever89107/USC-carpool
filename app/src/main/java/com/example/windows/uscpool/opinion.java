package com.example.windows.uscpool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class opinion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinion);

        //司機註冊按鈕 　功能制做
        //取的button7 元件
        Button button17 = (Button) findViewById(R.id.button17);
        //設定button10 的listener
        button17.setOnClickListener(buttonListner17);

    }

    private Button.OnClickListener buttonListner17 = new
            Button.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(opinion.this,thanks.class);

                    //執行附帶資料的itent
                    startActivity(intent);
                }
            };
}

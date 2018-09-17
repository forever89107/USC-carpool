package com.example.windows.uscpool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HOME extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //取的button 元件
        Button button = (Button) findViewById(R.id.button);
        //設定button 的listener
        button.setOnClickListener(buttonListner);

        //取的button2 元件
        Button button2 = (Button) findViewById(R.id.button2);
        //設定button2 的listener
        button2.setOnClickListener(buttonListner2);

    }

         private Button.OnClickListener buttonListner = new
            Button.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(HOME.this, register.class);

                    //執行附帶資料的itent
                    startActivity(intent);
                }
            };
          private Button.OnClickListener buttonListner2 = new
            Button.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(HOME.this, functionselection.class);

                    //執行附帶資料的itent
                    startActivity(intent);
                }
            };

}

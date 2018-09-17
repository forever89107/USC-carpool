package com.example.windows.uscpool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class driveriu2 extends AppCompatActivity {

    private Spinner spnPrefer;
    String[] Balls= new String[] {"5km,","4km,","3km,"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driveriu2);

        //取得資源類別檔案中的Spinner
        spnPrefer=(Spinner) findViewById(R.id.spnPrefer);
        // 建立ArrayAdapter
        ArrayAdapter<String> adapterBalls=new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item,Balls);
        // 設定Spinner顯示格式
        adapterBalls.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 設定Spinner
        spnPrefer.setAdapter(adapterBalls);
        // 設定spnPrefer元件 ItemSelected事件的 listener為 spnPreferListener
        spnPrefer.setOnItemSelectedListener(spnPreferListener);

    }

    //定義onItemSelected方法
    private Spinner.OnItemSelectedListener spnPreferListener=
            new Spinner.OnItemSelectedListener(){
                @Override
                public void onItemSelected(AdapterView<?> parent, View v,
                                           int position, long id) {
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub
                }
            };



}


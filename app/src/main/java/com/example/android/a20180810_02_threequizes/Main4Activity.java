package com.example.android.a20180810_02_threequizes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent = getIntent();
        Bundle 包 = intent.getExtras();
        String answer = 包.getString("key" + "key3");
        TextView tv = (TextView)findViewById(R.id.textView4);
        tv.setText("作答紀錄：" + "\n" + answer);
    }



}

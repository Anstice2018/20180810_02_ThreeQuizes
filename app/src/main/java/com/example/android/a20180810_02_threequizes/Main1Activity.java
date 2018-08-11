package com.example.android.a20180810_02_threequizes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Main1Activity extends AppCompatActivity {

    public static final String key = "key1";
    private CharSequence mChoiseName;       //選項內容





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        initChoiseData();   //預設選擇 A 選項
    }

    private void initChoiseData(){
        //預設選擇 A 選項
        RadioButton radio = (RadioButton) findViewById(R.id.radioButton);
        mChoiseName = radio.getText();          //取得選紐文字內容
    }

    public void clickchoise(View view){
        RadioButton radio = (RadioButton)view;  //view 為當前所按的選鈕
        mChoiseName = radio.getText();          //取得選紐文字內容
    }

    public void clicknext(View view){

        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra(key,mChoiseName);
        startActivity(intent);
    }
}

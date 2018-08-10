package com.example.android.a20180810_02_threequizes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickstart (View v){
        Intent it = new Intent (this, Main1Activity.class);
        startActivity(it);
    }
}

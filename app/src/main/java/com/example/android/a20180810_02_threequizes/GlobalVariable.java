package com.example.android.a20180810_02_threequizes;

import android.app.Application;

/**
 * Created by Anstice on 2018/8/12.
 */

public class GlobalVariable extends Application {
    private String key;
    private String value;

    //修改 變數値
    public void setKey(String key){
        this.key = key;
    }
    public void setValue(String value){
        this.value = value;
    }

    //取得 變數值
    public String getKey() {
        return key;
    }
    public String getValue(){
        return value;
    }

}

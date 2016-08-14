package com.example.liuhai.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    private void initView(){
        View view = LayoutInflater.from(this).inflate(R.layout.activity_main,null);
    }


    public void test(){
        String packname = "com.ubtechinc.alpha2english"; /* Android5.0之后获取程序锁的方式是不一样的*/
        String activityname = "";
       //fffffffffff
    }
}

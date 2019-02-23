package com.example.kakeru.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class canvas_app01 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_canvas_app01);
        MyView myView = new MyView(this);
        setContentView(myView);
    }
}

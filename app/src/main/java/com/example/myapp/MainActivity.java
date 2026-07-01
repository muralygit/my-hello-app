package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Hello World! 🎉");
        tv.setTextSize(36);
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(Color.DKGRAY);
        setContentView(tv);
    }
}

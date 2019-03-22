package com.example.donottouch.myapplication;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class P003onConfigurationChanged extends Activity {
    TextView textViewP003;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p003configchangesorientation);
        textViewP003=(TextView)findViewById(R.id.textViewP003);
        textViewP003.setText("Please change your device orientation to see a message");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            textViewP003.setText("Thank you for your interest. Keep good working\n"+
            "Your device orienataion is Portrait mode");
        }
        else if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            textViewP003.setText("Thank you for your interest. Keep good working\n"+
            "Your device orientation is landscape mode");
        }
    }
}

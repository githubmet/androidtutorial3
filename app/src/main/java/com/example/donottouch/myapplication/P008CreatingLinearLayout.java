package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class P008CreatingLinearLayout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams konum=new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        linearLayout.setLayoutParams(konum);

        TextView textView=new TextView(this);
        LinearLayout.LayoutParams konum2=new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        textView.setLayoutParams(konum2);
        textView.setBackgroundColor(Color.parseColor("#FFBB00"));
        textView.setText("Hello World");

        Button button =new Button(this);
        LinearLayout.LayoutParams konum3=new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        button.setLayoutParams(konum3);
        button.setText("Only you");

        linearLayout.addView(textView);
        linearLayout.addView(button);
        setContentView(linearLayout);
    }
}

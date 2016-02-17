package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class P004setOnClickListenerObject extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p004setonclicklistenerobject);

        Button buttonP004=(Button)findViewById(R.id.buttonP004);
        buttonP004.setOnClickListener(new TriggerOnclickClass());  //watch out
    }
    public class TriggerOnclickClass implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(P004setOnClickListenerObject.this,"This toast comes"+
                    "from another class imlementations",Toast.LENGTH_LONG).show();
        }
    }
}

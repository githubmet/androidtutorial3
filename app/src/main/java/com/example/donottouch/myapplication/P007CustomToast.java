package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class P007CustomToast extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p007customtoast);

        Button buttonP007=(Button)findViewById(R.id.buttonP007);
        buttonP007.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        LayoutInflater layoutInflater=getLayoutInflater();
        View view= layoutInflater.inflate(R.layout.p007customtoastrow,
                (ViewGroup)findViewById(R.id.relativeLayoutP007));

        Toast toast=new Toast(P007CustomToast.this);
        toast.setGravity(Gravity.TOP,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
}

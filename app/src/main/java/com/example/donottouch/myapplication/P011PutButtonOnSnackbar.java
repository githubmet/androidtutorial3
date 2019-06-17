package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class P011PutButtonOnSnackbar extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p011snackbar);
    }

    public void onClickShowMtdP011(View view) {
        Snackbar.make(view, R.string.hello, Snackbar.LENGTH_LONG).show();
    }

    public void onClickPutMtdP011(View view) {
        Snackbar snackbar=Snackbar.make(view,
                R.string.hello, Snackbar.LENGTH_LONG);
        snackbar.setAction(R.string.click, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(P011PutButtonOnSnackbar.this,
                        R.string.hello, Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }
}

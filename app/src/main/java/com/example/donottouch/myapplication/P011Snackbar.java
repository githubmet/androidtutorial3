package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class P011Snackbar extends Activity implements View.OnClickListener {
    CoordinatorLayout coordinatorLayoutP011;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p011snackbar);
        coordinatorLayoutP011=(CoordinatorLayout)findViewById(R.id.coordinatorLayoutP011);
        Button buttonP011=(Button)findViewById(R.id.buttonP011);
        Button buttonFromSnackbarToToastP011=(Button)findViewById(R.id.buttonFromSnackbarToToastP011);
        buttonP011.setOnClickListener(this);
        buttonFromSnackbarToToastP011.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.buttonP011:
                Snackbar.make(coordinatorLayoutP011, "Hello from a Snackbar",
                        Snackbar.LENGTH_LONG).show();
                break;
            case R.id.buttonFromSnackbarToToastP011:
                Snackbar snackbar=Snackbar.make(coordinatorLayoutP011,"Please, click to see a Toast",
                        Snackbar.LENGTH_LONG);
                snackbar.setAction(R.string.set_action_name, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                   Toast.makeText(P011Snackbar.this,"Hello from supersedes toast :)",
                           Toast.LENGTH_SHORT).show();
                    }
                });

                snackbar.show();
                break;
        }
    }
}

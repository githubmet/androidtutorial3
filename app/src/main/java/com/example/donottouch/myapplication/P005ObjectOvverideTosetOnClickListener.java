package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class P005ObjectOvverideTosetOnClickListener extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p005objectovveridetosetonclicklistener);

        Button buttonP005=(Button)findViewById(R.id.buttonP005);
        buttonP005.setOnClickListener(onClickListenerView);  //ilgili trigger i sadece kendimize
        //gore override yaptik. Actually That is simple but if you want to
    }
    //override just one word to start to write
    View.OnClickListener onClickListenerView= new View.OnClickListener(){  //This blok is only an object
        @Override
        public void onClick(View v) {
            Toast.makeText(P005ObjectOvverideTosetOnClickListener.this,"Hey Miyo pisi pisi:)",
                    Toast.LENGTH_LONG).show();
        }
    };

}

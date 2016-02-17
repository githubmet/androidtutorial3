package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class P001onSaveInstanceState extends Activity implements View.OnClickListener {
    Button buttonP001;
    TextView textViewP001;
    int counter=0;
    static final String COUNTER_INT_KEY="counterIntKey";
    static final String COUNTER_STRING_KEY="counterStringKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p001onsaveinstancestate);

        buttonP001=(Button)findViewById(R.id.buttonP001);
        textViewP001=(TextView)findViewById(R.id.textViewP001);
        buttonP001.setOnClickListener(this);

        if(savedInstanceState != null){
           counter= savedInstanceState.getInt(COUNTER_INT_KEY,0);
            textViewP001.setText(savedInstanceState.getString(COUNTER_STRING_KEY));
        }
        else{
            counter=0;
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==buttonP001.getId()){
            counter +=1;
            textViewP001.setText("You clicked the button "+counter+" times :)");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(COUNTER_INT_KEY,counter);
        outState.putString(COUNTER_STRING_KEY,textViewP001.getText().toString());
    }
}

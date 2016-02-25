package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class P012SetDataToParcelable extends Activity implements View.OnClickListener{
    EditText editTextNameP012;
    EditText editTextSurnameP012;
    EditText editTextAgeP012;
    public final static String STUDENT_PARCELABLE_DATA="student_Parcelable_Data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p012setdatatoparcelable);
        Button buttonSetDataP012= (Button)findViewById(R.id.buttonSetDataP012);
        editTextNameP012= (EditText)findViewById(R.id.editTextNameP012);
        editTextSurnameP012= (EditText)findViewById(R.id.editTextSurnameP012);
        editTextAgeP012= (EditText)findViewById(R.id.editTextAgeP012);
        buttonSetDataP012.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonSetDataP012){
            P012ParcelableStudent p012ParcelableStudent=new P012ParcelableStudent(
                    editTextNameP012.getText().toString(),
                    editTextSurnameP012.getText().toString(),
                    Integer.parseInt(editTextAgeP012.getText().toString())
            );
            Intent intent=new Intent(P012SetDataToParcelable.this,
                    P012GetDataFromParcelable.class);
            intent.putExtra(STUDENT_PARCELABLE_DATA,p012ParcelableStudent);
            startActivity(intent);
        }
    }
}

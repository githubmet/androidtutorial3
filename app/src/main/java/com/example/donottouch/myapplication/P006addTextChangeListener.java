package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class P006addTextChangeListener extends Activity implements TextWatcher {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p006addtextchangelistener);

        EditText editTextP006=(EditText)findViewById(R.id.editTextP006);
        editTextP006.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        Toast.makeText(P006addTextChangeListener.this,"beforeTextChanged",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        Toast.makeText(P006addTextChangeListener.this,"onTextChanged",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void afterTextChanged(Editable s) {
        Toast.makeText(P006addTextChangeListener.this,"afterTextChanged",Toast.LENGTH_SHORT).show();
    }
}

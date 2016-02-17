package com.example.donottouch.myapplication;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter arrayAdapter=ArrayAdapter.createFromResource(MainActivity.this,
                R.array.activity_name,android.R.layout.simple_list_item_1);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        try {
            Class className= Class.forName("com.example.donottouch.myapplication."+
                    l.getItemAtPosition(position));
            Intent intent =new Intent(MainActivity.this,className);
            startActivity(intent);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package com.example.donottouch.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class P000MapStringClass extends Activity {
    Map<String,MyP000Class> stringMyP000ClassMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.p000_map_string_class);
    }

    public void onClickMtdP000(View view) {
        stringMyP000ClassMap=new HashMap<>();
        stringMyP000ClassMap.put("one", new MyP000Class("name","surname"));
        stringMyP000ClassMap.put("two", new MyP000Class("name2","surname2"));
        stringMyP000ClassMap.put("three", new MyP000Class("name3","surname3"));
    }

    public void onClick2MtdP000(View view) {
        String name2=stringMyP000ClassMap.get("two").getName();
        String surname2=stringMyP000ClassMap.get("two").getSurname();

        Toast.makeText(this, name2+" "+surname2, Toast.LENGTH_SHORT).show();
    }


    public class MyP000Class {
        String name;
        String surname;

        public MyP000Class(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }
    }
}

package com.example.donottouch.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;

public class P012GetDataFromParcelable extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout=new RelativeLayout(this);
        TextView textView=new TextView(this);
        relativeLayout.addView(textView);
        setContentView(relativeLayout);

        Intent intent=getIntent();
        P012ParcelableStudent p012ParcelableStudent=(P012ParcelableStudent)intent
                .getParcelableExtra(P012SetDataToParcelable.STUDENT_PARCELABLE_DATA);

         String katar= "Student_Name="+p012ParcelableStudent.studentName+
                 "\nStudent Surname"+ p012ParcelableStudent.studentSurname+
                "\nStudent Age="+p012ParcelableStudent.studentAge;
        textView.setText(katar);
    }
}

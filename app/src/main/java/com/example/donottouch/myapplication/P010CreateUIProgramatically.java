package com.example.donottouch.myapplication;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Button;

public class P010CreateUIProgramatically extends Activity  {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout=new RelativeLayout(this);
        relativeLayout.setLayoutParams(getLayoutParamsForRelativeLayout());

        textView=new TextView(this);
        textView.setLayoutParams(getLayoutParamsForTextView());
        textView.setText("Personal information is not important");
        textView.setId(1);
        textView.setTypeface(Typeface.DEFAULT_BOLD);

        button=new Button(this);
        button.setLayoutParams(getLayoutParamsForButton());
        button.setText("I am a machine Baby");

        relativeLayout.addView(textView);
        relativeLayout.addView(button);
        setContentView(relativeLayout);
    }
    private RelativeLayout.LayoutParams getLayoutParamsForRelativeLayout(){
        RelativeLayout.LayoutParams konumRelativeLayout=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        return konumRelativeLayout;
    }
    private RelativeLayout.LayoutParams getLayoutParamsForTextView(){
        RelativeLayout.LayoutParams konumTextView=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        konumTextView.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        konumTextView.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        return konumTextView;
    }
    private RelativeLayout.LayoutParams getLayoutParamsForButton(){
        RelativeLayout.LayoutParams konumButton=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        konumButton.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        konumButton.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        konumButton.addRule(RelativeLayout.BELOW,textView.getId());
        return konumButton;
    }
}

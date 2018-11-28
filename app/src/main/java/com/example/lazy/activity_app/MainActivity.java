package com.example.lazy.activity_app;

import android.graphics.Color;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName() ;
    private Button button1,button2;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        relativeLayout=(RelativeLayout)findViewById(R.id.relativelayout);


    }


    public void setblue(View view) {
        relativeLayout.setBackgroundColor(Color.BLUE);
    }

    public void setgreen(View view) {
    relativeLayout.setBackgroundColor(Color.GREEN);
    }
}


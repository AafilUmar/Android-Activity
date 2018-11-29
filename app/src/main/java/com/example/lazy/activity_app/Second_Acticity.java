package com.example.lazy.activity_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class Second_Acticity extends AppCompatActivity {


    private static final String TAG = Second_Acticity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView textView =(TextView)findViewById(R.id.textView);
        StringBuilder msg =new StringBuilder("Welcome\n");
        Intent intent =getIntent();
        Bundle b = intent.getExtras();
         String name = b.getString("name");
         msg.append(name+"\n");

         int  age =b.getInt("age");
          msg.append(age);
          textView.setText(msg);


    }
}

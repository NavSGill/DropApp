package com.example.a1691713.dropapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent myNewINtent=getIntent();
        String TheName=myNewINtent.getStringExtra("name");
        TextView myoutput=(TextView)findViewById(R.id.output);

        myoutput.setText(TheName);
    }
}

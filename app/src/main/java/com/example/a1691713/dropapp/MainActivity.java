package com.example.a1691713.dropapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mydropdown=(Spinner)findViewById(R.id.dropdown);

        String[] names={"Circle","Triangle","Square","Rectangle"};
        ArrayAdapter<String> myadapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,names);

        mydropdown.setAdapter(myadapter);
    }
}

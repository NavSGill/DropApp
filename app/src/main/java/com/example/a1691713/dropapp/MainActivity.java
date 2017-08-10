package com.example.a1691713.dropapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mydropdown=(Spinner)findViewById(R.id.dropdown);

        String[] names={"Circle","Triangle","Square","Rectangle","Parallelogram","Trapezoid","Sector","Ellipse"};
        ArrayAdapter<String> myadapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,names);



        mydropdown.setAdapter(myadapter);
    }


    public void nextpage(View myV){


        Spinner mydropdown=(Spinner)findViewById(R.id.dropdown);

        Intent myIntent=new Intent(this,Main2Activity.class);
        String value1=mydropdown.getSelectedItem().toString();
        myIntent.putExtra("name",value1);

        //int SelectedPosition=mydropdown.getSelectedItemPosition();
      //  if (mydropdown.getSelectedItem().toString().equals("age")){
      //      ;
      //  }


        startActivity(myIntent);
    }
}

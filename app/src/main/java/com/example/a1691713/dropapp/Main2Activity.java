package com.example.a1691713.dropapp;

import android.content.Intent;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent myNewIntent = getIntent();
        String TheName = myNewIntent.getStringExtra("name");
        TextView myoutput = (TextView) findViewById(R.id.output);

        myoutput.setText("Area of"+"-"+TheName);

        //checking the Selection from dropdown

        EditText output1 = (EditText) findViewById(R.id.input1);
        EditText output2 = (EditText) findViewById(R.id.input2);
        EditText output3 = (EditText) findViewById(R.id.input3);
        EditText output4 = (EditText) findViewById(R.id.input4);
        EditText output5 = (EditText) findViewById(R.id.input5);
        EditText output6 = (EditText) findViewById(R.id.input6);

        switch(TheName.toString()){

            case "Circle":

                    output1.setVisibility(View.INVISIBLE);


                    output2.setVisibility(View.INVISIBLE);


                    output3.setVisibility(View.INVISIBLE);


                    output4.setVisibility(View.VISIBLE);


                    output5.setVisibility(View.INVISIBLE);


                    output6.setVisibility(View.INVISIBLE);

                break;
            case "Triangle":

                output1.setVisibility(View.VISIBLE);


                output2.setVisibility(View.INVISIBLE);


                output3.setVisibility(View.VISIBLE);


                output4.setVisibility(View.INVISIBLE);


                output5.setVisibility(View.INVISIBLE);


                output6.setVisibility(View.INVISIBLE);
                break;

            case "Square":

                output1.setVisibility(View.INVISIBLE);


                output2.setVisibility(View.INVISIBLE);


                output3.setVisibility(View.INVISIBLE);


                output4.setVisibility(View.INVISIBLE);


                output5.setVisibility(View.VISIBLE);


                output6.setVisibility(View.INVISIBLE);
                break;

            case "Rectangle":

                output1.setVisibility(View.INVISIBLE);


                output2.setVisibility(View.VISIBLE);


                output3.setVisibility(View.VISIBLE);


                output4.setVisibility(View.INVISIBLE);


                output5.setVisibility(View.INVISIBLE);


                output6.setVisibility(View.INVISIBLE);
                break;

            case "Parallelogram":

                output1.setVisibility(View.VISIBLE);


                output2.setVisibility(View.INVISIBLE);


                output3.setVisibility(View.VISIBLE);


                output4.setVisibility(View.INVISIBLE);


                output5.setVisibility(View.INVISIBLE);


                output6.setVisibility(View.INVISIBLE);
                break;

            case "Trapezoid":

                output1.setVisibility(View.VISIBLE);


                output2.setVisibility(View.INVISIBLE);


                output3.setVisibility(View.VISIBLE);


                output4.setVisibility(View.INVISIBLE);


                output5.setVisibility(View.VISIBLE);


                output6.setVisibility(View.INVISIBLE);
                break;

            case "Ellipse":

                output1.setVisibility(View.VISIBLE);


                output2.setVisibility(View.INVISIBLE);


                output3.setVisibility(View.INVISIBLE);


                output4.setVisibility(View.INVISIBLE);


                output5.setVisibility(View.VISIBLE);


                output6.setVisibility(View.INVISIBLE);
                break;

            case "Sector":

                output1.setVisibility(View.INVISIBLE);


                output2.setVisibility(View.INVISIBLE);


                output3.setVisibility(View.INVISIBLE);


                output4.setVisibility(View.VISIBLE);


                output5.setVisibility(View.INVISIBLE);


                output6.setVisibility(View.VISIBLE);
                break;
        }

        }
//Calculate all vaideos

    public void calbtn(View myv){


        TextView addResult = (TextView)findViewById(R.id.txtResult);
        Button btnAdd = (Button)findViewById(R.id.calA);
        Intent myNewIntent = getIntent();
        String TheName = myNewIntent.getStringExtra("name");
        TextView myoutput = (TextView) findViewById(R.id.output);

        EditText output1 = (EditText) findViewById(R.id.input1);
        EditText output2 = (EditText) findViewById(R.id.input2);
        EditText output3 = (EditText) findViewById(R.id.input3);
        EditText output4 = (EditText) findViewById(R.id.input4);
        EditText output5 = (EditText) findViewById(R.id.input5);
        EditText output6 = (EditText) findViewById(R.id.input6);

        myoutput.setText(TheName);

        double base,width,height,radius,area,angle,result;


        switch(TheName.toString())

        {
            case "Circle":

                    radius = Double.parseDouble(output4.getText().toString());


                    result = 3.14159*radius;
                    addResult.setText(Double.toString(result));
                break;
            case "Triangle":
                base = Double.parseDouble(output1.getText().toString());
                height = Double.parseDouble(output3.getText().toString());

                result=0.5*base*height;
                addResult.setText(Double.toString(result));
                break;

            case"Square":
                area=Double.parseDouble(output5.getText().toString());
                result=area*area;
                addResult.setText(Double.toString(result));
                break;
            case "Rectangle":
                width=Double.parseDouble(output2.getText().toString());
                height=Double.parseDouble(output3.getText().toString());

                result=width*height;
                addResult.setText(Double.toString(result));
                break;
            case "Parallelogram":
                base=Double.parseDouble(output1.getText().toString());
                height=Double.parseDouble(output3.getText().toString());

                result=base*height;
                addResult.setText(Double.toString(result));
                break;
            case "Trapezoid":
                area=Double.parseDouble(output5.getText().toString());
                base=Double.parseDouble(output1.getText().toString());
                height=Double.parseDouble(output3.getText().toString());

                result=0.5*(area+base)*height;
                addResult.setText(Double.toString(result));
                break;
            case "Ellipse":
                area=Double.parseDouble(output5.getText().toString());
                base=Double.parseDouble(output1.getText().toString());
                result=3.14159*area*base;
                addResult.setText(Double.toString(result));
                break;
            case "Sector":
                radius = Double.parseDouble(output4.getText().toString());
                angle= Double.parseDouble(output6.getText().toString());
                result=0.5*radius*radius*angle;
                addResult.setText(Double.toString(result));
                break;
     }

    }
    }

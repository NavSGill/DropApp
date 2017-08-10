package com.example.a1691713.dropapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent myNewIntent = getIntent();
        String TheName = myNewIntent.getStringExtra("name");
        TextView myoutput = (TextView) findViewById(R.id.output);

        myoutput.setText(TheName);




        if (TheName.toString().equalsIgnoreCase("Circle")) ;
        {
            TextView output1 = (TextView) findViewById(R.id.input1);
            output1.setVisibility(View.INVISIBLE);

            TextView output2 = (TextView) findViewById(R.id.input2);
            output2.setVisibility(View.INVISIBLE);

            TextView output3 = (TextView) findViewById(R.id.input3);
            output3.setVisibility(View.INVISIBLE);

            TextView output4 = (TextView) findViewById(R.id.input4);
            output4.setVisibility(View.VISIBLE);

            TextView output5 = (TextView) findViewById(R.id.input5);
            output5.setVisibility(View.INVISIBLE);

            TextView output6 = (TextView) findViewById(R.id.input6);
            output6.setVisibility(View.INVISIBLE);

        }


        if (TheName.toString().equalsIgnoreCase("Triangle")) ;
        {
            TextView output1 = (TextView) findViewById(R.id.input1);
            output1.setVisibility(View.VISIBLE);

            TextView output2 = (TextView) findViewById(R.id.input2);
            output2.setVisibility(View.INVISIBLE);

            TextView output3 = (TextView) findViewById(R.id.input3);
            output3.setVisibility(View.VISIBLE);

            TextView output4 = (TextView) findViewById(R.id.input4);
            output4.setVisibility(View.INVISIBLE);

            TextView output5 = (TextView) findViewById(R.id.input5);
            output5.setVisibility(View.INVISIBLE);

            TextView output6 = (TextView) findViewById(R.id.input6);
            output6.setVisibility(View.INVISIBLE);

             }
//
            // if(TheName.toString().equals("Square"));
            // {
            //     TextView output1=(TextView)findViewById(R.id.input1);
            //     output1.setVisibility(View.INVISIBLE);
//
            //     TextView output2=(TextView)findViewById(R.id.input2);
            //     output2.setVisibility(View.INVISIBLE);
//
            //     TextView output3=(TextView)findViewById(R.id.input3);
            //     output3.setVisibility(View.INVISIBLE);
//
            //     TextView output4=(TextView)findViewById(R.id.input4);
            //     output4.setVisibility(View.INVISIBLE);
//
            //     TextView output5=(TextView)findViewById(R.id.input5);
            //     output5.setVisibility(View.VISIBLE);
//
            //     TextView output6=(TextView)findViewById(R.id.input6);
            //     output6.setVisibility(View.INVISIBLE);
//
//
            // }
//
            // if(TheName.toString().equals("Rectangle"));
            // {
            //     TextView output1=(TextView)findViewById(R.id.input1);
            //     output1.setVisibility(View.INVISIBLE);
//
            //     TextView output2=(TextView)findViewById(R.id.input2);
            //     output2.setVisibility(View.VISIBLE);
//
            //     TextView output3=(TextView)findViewById(R.id.input3);
            //     output3.setVisibility(View.VISIBLE);
//
            //     TextView output4=(TextView)findViewById(R.id.input4);
            //     output4.setVisibility(View.INVISIBLE);
//
            //     TextView output5=(TextView)findViewById(R.id.input5);
            //     output5.setVisibility(View.INVISIBLE);
//
            //     TextView output6=(TextView)findViewById(R.id.input6);
            //     output6.setVisibility(View.INVISIBLE);
//
//
//
            // }
            // if(TheName.toString().equals("Parallelogram"));
            // {
            //     TextView output1=(TextView)findViewById(R.id.input1);
            //     output1.setVisibility(View.VISIBLE);
//
            //     TextView output2=(TextView)findViewById(R.id.input2);
            //     output2.setVisibility(View.INVISIBLE);
//
            //     TextView output3=(TextView)findViewById(R.id.input3);
            //     output3.setVisibility(View.VISIBLE);
//
            //     TextView output4=(TextView)findViewById(R.id.input4);
            //     output4.setVisibility(View.INVISIBLE);
//
            //     TextView output5=(TextView)findViewById(R.id.input5);
            //     output5.setVisibility(View.INVISIBLE);
//
            //     TextView output6=(TextView)findViewById(R.id.input6);
            //     output6.setVisibility(View.INVISIBLE);
//
            // }
//
            // if(TheName.toString().equals("Trapezoid"));
            // {
            //     TextView output1=(TextView)findViewById(R.id.input1);
            //     output1.setVisibility(View.VISIBLE);
//
            //     TextView output2=(TextView)findViewById(R.id.input2);
            //     output2.setVisibility(View.INVISIBLE);
//
            //     TextView output3=(TextView)findViewById(R.id.input3);
            //     output3.setVisibility(View.VISIBLE);
//
            //     TextView output4=(TextView)findViewById(R.id.input4);
            //     output4.setVisibility(View.INVISIBLE);
//
            //     TextView output5=(TextView)findViewById(R.id.input5);
            //     output5.setVisibility(View.VISIBLE);
//
            //     TextView output6=(TextView)findViewById(R.id.input6);
            //     output6.setVisibility(View.INVISIBLE);
//
//
            // }
            // if(TheName.toString().equals("Ellipse"));
            // {
            //     TextView output1=(TextView)findViewById(R.id.input1);
            //     output1.setVisibility(View.VISIBLE);
//
            //     TextView output2=(TextView)findViewById(R.id.input2);
            //     output2.setVisibility(View.INVISIBLE);
//
            //     TextView output3=(TextView)findViewById(R.id.input3);
            //     output3.setVisibility(View.INVISIBLE);
//
            //     TextView output4=(TextView)findViewById(R.id.input4);
            //     output4.setVisibility(View.INVISIBLE);
//
            //     TextView output5=(TextView)findViewById(R.id.input5);
            //     output5.setVisibility(View.VISIBLE);
//
            //     TextView output6=(TextView)findViewById(R.id.input6);
            //     output6.setVisibility(View.INVISIBLE);
//
//
            // }
//
            // if(TheName.toString().equals("Sector"));
            // {
            //     TextView output1=(TextView)findViewById(R.id.input1);
            //     output1.setVisibility(View.INVISIBLE);
//
            //     TextView output2=(TextView)findViewById(R.id.input2);
            //     output2.setVisibility(View.INVISIBLE);
//
            //     TextView output3=(TextView)findViewById(R.id.input3);
            //     output3.setVisibility(View.INVISIBLE);
//
            //     TextView output4=(TextView)findViewById(R.id.input4);
            //     output4.setVisibility(View.VISIBLE);
//
            //     TextView output5=(TextView)findViewById(R.id.input5);
            //     output5.setVisibility(View.INVISIBLE);
//
            //     TextView output6=(TextView)findViewById(R.id.input6);
            //     output6.setVisibility(View.VISIBLE);
//
//
//
            // }


        }

    }

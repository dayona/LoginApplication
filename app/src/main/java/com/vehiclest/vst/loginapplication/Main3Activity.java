package com.vehiclest.vst.loginapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final ConstraintLayout my_layout =findViewById(R.id.main_activity);

        final LinearLayout split_color =findViewById(R.id.split_color_layout);




        Button my_button =findViewById(R.id.my_button1);
        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                split_color.setVisibility(View.GONE);
                my_layout.setBackgroundColor(getResources().getColor(R.color.green));


            }
        });

        Button my_button1 = findViewById(R.id.my_button2);
        my_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                split_color.setVisibility(View.GONE);
                my_layout.setBackgroundColor(getResources().getColor(R.color.blue));

            }
        });
       Button my_button2 =findViewById(R.id.my_button3);
       my_button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               LinearLayout split_color =findViewById(R.id.split_color_layout);
               split_color.setVisibility(View.VISIBLE);

           }
       });

       Button my_exit_button =findViewById(R.id.exit_button);
        final DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        finish();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        break;
                }
            }
        };

        my_exit_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
               builder.setMessage("Are you sure?").setPositiveButton("Yes", dialogClickListener)
                       .setNegativeButton("No", dialogClickListener).show();
           }
       });


    }

    @Override
    public void onBackPressed() {

    }
}

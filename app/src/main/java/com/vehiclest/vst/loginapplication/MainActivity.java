package com.vehiclest.vst.loginapplication;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username = "Dayona";
    String password = "dayona777";
    String username1 = "justIn";
    String password1 ="3! 34";
    String et_username;
    String et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout mylayout = findViewById(R.id.Io_main_activity);
        final EditText editTextView =  findViewById(R.id.et_username);
        final EditText etPass= findViewById(R.id.et_password);





        Button mybutton = findViewById(R.id.my_button);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_username = editTextView.getText().toString();
                et_password = etPass.getText().toString();
                {

                    if (et_username.equals(username)) {
                        if (et_password.equals(password)) {

                            Intent myintent = new Intent(MainActivity.this, Main2Activity.class);
                            startActivity(myintent);


                        } else {
                            Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();

                        }


                    }


                    if (et_username.equals(username1)) {
                        if (et_password.equals(password1)) {

                            Intent myintent = new Intent(MainActivity.this, Main3Activity.class);
                            startActivity(myintent);
                            finish();

                        } else {
                            Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();

                        }


                    }
                }

            }

        });
    }
}

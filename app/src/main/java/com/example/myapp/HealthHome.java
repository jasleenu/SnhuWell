package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HealthHome extends AppCompatActivity {
private static Button healthappt,btn_myappointments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        healthappt = (Button) findViewById(R.id.button6);
        healthappt.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              BookAppointment();
                                          }
                                      });

        btn_myappointments = (Button) findViewById(R.id.btn_myappointments);
        btn_myappointments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoMyAppointments();
            }
        });


                FloatingActionButton fab = findViewById(R.id.fab);
                fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void BookAppointment(){
        // Toast.makeText(this, "Hello dear", Toast.LENGTH_SHORT).show();
        Intent healthappt =  new Intent(this,BookAppointment.class);
        startActivity(healthappt);
    }

    public void  GotoMyAppointments(){
        Intent myappointments =  new Intent(this,Myappointments.class);
        startActivity(myappointments);
    }
}

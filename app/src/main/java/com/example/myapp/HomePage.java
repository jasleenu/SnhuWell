package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    private static Button healthbtn;
    private static Button ourstaff, homebtn;
    private static Button contactus, hchallengebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        healthbtn = (Button) findViewById(R.id.button2);
        healthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoHealthHome();
            }
        });

        homebtn = (Button) findViewById(R.id.button4);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoHome();
            }
        });

        hchallengebtn =(Button) findViewById(R.id.button3);
        hchallengebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HealthChallenge();
            }
        });


        ourstaff =(Button) findViewById(R.id.button11);
        ourstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoOurStaff();
            }
        });
        contactus = (Button) findViewById(R.id.button9);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoContactUs();
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
public void GotoHealthHome(){
    Intent healthintent =  new Intent(this,HealthHome.class);
    startActivity(healthintent);
    }
    public void GotoContactUs(){
        Intent contactus =  new Intent(this,Contact_us.class);
        startActivity(contactus);
    }
    public void GotoOurStaff(){
        Intent ourstaff = new Intent(this, OurStaff.class);
        startActivity(ourstaff);
    }

    public void HealthChallenge(){
        Intent healthChallenge  = new Intent (this, Contact_us.class);
        startActivity(healthChallenge);
    }
    public void GotoHome(){
        Intent homeicn = new Intent (this,Home.class);
        startActivity(homeicn);
    }
}

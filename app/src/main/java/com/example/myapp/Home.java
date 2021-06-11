package com.example.myapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity {
    private static ImageView health_img, counselling_img,immun;
    private static ImageView ourstaff,hours, resources;
    private static ImageView contactus, fchallenge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        health_img = (ImageView) findViewById(R.id.img_health);
        health_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoHealthHome();
            }
        });
        counselling_img = (ImageView) findViewById(R.id.img_counseling) ;
        counselling_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoCounselling();
            }
        });
       fchallenge  = (ImageView) findViewById(R.id.img_fitnesschallenge);
        fchallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HealthChallenge();
            }
        });

        hours=  (ImageView) findViewById(R.id.img_hours);
        hours.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
         GotoHours();
            }
 });

        resources = (ImageView) findViewById(R.id.img_resources) ;
        resources.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             GotoResources();
                                         }
                                     });

        ourstaff = (ImageView) findViewById(R.id.img_staff);
        ourstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoOurStaff();
            }
        });
        contactus = (ImageView) findViewById(R.id.img_contact);
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoContactUs();
            }


        });

 immun = (ImageView) findViewById(R.id.img_immun);
 immun.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         GotoImmunizations();
     }
 });
      /*  BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 16;

        Bitmap bm = BitmapFactory.decodeResource(getResources(),
                R.id.img_health, options);
        health_img.setImageBitmap(bm);

        Bitmap bm2 = BitmapFactory.decodeResource(getResources(),
                R.id.img_counseling, options);
        counselling_img.setImageBitmap(bm2);

        Bitmap bm3 = BitmapFactory.decodeResource(getResources(),
                R.id.img_immun, options);
        immun.setImageBitmap(bm3);

        Bitmap bm7 = BitmapFactory.decodeResource(getResources(),
                R.id.img_resources, options);
        resources.setImageBitmap(bm7);

        Bitmap bm4 = BitmapFactory.decodeResource(getResources(),
                R.id.img_staff, options);
        ourstaff.setImageBitmap(bm4);

        Bitmap bm5 = BitmapFactory.decodeResource(getResources(),
                R.id.img_hours, options);
        hours.setImageBitmap(bm5);


        Bitmap bm6 = BitmapFactory.decodeResource(getResources(),
                R.id.img_contact, options);
        contactus.setImageBitmap(bm6);



        Bitmap bm8 = BitmapFactory.decodeResource(getResources(),
                R.id.img_fitnesschallenge, options);
        fchallenge.setImageBitmap(bm8);*/



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
        Intent healthChallenge  = new Intent (this, FitnessMain.class);
        startActivity(healthChallenge);
    }
    public void GotoHome(){
        Intent homeicn = new Intent (this,Home.class);
        startActivity(homeicn);
    }
    public void  GotoCounselling(){
        Intent counseling = new Intent (this,CounsellingHome.class);
        startActivity(counseling);
    }
    public void  GotoHours(){
        Intent hours = new Intent (this,hours.class);
        startActivity(hours);
    }

    public void  GotoResources(){
        Intent resources = new Intent (this,Resources.class);
        startActivity(resources);
    }
    public void  GotoImmunizations(){
        Intent immun = new Intent (this,Immunizations.class);
        startActivity(immun);
    }
}

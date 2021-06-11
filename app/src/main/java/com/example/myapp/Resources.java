package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Resources extends AppCompatActivity implements View.OnClickListener{
private static Button btn_insomnia, btn_depression, btn_eatingdisorder, btn_homesick, btn_anger, btn_drugalcohol;
private  String pdf_url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);



        btn_insomnia = (Button) findViewById(R.id.btn_insomnia);
        Drawable drawable = ContextCompat.getDrawable(this,R.drawable.insomnia);
        drawable.setBounds(0, 0, 80,80);
        btn_insomnia.setCompoundDrawables(drawable, null, null, null);
        drawable.setTint(Color.rgb(243,201,77));


        btn_depression= (Button) findViewById(R.id.btn_depression);
        Drawable dep = ContextCompat.getDrawable(this,R.drawable.depression2);
        dep.setBounds(0, 0, 80,80);
        btn_depression.setCompoundDrawables(dep, null, null, null);
        dep.setTint(Color.rgb(243,201,77));


        btn_eatingdisorder= (Button) findViewById(R.id.btn_eatingdisorder);
        Drawable eating = ContextCompat.getDrawable(this,R.drawable.eatingdisorder2);
        eating.setBounds(0, 0, 90,90);
        btn_eatingdisorder.setCompoundDrawables(eating, null, null, null);
        eating.setTint(Color.rgb(243,201,77));

        btn_homesick= (Button) findViewById(R.id.btn_homesick);
        Drawable homesick = ContextCompat.getDrawable(this,R.drawable.homesick3);
        homesick.setBounds(0, 0, 80,80);
        btn_homesick.setCompoundDrawables(homesick, null, null, null);
        homesick.setTint(Color.rgb(243,201,77));

        btn_anger= (Button) findViewById(R.id.btn_anger);
        Drawable anger = ContextCompat.getDrawable(this,R.drawable.anger3);
        anger.setBounds(0, 0, 100,100);
        btn_anger.setCompoundDrawables(anger, null, null, null);
        anger.setTint(Color.rgb(243,201,77));


        btn_drugalcohol= (Button) findViewById(R.id.btn_drugalcohol);
        Drawable drug = ContextCompat.getDrawable(this,R.drawable.alcohol);
        drug.setBounds(0, 0, 120,120);
        btn_drugalcohol.setCompoundDrawables(drug, null, null, null);
        drug.setTint(Color.rgb(243,201,77));



        btn_depression.setOnClickListener(this);
        btn_homesick.setOnClickListener(this);
        btn_anger.setOnClickListener(this);
        btn_drugalcohol.setOnClickListener(this);
        btn_insomnia.setOnClickListener(this);
        btn_eatingdisorder.setOnClickListener(this);


    }

    public void setPdf_url(String pdf_url){
        this.pdf_url=pdf_url;
    }

    public String getPdf_url(){
       return this.pdf_url;
    }
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_insomnia:
                pdf_url = "http://www.sleepwithmepodcast.com/";
                break;
            case R.id.btn_depression:
                pdf_url = "http://www.depressiontoolkit.org/lifespan/college.asp/";
                break;
            case R.id.btn_anger:
                pdf_url = "https://www.nhs.uk/Conditions/stress-anxiety-depression/Pages/controlling-anger.aspx";
                break;
            case R.id.btn_drugalcohol:
                pdf_url = "https://www.recoveryconnection.com/substance-abuse/drug-classes/opiate-addiction-treatment-withdrawal";
                break;
            case R.id.btn_homesick:
                pdf_url = "https://www2.warwick.ac.uk/services/counselling/informationpages/homesickness";
                break;
            case R.id.btn_eatingdisorder:
                pdf_url = "https://www.eatingdisorderhope.com/recovery/self-help-tools-skills-tips";
                break;
            case 0:
                pdf_url=" ";


        }
        GotoResourceDetail();

    }


    public void GotoResourceDetail( ) {

        Intent resourcesdtl = new Intent(this, ResourceDetail.class);
        resourcesdtl.putExtra("url",pdf_url);
        startActivity(resourcesdtl);

    }
}

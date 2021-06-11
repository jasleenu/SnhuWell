package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;

public class FitnessMain extends AppCompatActivity {
    private static Button btn_insomnia, btn_depression, btn_eatingdisorder, btn_homesick, btn_anger, btn_drugalcohol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_main);


        btn_insomnia = (Button) findViewById(R.id.btn_insomnia);
        Drawable drawable = ContextCompat.getDrawable(this,R.drawable.steps4);
        drawable.setBounds(0, 0, 100,100);
        btn_insomnia.setCompoundDrawables(drawable, null, null, null);
       drawable.setTint(Color.rgb(243,201,77));


        btn_depression= (Button) findViewById(R.id.btn_depression);
        Drawable dep = ContextCompat.getDrawable(this,R.drawable.pushups);
        dep.setBounds(0, 0, 100,100);
        btn_depression.setCompoundDrawables(dep, null, null, null);
        dep.setTint(Color.rgb(243,201,77));


        btn_eatingdisorder= (Button) findViewById(R.id.btn_eatingdisorder);
        Drawable eating = ContextCompat.getDrawable(this,R.drawable.run);
        eating.setBounds(0, 0, 90,90);
        btn_eatingdisorder.setCompoundDrawables(eating, null, null, null);
        eating.setTint(Color.rgb(243,201,77));

        btn_homesick= (Button) findViewById(R.id.btn_homesick);
        Drawable homesick = ContextCompat.getDrawable(this,R.drawable.walk3);
        homesick.setBounds(0, 0, 110,110);
        btn_homesick.setCompoundDrawables(homesick, null, null, null);
        homesick.setTint(Color.rgb(243,201,77));

        btn_anger= (Button) findViewById(R.id.btn_anger);
        Drawable anger = ContextCompat.getDrawable(this,R.drawable.squats);
        anger.setBounds(0, 0, 100,100);
        btn_anger.setCompoundDrawables(anger, null, null, null);
        anger.setTint(Color.rgb(243,201,77));


        btn_drugalcohol= (Button) findViewById(R.id.btn_drugalcohol);
        Drawable drug = ContextCompat.getDrawable(this,R.drawable.exercise);
        drug.setBounds(0, 0, 120,120);
        btn_drugalcohol.setCompoundDrawables(drug, null, null, null);
        drug.setTint(Color.rgb(243,201,77));

    }
}

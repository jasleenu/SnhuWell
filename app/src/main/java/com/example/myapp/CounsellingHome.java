package com.example.myapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.InputType;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class CounsellingHome extends AppCompatActivity {
    private static TextView apptdate,appttime,et_name,et_studentid;
    private static Spinner sp_counsellor;
    private static Button btn_bookapptok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselling_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        et_name = (EditText) findViewById(R.id.et_name);
        et_studentid = (EditText) findViewById(R.id.et_studentid);
        apptdate = (TextView) findViewById(R.id.tv_apptdate);
        appttime = (TextView) findViewById(R.id.tv_appttime) ;

        apptdate.setInputType(InputType.TYPE_NULL);
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        apptdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_name.onEditorAction(EditorInfo.IME_ACTION_DONE);
                et_studentid.onEditorAction(EditorInfo.IME_ACTION_DONE);
                DatePickerDialog datePickerDialog = new DatePickerDialog(CounsellingHome.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        month = month +1;
                        String date = month+"/"+ day+"/"+year;
                        apptdate.setText(date);

                    }

                },year, month, day);
                datePickerDialog.show();
            }
        });
        appttime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_name.onEditorAction(EditorInfo.IME_ACTION_DONE);
                et_studentid.onEditorAction(EditorInfo.IME_ACTION_DONE);

                TimePickerDialog picker;
                final Calendar cldr = Calendar.getInstance();
                int hour = cldr.get(Calendar.HOUR_OF_DAY);
                int minutes = cldr.get(Calendar.MINUTE);
                // time picker dialog
                picker = new TimePickerDialog(CounsellingHome.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker tp, int sHour, int sMinute) {
                                appttime.setText(sHour + ":" + sMinute);
                            }
                        }, hour, minutes, true);
                picker.show();
            }
        });


        Spinner sp_counsellor = (Spinner) findViewById(R.id.sp_counsellor);
        ArrayAdapter<String> counselloradapter = new ArrayAdapter<String>(CounsellingHome.this, R.layout.spinner_appts,getResources().getStringArray(R.array.counsellors));
        counselloradapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        sp_counsellor.setAdapter(counselloradapter);
        sp_counsellor.setPrompt("Select Counselor");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button btn_bookapptok = (Button) findViewById(R.id.btn_bookapptok);
        btn_bookapptok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoApptSuccess();
            }
        });
    }
    public void GotoApptSuccess(){
        Intent Apptokintent =  new Intent(this,MynewAppointment.class);
        startActivity(Apptokintent);
    }

}

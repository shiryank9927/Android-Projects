package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ImageButton imageButton;
    DatePicker datePicker;
    TimePicker timepicker;
    String date,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageview);
        imageButton = findViewById(R.id.imagebutton);
        datePicker = findViewById(R.id.datepicker);
        timepicker = findViewById(R.id.time);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Image View is clicked", Toast.LENGTH_SHORT).show();

            }
        });

        Calendar calendar=Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                date=datePicker.getDayOfMonth()+"/"+datePicker.getMonth()+"/"+datePicker.getYear();
                Toast.makeText(MainActivity.this,date, Toast.LENGTH_SHORT).show();

            }
        });

        timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                time="time is:"+i+":"+i1;
                Toast.makeText(MainActivity.this,time, Toast.LENGTH_SHORT).show();
            }
        });

        imageView.setImageResource(R.drawable.ic_launcher_background);


    }
}







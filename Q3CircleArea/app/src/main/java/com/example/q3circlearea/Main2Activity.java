package com.example.q3circlearea;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity");


        area = findViewById(R.id.a);


        Intent intent= getIntent();
        String text = intent.getStringExtra("TEXT");



        area.setText("TEXT: "+25);


    }
}

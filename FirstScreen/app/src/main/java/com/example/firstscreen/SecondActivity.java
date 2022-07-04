package com.example.firstscreen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        message = findViewById(R.id.message);
//        next= findViewById(R.id.next);
//        previous = findViewById(R.id.pre);

        Intent intent= getIntent();
        String text = intent.getStringExtra("TEXT");

        message.setText("TEXT: "+text);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
    });
}}

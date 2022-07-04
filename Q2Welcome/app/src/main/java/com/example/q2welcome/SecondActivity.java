package com.example.q2welcome;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Second Activity");


        message= findViewById(R.id.message);

        Intent intent= getIntent();
        String text = intent.getStringExtra("TEXT");

        message.setText("TEXT: "+text);

    }
}

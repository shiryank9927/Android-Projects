package com.example.registation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Display extends AppCompatActivity {

    EditText name,email,phone;
    RadioButton male,female,others;
    CheckBox cricket,football,netflix;
    Spinner college;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        hobbies=findViewById(R.id.Hobbis);
        gender=findViewById(R.id.gender);
        college = findViewById(R.id.college);
        submit = findViewById(R.id.submit);

    }
}

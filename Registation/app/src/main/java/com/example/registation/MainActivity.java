package com.example.registation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    EditText name, email, phone;
    RadioButton male, female, others;
    CheckBox cricket, football, netflix;
    Spinner college;
    Button submit;
    TextView gender;


    String names[] = {"Select college", "MIET", "NIET", "DU"};
    String getname, getemail, getphone, getGender, getcricket, getfootball, getnetflix, hobs = "", getcollege;
    ArrayList hobbies = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        others = findViewById(R.id.others);
        cricket = findViewById(R.id.cricket);
        football = findViewById(R.id.football);
        netflix = findViewById(R.id.netflix);
        college = findViewById(R.id.college);
        submit = findViewById(R.id.submit);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        college.setAdapter(arrayAdapter);


        college.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().equals("")) {
                    name.setError("Field Mandatory");
                } else {
                    getname = name.getText().toString();

                }

                if (phone.getText().toString().equals("")) {
                    phone.setError("Field Mandatory");
                } else {
                    getphone = phone.getText().toString();
                }

                if (male.isChecked()) {
                    getGender = "male";

                } else if (female.isChecked()) {
                    getGender = "female";
                } else if (others.isChecked()) {
                    getGender = "others";
                }

                if (football.isChecked()) {
                    hobbies.add("cricket");

                } else if (football.isChecked()) {
                    hobbies.add("football");
                } else if (netflix.isChecked()) {
                    hobbies.add("netflix");
                }
            }

            for (int i = 0; i < hobbies.size(); i++) {
                hobs = hobs + "" + "" + hobbies.get(i);
                Toast.makeText(MainActivity.this, hobs, Toast.LENGTH_SHORT);
                }

                Intent intent = new Intent(MainActivity.this, Display.class);
                intent.putExtra("name", getname);
                intent.putExtra("email", getemail);
                intent.putExtra("phone", getphone);
                intent.putExtra("gender", getGender);
                intent.putExtra("hobbies", hobs);
                intent.putExtra("college", getcollege);
                startActivity(intent);
                finish();

    }
}

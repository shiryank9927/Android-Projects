package com.example.ssc5q2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TextView, TextView1;
     EditText Ed1, Ed2;
    Button bt1, bt2;
    String nickname, nicky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView=findViewById(R.id.Textview);
        TextView1=findViewById(R.id.Textview1);
        Ed1=findViewById(R.id.Ed1);
        Ed2=findViewById(R.id.Ed2);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 nickname = Ed1.getText().toString().trim();
                 nicky = Ed2.getText().toString().trim();


            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                SharedPreferences pref1 = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                pref.edit().putString("NICKNAME", nickname).apply();
                pref1.edit().putString("NICKY", nicky).apply();

                String uty = pref.getString("NICKNAME", "");
                String uty1 = pref.getString("NICKY", "");
                TextView.setText(uty);
                TextView1.setText(uty1);



            }
        });



        }
    }


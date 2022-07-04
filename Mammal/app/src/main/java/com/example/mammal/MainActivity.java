package com.example.mammal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, age, weight;
    Button submit;
    String getname;
    int getage;
    double getweight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = name.findViewById(R.id.name);
        age = age.findViewById(R.id.age);
        weight = weight.findViewById(R.id.weight);
        submit = submit.findViewById(R.id.submit);

        submit.setOnClickListener((view)-> {
            getname = name.getText().toString();
            getage = Integer.parseInt(age.getText().toString());
            getweight = Integer.parseInt(weight.getText().toString());

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("name"));
            intent.putExtra(Intent.EXTRA_TEXT, getage);
            intent.putExtra(Intent.EXTRA_TEXT, getname);
            intent.putExtra(Intent.EXTRA_TEXT, getweight);
            intent.setType("message/rfc");
            Intent chooser = intent.createChooser(intent, "send message");
            startActivity(chooser);

        });
    }
}

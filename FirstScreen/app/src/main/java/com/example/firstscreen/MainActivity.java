//package com.example.firstscreen;
//
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class MainActivity extends AppCompatActivity {
//
//     EditText message;
//     Button next;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("First Activity");
//
//         message= findViewById(R.id.message);
//          next = findViewById(R.id.button);
//
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                String text = message.getText().toString();
//                intent.putExtra("TEXT", text);
//                startActivity(intent);
//            }
//        });
//    }
//}

package com.example.firstscreen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstscreen.R;

public class MainActivity extends AppCompatActivity {

    EditText message;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");


        message=findViewById(R.id.message);
        submit=findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = message.getText().toString();


                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("TEXT", text);
                startActivity(intent);
            }
        });
    }
}


package com.example.q3circlearea;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private  EditText Radius;
   private Button Area;
   double radius,area;
   TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("First Activity");


        Area=findViewById(R.id.a);
        Radius=findViewById(R.id.r);
        res= findViewById(R.id.res);

        Area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String text=Radius.getText().toString();
//                Area.setText(text);
////               String a = "25";
//               String a = Double.toString(Double.parseDouble(text)*Double.parseDouble(text)*3.14);
//                Intent i = new Intent(MainActivity.this, Main2Activity.class);
//                getIntent().putExtra("TEX",a);



                radius=Double.parseDouble(Radius.getText().toString());
                area=3.14*(radius*radius);


                res.setText("TEXT: "+area);

            }
        });
    }
}

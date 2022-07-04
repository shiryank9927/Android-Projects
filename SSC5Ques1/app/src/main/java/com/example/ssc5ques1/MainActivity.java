package com.example.ssc5ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView images, image2, image3, image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        images=findViewById(R.id.images);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
        images.setImageResource(R.drawable.images);
        image2.setImageResource(R.drawable.image2);
        image3.setImageResource(R.drawable.image3);
        image4.setImageResource(R.drawable.image4);



    }
}

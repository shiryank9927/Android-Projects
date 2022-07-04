package com.example.sendmessagecorrect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    EditText phnnumber,message;
    Button send;
    String getphnnumber[]={"",""};
    String getmessage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phnnumber=findViewById(R.id.phnnumber);
        message=findViewById(R.id.message);
        send=findViewById(R.id.send);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getphnnumber[0]=phnnumber.getText().toString();
                getmessage=message.getText().toString();



                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("message"));
                intent.putExtra(Intent.EXTRA_TEXT,getphnnumber);
                intent.putExtra(Intent.EXTRA_TEXT,getmessage);
                intent.setType("message/rfc822");
                Intent chooser=Intent.createChooser(intent,"send message");
                startActivity(chooser);
            }
        });


    }
}

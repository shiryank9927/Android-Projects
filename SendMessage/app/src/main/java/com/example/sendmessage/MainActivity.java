package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText phnnumber,message;
    Button send;
    String getmessage;
    int getphnnumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message=message.findViewById(R.id.message);
        phnnumber=phnnumber.findViewById(R.id.phnnumber);
        send=send.findViewById(R.id.send);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getmessage=message.getText().toString();
                getphnnumber=Integer.parseInt(phnnumber.getText().toString());

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("message"));
                intent.putExtra(Intent.EXTRA_TEXT,getphnnumber);
                intent.putExtra(Intent.EXTRA_TEXT,getmessage);
                intent.setType("message/rfc");
                Intent chooser=Intent.createChooser(intent,"Send message");
                startActivity(chooser);

            }
        });



    }
}

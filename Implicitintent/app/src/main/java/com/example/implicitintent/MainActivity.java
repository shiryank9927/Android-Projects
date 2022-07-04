package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText to,subject,content;
    Button submit;
    String getto[]={"",""};
    String getsubject,getcontent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        to=findViewById(R.id.to);
        subject=findViewById(R.id.subject);
        content=findViewById(R.id.content);
        submit=findViewById(R.id.submit);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getto[0]=to.getText().toString();
                getsubject=to.getText().toString();
                getcontent=to.getText().toString();


                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("email"));
                intent.putExtra(Intent.EXTRA_EMAIL,getto);
                intent.putExtra(Intent.EXTRA_SUBJECT,getsubject);
                intent.putExtra(Intent.EXTRA_TEXT,getcontent);
                intent.setType("message/rfc822");
                Intent chooser=Intent.createChooser(intent,"Launch Email");
                startActivity(chooser);
            }
        });



    }
}

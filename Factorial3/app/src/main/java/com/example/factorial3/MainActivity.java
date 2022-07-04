package com.example.factorial3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText enter;
    EditText show;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void factorial(View View){
        TextView enter=(TextView)findViewById(R.id.enter);
        TextView show=(TextView)findViewById(R.id.show);


        int a=Integer.parseInt(enter.getText().toString());
                int k=1;
        for (int i=1;i<=a;i++){
            k=k+1;
        } show.setText(Integer.toString(k));
        Toast.makeText(MainActivity.this,Integer.toString(k),Toast.LENGTH_LONG).show();
    }
}

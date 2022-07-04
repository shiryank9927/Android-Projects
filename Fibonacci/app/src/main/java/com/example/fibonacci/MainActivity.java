package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.security.spec.ECPrivateKeySpec;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button calculate;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.edittext);
        calculate=(Button)findViewById(R.id.calculate);
        textView=(TextView)findViewById(R.id.textview);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText(fibonacci(Integer.parseInt(editText.getText().toString())));


            }
        });
    }

    private String fibonacci(int n){

        String text="";
        ArrayList<BigInteger>fib=new ArrayList<>();
        BigInteger first=new BigInteger("0");
        BigInteger second=new BigInteger("1");
        fib.add(first);
        fib.add(second);


        for (int i=1;i<n ; i++)
            text=text+1+""+fib.get(1)+"\n";
        return text;

    }

}

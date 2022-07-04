package com.example.volylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText password;
    Button submit;
    String getName,getEmail,getPassword;
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getName=name.getText().toString();
                getEmail=email.getText().toString();
                getPassword=password.getText().toString();


                sendData(getName,getEmail,getPassword);


            }
        });

        requestQueue= Volley.newRequestQueue(this);

    }


    public void sendData(final String name1, final String email1, final String password1){
        String url="https//192.168.43.20/my/request.php";
        StringRequest stringRequest=new StringRequest( Request.Method.POST,url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {



                Toast.makeText(MainActivity.this, "this",response,  Toast.LENGTH_SHORT).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String,String> params=new HashMap<String, String>();
                params.put("name",name1);
                params.put("email",email1);
                params.put("password",password1);
                return params;
            }
        };
        requestQueue.add(stringRequest);


    }
}

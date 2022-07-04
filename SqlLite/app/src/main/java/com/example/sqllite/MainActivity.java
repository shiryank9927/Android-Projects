package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sql;
    TextView id,city;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id=findViewById(R.id.text_id);
        city=findViewById(R.id.text_city);

        sql=openOrCreateDatabase("my_data",MODE_PRIVATE,null);

        String query="CREATE TABLE IF NOT EXISTS "


        //String query="INSERT INTO table_one VALUES(101,\"delhi\");";
        //sql.execSQL(query);


    }
}

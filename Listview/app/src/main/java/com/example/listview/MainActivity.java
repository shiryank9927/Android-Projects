package com.example.listview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder dialog;
    ListView listView;
    String names[]={"Sonu","Ke","Tittu","ki","Sweety"};
    int images[]={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog=new AlertDialog.Builder(this);


        listView=findViewById(R.id.list);
        //ArrayAdapter arrayAdapter=new ArrayAdapter(this,
          //      android.R.layout.simple_list_item_1,names);
        //listView.setAdapter(arrayAdapter);

        MyAdapter adapter=new MyAdapter(getApplicationContext(),names,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Toast.makeText(MainActivity.this, ""+names[i], Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public void onBackPressed() {
        dialog.setMessage("This is alert")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();

                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog=dialog.create();
        alertDialog.setTitle("Demo");
        alertDialog.show();




    }
}
class MyAdapter extends ArrayAdapter{
    int imageArray[];
    String nameArray[];
    public MyAdapter(Context context,String[]name,int[] image){
        super(context,R.layout.customlv,R.id.list,name);
        this.imageArray=image;
        this.nameArray=name;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row=inflater.inflate(R.layout.customlv,parent, false);

        ImageView imageView=row.findViewById(R.id.image);
        TextView textView=row.findViewById(R.id.text);

        imageView.setImageResource(imageArray[position]);
        textView.setText(nameArray[position]);

        return row;


    }
}

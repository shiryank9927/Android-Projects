package com.example.ssc5q4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySong;
    Button play,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySong=MediaPlayer.create(MainActivity.this,R.raw.play);
        play=findViewById(R.id.bt1);
        stop=findViewById(R.id.bt2);

    }

    public void playIT(View v){
        mySong.start();
    }
    public void stopIT(View v){
        mySong.stop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySong.release();
    }
}

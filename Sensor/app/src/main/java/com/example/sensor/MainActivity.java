package com.example.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements SensorEventListener {

    Button play;
    MediaPlayer mediaPlayer;
    SmsManager smsManager;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        smsManager = SmsManager.getDefault();
        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer.start();

                smsManager.sendTextMessage("9927783810", null, "message", null, null);


            }
        });


        SensorManager sensorManager, sensorManager1;
        sensorManager = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        sensorManager1 = (SensorManager) this.getSystemService(SENSOR_SERVICE);


        Sensor proxy, acc;
        acc = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        proxy = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sensorManager.registerListener(this, proxy,
                SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager1.registerListener(this, proxy,
                SensorManager.SENSOR_DELAY_NORMAL);


    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        Sensor sensor = sensorEvent.sensor;

        if (sensor.getType() == Sensor.TYPE_PROXIMITY) {

            if (flag == 1) {
                mediaPlayer.stop();
                Toast.makeText(this, "sensor", Toast.LENGTH_SHORT).show();
            }
            flag++;
        } else if (sensor.getType() == Sensor.TYPE_ACCELEROMETER) {

            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];


            if (x > 5) {

                mediaPlayer.start();
            }
            if (y > 5) {
                mediaPlayer.stop();
            }

        }


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
        
    }
}
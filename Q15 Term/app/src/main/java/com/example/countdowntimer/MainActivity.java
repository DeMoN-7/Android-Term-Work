package com.example.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
TextView Tvtime;
EditText Evtime;
Button start;
int t=100000;
int tim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tvtime=findViewById(R.id.TVtime);
        Evtime=findViewById(R.id.time);
        start=findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tim=Integer.parseInt(Evtime.getText().toString());
                new CountDownTimer(t,1000){
                    @Override
                    public void onTick(long l) {
                        Tvtime.setText(String.valueOf(tim));
                        tim--;
                        if (tim<0){
                            Toast.makeText(MainActivity.this, "Time Finished", Toast.LENGTH_SHORT).show();
                            cancel();
                        }
                    }

                    @Override
                    public void onFinish() {

                    }
                }.start();
            }
        });
    }
}
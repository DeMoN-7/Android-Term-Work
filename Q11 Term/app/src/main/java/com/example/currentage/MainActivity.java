package com.example.currentage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
CalendarView cv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv=findViewById(R.id.CV);
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = new SimpleDateFormat("yyyy", Locale.getDefault()).format(new Date()).toString();
                int datee=Integer.valueOf(date);
                int age=datee-year;
                Toast.makeText(MainActivity.this, ""+age, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.example.q2term;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
TextView t1;
    int x=20;
    int x1=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( x1<6) {

                    t1.setTextSize(x);
                    x+=10;
                    x1+=1;
                    
                }
                else
                {
                    Toast.makeText(MainActivity.this, "You can’t perform this operation", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
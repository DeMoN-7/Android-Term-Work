package com.example.addnumprime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1;
TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1=Integer.parseInt(e1.getText().toString());
                int num2=Integer.parseInt(e2.getText().toString());
                int sum=num1+num2;
                int flag=0;
                for (int i =2;i<sum-1;i++){
                    if(sum%i==0){
                        flag=1;
                    }
                }
                if (flag!=0){
                    t1.setText(""+sum+" isn't Prime");
                }
                else {
                    t1.setText(""+sum+" is Prime");
                }

            }
        });
    }
}
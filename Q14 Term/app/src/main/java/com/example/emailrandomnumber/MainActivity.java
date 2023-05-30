package com.example.emailrandomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button send;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send=findViewById(R.id.send);
        email=findViewById(R.id.email);
        Random random=new Random();
        int min = 10000;
        int max = 99999;
        int randomNumber = random.nextInt(max - min + 1) + min;
        send.setOnClickListener(view -> {
            String s3=email.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{s3});
            intent.putExtra(Intent.EXTRA_SUBJECT, "Random Number");
            intent.putExtra(Intent.EXTRA_TEXT,""+randomNumber);
            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Choose an Email client :"));

        });


    }
}
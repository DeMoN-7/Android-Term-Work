package com.example.livepasswordcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextTextPassword);
        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String password = s.toString();

                if (password.length()>7){
                    if (isPasswordValid(password)) {
                        e1.setError(null);
                    } else {
                        e1.setError("Invalid password");
                    }
                }
                else {
                    e1.setError("Password must be greater tha 8 letter");
                }

            }
        });
    }

    private boolean isPasswordValid(String password) {
        // Password pattern: at least one alphabet, one number, and one special character
        String passwordPattern = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=]).*$";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
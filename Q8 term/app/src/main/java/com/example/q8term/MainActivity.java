package com.example.q8term;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FragmentOne fragmentOne;
    FragmentTwo fragmentTwo;
    FragmentThree fragmentThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the fragment manager
        fragmentManager = getSupportFragmentManager();

        //Initializing the fragment transaction
        fragmentTransaction = fragmentManager.beginTransaction();

        //Initializing the fragments
        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();
        fragmentThree = new FragmentThree();

        //Adding the fragments to the layout
        fragmentTransaction.add(R.id.fragmentOne, fragmentOne);
        fragmentTransaction.add(R.id.fragmentTwo, fragmentTwo);
        fragmentTransaction.add(R.id.fragmentThree, fragmentThree);

        //Committing the transaction
        fragmentTransaction.commit();
    }
}
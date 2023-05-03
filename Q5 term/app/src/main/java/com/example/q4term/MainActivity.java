package com.example.q4term;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(Color.RED);

        shapeDrawable.setBounds(0, 0, 200, 200);

        View shapeView = findViewById(R.id.shapeView);
        shapeView.setBackground(shapeDrawable);


        ShapeDrawable shapeDrawable1 = new ShapeDrawable(new OvalShape());
        shapeDrawable1.getPaint().setColor(Color.GRAY);

        shapeDrawable1.setBounds(0, 0, 200, 200);

        View shapeView1 = findViewById(R.id.shapeView1);
        shapeView1.setBackground(shapeDrawable1);

        Path path = new Path();
        path.moveTo(0, 0);
        path.lineTo(100, 0);
        path.lineTo(50, 100);
        path.lineTo(0, 0);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new PathShape(path, 100, 100));
        shapeDrawable2.getPaint().setColor(Color.BLUE);

        shapeDrawable2.setBounds(0, 0, 200, 200);

        View shapeView2 = findViewById(R.id.shapeView2);
        shapeView2.setBackground(shapeDrawable2);
    }
}
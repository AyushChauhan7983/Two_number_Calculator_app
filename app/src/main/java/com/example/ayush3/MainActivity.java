package com.example.ayush3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button screen1;
    Button screen2;
    Button screen3;
    Button screen6;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen1=findViewById(R.id.screen1);
        screen2=findViewById(R.id.screen2);
        screen3=findViewById(R.id.screen3);
        screen6=findViewById(R.id.screen6);

        screen1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, screen1.class);

            startActivity(intent);
        });

        screen2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, screen2.class);

            startActivity(intent);
        });

        screen3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, screen3.class);

            startActivity(intent);
        });

        screen6.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, screen6.class);

            startActivity(intent);
        });
    }
}
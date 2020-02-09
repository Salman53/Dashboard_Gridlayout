package com.example.dashboard2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnProfile , btnEdu , btnHealth , btnGoal , btnFin , btnComfort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfile = findViewById(R.id.btnProfile);
        btnEdu = findViewById(R.id.btnEducation);
        btnHealth = findViewById(R.id.btnHealth);
        btnGoal = findViewById(R.id.btnGoal);
        btnFin = findViewById(R.id.btnFinance);
        btnComfort = findViewById(R.id.btnComfort);


        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
            }
        });

        btnEdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Education", Toast.LENGTH_SHORT).show();
            }
        });

        btnHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Health", Toast.LENGTH_SHORT).show();
            }
        });

        btnGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Goal", Toast.LENGTH_SHORT).show();
            }
        });

        btnFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Finance", Toast.LENGTH_SHORT).show();
            }
        });

        btnComfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Comfort", Toast.LENGTH_SHORT).show();
            }
        });


    }
    }


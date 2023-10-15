package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        CardView exit = findViewById(R.id.cardFD8);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindDoctorActivity.this ,HomeActivity.class));
            }
        });

        CardView physician = findViewById(R.id.cardFD1);
        physician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindDoctorActivity.this , DoctorDetailsActivity.class);
                intent.putExtra("title" , "Physician");
                startActivity(intent);
            }
        });

        CardView dietician = findViewById(R.id.cardFD2);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindDoctorActivity.this , DoctorDetailsActivity.class);
                intent.putExtra("title" , "Dietician");
                startActivity(intent);
            }
        });

        CardView dentist = findViewById(R.id.cardFD3);
        dentist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindDoctorActivity.this , DoctorDetailsActivity.class);
                intent.putExtra("title" , "Dentist");
                startActivity(intent);
            }
        });
        CardView surgeon = findViewById(R.id.cardFD4);
        surgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindDoctorActivity.this , DoctorDetailsActivity.class);
                intent.putExtra("title" , "Surgeon");
                startActivity(intent);
            }
        });
        CardView entSurgeon = findViewById(R.id.cardFD5);
        entSurgeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindDoctorActivity.this , DoctorDetailsActivity.class);
                intent.putExtra("title" , "ENTSurgeon");
                startActivity(intent);
            }
        });
        CardView orthopedic = findViewById(R.id.cardFD6);
        orthopedic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindDoctorActivity.this , DoctorDetailsActivity.class);
                intent.putExtra("title" , "Orthopedic");
                startActivity(intent);
            }
        });

        CardView cardiologist = findViewById(R.id.cardFD7);
        cardiologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FindDoctorActivity.this , DoctorDetailsActivity.class);
                intent.putExtra("title" , "Cardiologist");
                startActivity(intent);
            }
        });


    }
}
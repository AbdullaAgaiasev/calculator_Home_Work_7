package com.example.lesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calkulator_continiud extends AppCompatActivity {
    private Button button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calkulator_continiud);
        button = findViewById(R.id.bt_Export_as_CSV);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.CATEGORY_HOME);
                startActivity(intent);
                System.exit(1);
            }
        });

    }
}
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configura cada botón para abrir una actividad específica
        findViewById(R.id.btn_radio_group).setOnClickListener(v ->
                startActivity(new Intent(this, RadioGroupActivity.class)));

        findViewById(R.id.btn_linear_weight).setOnClickListener(v ->
                startActivity(new Intent(this, LinearWeightActivity.class)));

        findViewById(R.id.btn_relative_url).setOnClickListener(v ->
                startActivity(new Intent(this, RelativeUrlActivity.class)));

        findViewById(R.id.btn_overlap).setOnClickListener(v ->
                startActivity(new Intent(this, OverlapActivity.class)));

        findViewById(R.id.btn_form).setOnClickListener(v ->
                startActivity(new Intent(this, FormActivity.class)));
    }
}

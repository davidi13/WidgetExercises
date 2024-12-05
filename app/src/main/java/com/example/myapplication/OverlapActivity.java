package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OverlapActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overlap);
        // Referencias a los botones
        Button bigButton = findViewById(R.id.big_button);
        Button smallButton = findViewById(R.id.small_button);

        // Listener para el botón grande
        bigButton.setOnClickListener(v ->
                Toast.makeText(this, "Big Button Clicked!", Toast.LENGTH_SHORT).show());

        // Listener para el botón pequeño
        smallButton.setOnClickListener(v ->
                Toast.makeText(this, "Small Button Clicked!", Toast.LENGTH_SHORT).show());
    }
}

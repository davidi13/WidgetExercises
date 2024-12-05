package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        EditText nameField = findViewById(R.id.name);
        EditText emailField = findViewById(R.id.email);

        findViewById(R.id.submit).setOnClickListener(v -> {
            String name = nameField.getText().toString();
            String email = emailField.getText().toString();

            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Submitted: " + name + ", " + email, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

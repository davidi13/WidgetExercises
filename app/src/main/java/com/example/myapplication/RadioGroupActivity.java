package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class RadioGroupActivity extends AppCompatActivity {
    private LinearLayout layout;
    private LinearLayout movableBlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        layout = findViewById(R.id.activity_radio_group);
        movableBlock = findViewById(R.id.movable_block);
        RadioGroup orientationGroup = findViewById(R.id.orientation);
        RadioGroup gravityGroup = findViewById(R.id.gravity);
        CheckBox backgroundCheckbox = findViewById(R.id.background_checkbox);

        // Cambiar orientación del bloque
        orientationGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.horizontal) {
                movableBlock.setOrientation(LinearLayout.HORIZONTAL);
                layout.setGravity(Gravity.CENTER_HORIZONTAL); // Centrado horizontalmente
            } else if (checkedId == R.id.vertical) {
                movableBlock.setOrientation(LinearLayout.VERTICAL);
                layout.setGravity(Gravity.CENTER_VERTICAL); // Centrado verticalmente
            }
        });

        // Cambiar la gravedad del bloque
        gravityGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.left) {
                layout.setGravity(Gravity.LEFT);
            } else if (checkedId == R.id.center) {
                layout.setGravity(Gravity.CENTER);
            } else if (checkedId == R.id.right) {
                layout.setGravity(Gravity.RIGHT);
            }
        });

        // Cambiar el color de fondo
        backgroundCheckbox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                layout.setBackgroundColor(Color.WHITE);
            } else {
                layout.setBackgroundColor(Color.TRANSPARENT);
            }
        });
    }
}

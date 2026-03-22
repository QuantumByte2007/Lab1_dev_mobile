package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int counter;
    private TextView compteur;
    Button[] b = new Button[3];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compteur = findViewById(R.id.counter);
        b[0] = findViewById(R.id.toast_printer);
        b[1] = findViewById(R.id.button_inc);
        b[2] = findViewById(R.id.button_dec);


        b[0].setOnClickListener(v -> {
            Toast.makeText(this, "It's my first app", Toast.LENGTH_SHORT).show();
        });
        b[1].setOnClickListener(view -> {
            counter++;
            compteur.setText(String.valueOf(counter));
        });
        b[2].setOnClickListener(view -> {
            counter--;
            compteur.setText(String.valueOf(counter));
        });


    }
}
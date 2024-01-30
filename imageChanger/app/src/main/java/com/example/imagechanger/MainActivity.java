package com.example.imagechanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        image = findViewById(R.id.image);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.tom1);
                Toast.makeText(MainActivity.this, "Image Changed", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.tom2);
                Toast.makeText(MainActivity.this, "Image Changed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
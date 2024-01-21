package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHii = findViewById(R.id.btnHii);
        btnHii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtMsg = findViewById(R.id.txtMessage);
                txtMsg.setText("Hii there !!");
                Toast.makeText(MainActivity.this, "This a toast message.", Toast.LENGTH_SHORT).show();
            }
        });
        btnHii.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "One Piece!!", Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    public void onHelloBtnClick(View view){
        TextView txtMsg = findViewById(R.id.txtMessage);
        txtMsg.setText("Hello World!!");
    }
}
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText number_1,number_2,result;
    private Button add,minus,divide,multiply,mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_1 = findViewById(R.id.number_1);
        number_2 = findViewById(R.id.number_2);
        result = findViewById(R.id.result);
        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        mod = findViewById(R.id.mod);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    float x , y , s;
                    x = Float.parseFloat(number_1.getText().toString());
                    y = Float.parseFloat(number_2.getText().toString());
                    s = x+y;
                    result.setText(Float.toString(s));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "enter number instead of string!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    float x , y , s;
                    x = Float.parseFloat(number_1.getText().toString());
                    y = Float.parseFloat(number_2.getText().toString());
                    s = x-y;
                    result.setText(Float.toString(s));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "enter number instead of string!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    float x , y , s;
                    x = Float.parseFloat(number_1.getText().toString());
                    y = Float.parseFloat(number_2.getText().toString());
                    s = x*y;
                    result.setText(Float.toString(s));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "enter number instead of string!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    float x , y , s;
                    x = Float.parseFloat(number_1.getText().toString());
                    y = Float.parseFloat(number_2.getText().toString());
                    s = x/y;
                    result.setText(Float.toString(s));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "enter number instead of string!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    float x , y , s;
                    x = Float.parseFloat(number_1.getText().toString());
                    y = Float.parseFloat(number_2.getText().toString());
                    s = x%y;
                    result.setText(Float.toString(s));
                }catch (NumberFormatException e){
                    Toast.makeText(MainActivity.this, "enter number instead of string!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}



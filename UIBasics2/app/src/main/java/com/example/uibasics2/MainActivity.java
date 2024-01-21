package com.example.uibasics2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbHarry, cbMatrix, cbMission;
    private RadioGroup rgMarital;
    private ProgressBar progressBar;
//    private ListView listView;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbHarry = findViewById(R.id.cbHarry);
        cbMission = findViewById(R.id.cbMission);
        cbMatrix = findViewById(R.id.cbMatrix);
        rgMarital = findViewById(R.id.rgMarital);
        progressBar = findViewById(R.id.progressBar);
//        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });
        thread.start();

        cbHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "You have watched Harry Potter", Toast.LENGTH_SHORT).show();
                }
            }
        });

        rgMarital.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rbMarried)
                    Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();
                else if(checkedId==R.id.rbSingle)
                    Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_SHORT).show();
                else if(checkedId==R.id.rbLiveIn)
                    Toast.makeText(MainActivity.this, "Live In", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Select Marital Status", Toast.LENGTH_SHORT).show();
            }
        });

//        final ArrayList<String> cities = new ArrayList<>();
//        cities.add("Delhi");
//        cities.add("Mumbai");
//        cities.add("kharagpur");
//        cities.add("Kolkata");
//        cities.add("Hyderabad");
//
//        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);
//        listView.setAdapter(citiesAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, cities.get(position)+" selected", Toast.LENGTH_SHORT).show();
//            }
//        });

//        final ArrayList<String> students = new ArrayList<>();
//        students.add("Rohit");
//        students.add("Jay");
//        students.add("Mehul");
//        students.add("Shaon");
//        students.add("Srijan");
//
//        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, students);
//        spinner.setAdapter(studentsAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, students.get(position)+" selected", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.flightMode) {
            Toast.makeText(this, "Flight Mode selected!!", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId()==R.id.settings) {
            Toast.makeText(this, "settings selected!!", Toast.LENGTH_SHORT).show();
            return true;
        }
        else
            return super.onOptionsItemSelected(item);
    }
}
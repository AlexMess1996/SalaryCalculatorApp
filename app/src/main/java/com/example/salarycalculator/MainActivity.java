package com.example.salarycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.exitBtn){
            System.out.println("Exit");
            finish();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exitBtn =findViewById(R.id.exitBtn);
        Button registerShift = findViewById(R.id.registerShift);
        Button pastShifts = findViewById(R.id.pastShifts);

        exitBtn.setOnClickListener(this);

        exitBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String info = "Exits app";
                Toast.makeText(MainActivity.this,info,Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        registerShift.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String info = "Register a shift";
                Toast.makeText(MainActivity.this,info,Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        pastShifts.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String info = "Display last shifts";
                Toast.makeText(MainActivity.this,info,Toast.LENGTH_SHORT).show();
                return true;
            }
        });




    }


}
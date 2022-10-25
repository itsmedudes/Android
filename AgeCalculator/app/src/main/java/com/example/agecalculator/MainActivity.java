package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText birthYear, newYear;
        Button findYear;
        TextView result;

        birthYear = findViewById(R.id.birthYear);
        newYear = findViewById(R.id.newYear);
        result = findViewById(R.id.result);
        findYear = findViewById(R.id.findYear);

        findYear.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                int birth = Integer.parseInt(birthYear.getText().toString());
                int year = Integer.parseInt(newYear.getText().toString());
                int total = year - birth;

                result.setText(""+total);
            }
        });



    }
}
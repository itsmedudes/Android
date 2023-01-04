package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRegister(View view){
        EditText firstName = findViewById(R.id.editFirstName);
        EditText lastName = findViewById(R.id.editLastName);
        lastName.getText().toString();
        EditText email = findViewById(R.id.editEmail);
        email.getText().toString();

        TextView firstname = findViewById(R.id.showFirstName);
        firstname.setText("First Name : "+firstName.getText().toString());
        TextView lastname = findViewById(R.id.showLastName);
        lastname.setText("Last Name : "+lastName.getText().toString());
        TextView emails = findViewById(R.id.showEmail);
        emails.setText("Email : "+email.getText().toString());
    }
}
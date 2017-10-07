package com.example.foodbank.foodbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Color;
import android.content.Intent;
import android.view.View;
import android.widget.*;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        login = (Button) findViewById(R.id.loginbutton);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    Intent i = new Intent(getApplicationContext(),Home.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Credentials",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

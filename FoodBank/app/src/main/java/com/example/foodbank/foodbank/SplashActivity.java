package com.example.foodbank.foodbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}

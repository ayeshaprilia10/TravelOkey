package com.hehetech.tubes5_travelokey.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.R;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override

            public void run() {
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);
                finish();
            }

        }, 5*1000);



    }
}
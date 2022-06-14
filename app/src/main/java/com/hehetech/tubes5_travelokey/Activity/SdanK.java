package com.hehetech.tubes5_travelokey.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.R;

public class SdanK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdan_k);

        getSupportActionBar().setTitle("Syarat dan Ketentuan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
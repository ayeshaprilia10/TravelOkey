package com.hehetech.tubes5_travelokey.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.R;

public class KebijakanPrivasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kebijakan);
        getSupportActionBar().setTitle("Kebijakan Privasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

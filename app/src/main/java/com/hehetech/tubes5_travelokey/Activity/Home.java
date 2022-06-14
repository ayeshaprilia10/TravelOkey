package com.hehetech.tubes5_travelokey.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.Activity.Bus.RV_ItemBus;
import com.hehetech.tubes5_travelokey.Activity.Flight.RV_ItemFlight;
import com.hehetech.tubes5_travelokey.Activity.Hotels.RV_ItemHotel;
import com.hehetech.tubes5_travelokey.Activity.Pariwisata.RV_ItemPariwisata;
import com.hehetech.tubes5_travelokey.Activity.Travel.RV_Item_Travel;
import com.hehetech.tubes5_travelokey.R;

public class Home extends AppCompatActivity implements  View.OnClickListener{
    ImageButton btnFlight, btnHotel, btnPariwisata, btnTravel, btnBus;
    ImageButton btnOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        btnFlight = findViewById(R.id.btn_flight);
        btnHotel = findViewById(R.id.btn_hotels);
        btnPariwisata = findViewById(R.id.btn_pariwisata);
        btnTravel = findViewById(R.id.btn_travel);
        btnBus = findViewById(R.id.btn_bus);
        btnOption = findViewById(R.id.btn_option);

        btnFlight.setOnClickListener(this);
        btnHotel.setOnClickListener(this);
        btnPariwisata.setOnClickListener(this);
        btnTravel.setOnClickListener(this);
        btnBus.setOnClickListener(this);
        btnOption.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_flight){
            Intent intentSearchFlight = new Intent(Home.this, RV_ItemFlight.class);
            startActivity(intentSearchFlight);
        }
        if(v.getId() == R.id.btn_hotels){
            Intent intentSearchHotel = new Intent(Home.this, RV_ItemHotel.class);
            startActivity(intentSearchHotel);
        }
        if(v.getId() == R.id.btn_pariwisata){
            Intent intentSearchPariwisata = new Intent(Home.this, RV_ItemPariwisata.class);
            startActivity(intentSearchPariwisata);
        }
        if(v.getId() == R.id.btn_travel){
            Intent intentSearchTravel = new Intent(Home.this, RV_Item_Travel.class);
            startActivity(intentSearchTravel);
        }
        if(v.getId() == R.id.btn_bus){
            Intent intentSearchBus = new Intent(Home.this, RV_ItemBus.class);
            startActivity(intentSearchBus);
        }
        if(v.getId() == R.id.btn_option){
            Intent intentSearchBus = new Intent(Home.this, pengaturan.class);
            startActivity(intentSearchBus);
        }
    }

}
package com.hehetech.tubes5_travelokey.Activity.Hotels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.Adapter.ItemHotelAdapter;
import com.hehetech.tubes5_travelokey.Entity.Hotels.ItemHotels;
import com.hehetech.tubes5_travelokey.Entity.Hotels.ItemHotelsData;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class RV_ItemHotel extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvFlight;
    private ArrayList<ItemHotels> list = new ArrayList<>();
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_itemflight);
        getSupportActionBar().hide();

        rvFlight = findViewById(R.id.rv_flight);
        rvFlight.setHasFixedSize(true);
        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);

        list.addAll(ItemHotelsData.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist(){
        rvFlight.setLayoutManager(new LinearLayoutManager(this));
        ItemHotelAdapter listItemHotelAdapter = new ItemHotelAdapter(list);
        rvFlight.setAdapter(listItemHotelAdapter);

        listItemHotelAdapter.setOnItemClickCallback(new ItemHotelAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ItemHotels data) {
                showSelectedFood(data);
            }
        });
    }

    private void showSelectedFood(ItemHotels itemHotels){
        Intent kirimData = new Intent(RV_ItemHotel.this, Detail_ItemHotel.class);

        kirimData.putExtra(Detail_ItemHotel.EXTRA_NAMAPENGELOLA, itemHotels.getNama_pengelola());
        kirimData.putExtra(Detail_ItemHotel.EXTRA_IMGTHUMBNAIL, itemHotels.getPhotoThumbnail());
        kirimData.putExtra(Detail_ItemHotel.EXTRA_FASILITAS, itemHotels.getFasilitas());
        kirimData.putExtra(Detail_ItemHotel.EXTRA_HARGA, itemHotels.getHarga());
        startActivity(kirimData);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_back){
            Intent intentSearchFlight = new Intent(RV_ItemHotel.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}
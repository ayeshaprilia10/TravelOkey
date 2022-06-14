package com.hehetech.tubes5_travelokey.Activity.Pariwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.Adapter.ItemPariwisataAdapter;
import com.hehetech.tubes5_travelokey.Entity.Pariwisata.ItemPariwisata;
import com.hehetech.tubes5_travelokey.Entity.Pariwisata.ItemPariwisataData;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class RV_ItemPariwisata extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvFlight;
    private ArrayList<ItemPariwisata> list = new ArrayList<>();
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

        list.addAll(ItemPariwisataData.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist(){
        rvFlight.setLayoutManager(new LinearLayoutManager(this));
        ItemPariwisataAdapter listItemParAdapter = new ItemPariwisataAdapter(list);
        rvFlight.setAdapter(listItemParAdapter);

        listItemParAdapter.setOnItemClickCallback(new ItemPariwisataAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ItemPariwisata data) {
                showSelectedFood(data);
            }
        });
    }

    private void showSelectedFood(ItemPariwisata itemPariwisata){
        Intent kirimData = new Intent(RV_ItemPariwisata.this, Detail_ItemPariwisata.class);

        kirimData.putExtra(Detail_ItemPariwisata.EXTRA_NAMAPENGELOLA, itemPariwisata.getNama_pengelola());
        kirimData.putExtra(Detail_ItemPariwisata.EXTRA_IMGTHUMBNAIL, itemPariwisata.getPhotoThumbnail());
        kirimData.putExtra(Detail_ItemPariwisata.EXTRA_FASILITAS, itemPariwisata.getFasilitas());
        kirimData.putExtra(Detail_ItemPariwisata.EXTRA_HARGA, itemPariwisata.getHarga());
        kirimData.putExtra(Detail_ItemPariwisata.EXTRA_BANYAKTIKET, itemPariwisata.getBanyak_tiket());
        startActivity(kirimData);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_back){
            Intent intentSearchFlight = new Intent(RV_ItemPariwisata.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}
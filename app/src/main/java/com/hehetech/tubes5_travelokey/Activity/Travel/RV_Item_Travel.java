package com.hehetech.tubes5_travelokey.Activity.Travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.Adapter.ItemTravelAdapter;
import com.hehetech.tubes5_travelokey.Entity.Travel.ItemTravel;
import com.hehetech.tubes5_travelokey.Entity.Travel.ItemTravelData;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class RV_Item_Travel extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvFlight;
    private ArrayList<ItemTravel> list = new ArrayList<>();
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

        list.addAll(ItemTravelData.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist(){
        rvFlight.setLayoutManager(new LinearLayoutManager(this));
        ItemTravelAdapter listItemTravelAdapter = new ItemTravelAdapter(list);
        rvFlight.setAdapter(listItemTravelAdapter);

        listItemTravelAdapter.setOnItemClickCallback(new ItemTravelAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ItemTravel data) {
                showSelectedFood(data);
            }
        });
    }

    private void showSelectedFood(ItemTravel itemTravel){
        Intent kirimData = new Intent(RV_Item_Travel.this, Detail_Item_Travel.class);

        kirimData.putExtra(Detail_Item_Travel.EXTRA_NAMAPENGELOLA, itemTravel.getNama_pengelola());
        kirimData.putExtra(Detail_Item_Travel.EXTRA_IMGTHUMBNAIL, itemTravel.getPhotoThumbnail());
        kirimData.putExtra(Detail_Item_Travel.EXTRA_LKBERANGKAT, itemTravel.getLokasi_keberangkatan());
        kirimData.putExtra(Detail_Item_Travel.EXTRA_LKTUJUAN, itemTravel.getLokasi_tujuan());
        kirimData.putExtra(Detail_Item_Travel.EXTRA_TGLBERANGKAT, itemTravel.getTgl_keberangkatan());
        kirimData.putExtra(Detail_Item_Travel.EXTRA_TGLSAMPAI, itemTravel.getTgl_sampai());
        kirimData.putExtra(Detail_Item_Travel.EXTRA_FASILITAS, itemTravel.getFasilitas());
        kirimData.putExtra(Detail_Item_Travel.EXTRA_HARGA, itemTravel.getHarga());
        kirimData.putExtra(Detail_Item_Travel.EXTRA_JENISTIKET, itemTravel.getJenis_tiket());
        startActivity(kirimData);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_back){
            Intent intentSearchFlight = new Intent(RV_Item_Travel.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}
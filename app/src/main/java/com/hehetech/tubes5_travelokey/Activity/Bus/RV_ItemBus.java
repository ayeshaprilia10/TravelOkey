package com.hehetech.tubes5_travelokey.Activity.Bus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.Adapter.ItemBusAdapter;
import com.hehetech.tubes5_travelokey.Entity.Bus.ItemBus;
import com.hehetech.tubes5_travelokey.Entity.Bus.ItemBusData;
import com.hehetech.tubes5_travelokey.R;

import java.util.ArrayList;

public class RV_ItemBus extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvFlight;
    private ArrayList<ItemBus> list = new ArrayList<>();
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

        list.addAll(ItemBusData.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist(){
        rvFlight.setLayoutManager(new LinearLayoutManager(this));
        ItemBusAdapter listItemBusAdapter = new ItemBusAdapter(list);
        rvFlight.setAdapter(listItemBusAdapter);

        listItemBusAdapter.setOnItemClickCallback(new ItemBusAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ItemBus data) {
                showSelectedFood(data);
            }
        });
    }

    private void showSelectedFood(ItemBus itemBus){
        Intent kirimData = new Intent(RV_ItemBus.this, Detail_ItemBus.class);

        kirimData.putExtra(Detail_ItemBus.EXTRA_NAMAPENGELOLA, itemBus.getNama_pengelola());
        kirimData.putExtra(Detail_ItemBus.EXTRA_IMGTHUMBNAIL, itemBus.getPhotoThumbnail());
        kirimData.putExtra(Detail_ItemBus.EXTRA_LKBERANGKAT, itemBus.getLokasi_keberangkatan());
        kirimData.putExtra(Detail_ItemBus.EXTRA_LKTUJUAN, itemBus.getLokasi_tujuan());
        kirimData.putExtra(Detail_ItemBus.EXTRA_TGLBERANGKAT, itemBus.getTgl_keberangkatan());
        kirimData.putExtra(Detail_ItemBus.EXTRA_TGLSAMPAI, itemBus.getTgl_sampai());
        kirimData.putExtra(Detail_ItemBus.EXTRA_FASILITAS, itemBus.getFasilitas());
        kirimData.putExtra(Detail_ItemBus.EXTRA_HARGA, itemBus.getHarga());
        kirimData.putExtra(Detail_ItemBus.EXTRA_JENISTIKET, itemBus.getJenis_tiket());
        startActivity(kirimData);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_back){
            Intent intentSearchFlight = new Intent(RV_ItemBus.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}
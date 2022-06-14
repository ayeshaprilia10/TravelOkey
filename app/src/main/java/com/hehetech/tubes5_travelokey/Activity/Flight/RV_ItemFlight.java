package com.hehetech.tubes5_travelokey.Activity.Flight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.R;
import com.hehetech.tubes5_travelokey.Adapter.ItemFlightAdapter;
import com.hehetech.tubes5_travelokey.Entity.Flight.ItemFlight;
import com.hehetech.tubes5_travelokey.Entity.Flight.ItemFlightData;

import java.util.ArrayList;

public class RV_ItemFlight extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvFlight;
    private ArrayList<ItemFlight> list = new ArrayList<>();
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

        list.addAll(ItemFlightData.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist(){
        rvFlight.setLayoutManager(new LinearLayoutManager(this));
        ItemFlightAdapter listItemFlightAdapter = new ItemFlightAdapter(list);
        rvFlight.setAdapter(listItemFlightAdapter);

        //OnClick
        listItemFlightAdapter.setOnItemClickCallback(new ItemFlightAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ItemFlight data) {
                showSelectedFood(data);
            }
        });
    }

    //OnClick Method
    private void showSelectedFood(ItemFlight itemFlight){
        Intent kirimData = new Intent(RV_ItemFlight.this, Detail_ItemFlight.class);

        kirimData.putExtra(Detail_ItemFlight.EXTRA_NAMAMASKAPAI, itemFlight.getNama_maskapai());
        kirimData.putExtra(Detail_ItemFlight.EXTRA_IMGTHUMBNAIL, itemFlight.getPhotoThumbnail());
        kirimData.putExtra(Detail_ItemFlight.EXTRA_LKBERANGKAT, itemFlight.getLokasi_keberangkatan());
        kirimData.putExtra(Detail_ItemFlight.EXTRA_LKTUJUAN, itemFlight.getLokasi_tujuan());
        kirimData.putExtra(Detail_ItemFlight.EXTRA_TGLBERANGKAT, itemFlight.getTgl_keberangkatan());
        kirimData.putExtra(Detail_ItemFlight.EXTRA_TGLSAMPAI, itemFlight.getTgl_sampai());
        kirimData.putExtra(Detail_ItemFlight.EXTRA_FASILITAS, itemFlight.getFasilitas());
        kirimData.putExtra(Detail_ItemFlight.EXTRA_HARGA, itemFlight.getHarga());
        kirimData.putExtra(Detail_ItemFlight.EXTRA_JENISTIKET, itemFlight.getJenis_tiket());
        startActivity(kirimData);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_back){
            Intent intentSearchFlight = new Intent(RV_ItemFlight.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}

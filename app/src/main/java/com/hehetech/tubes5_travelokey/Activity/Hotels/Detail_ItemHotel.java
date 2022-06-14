package com.hehetech.tubes5_travelokey.Activity.Hotels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.R;

public class Detail_ItemHotel extends AppCompatActivity implements View.OnClickListener{

    public static final String EXTRA_NAMAPENGELOLA = "extra_nama_pengelola";
    public static final String EXTRA_IMGTHUMBNAIL = "extra_imageposter";
    public static final String EXTRA_FASILITAS = "extra_fasilitas";
    public static final String EXTRA_HARGA = "extra_harga";

    TextView tvNamaPengelola;
    TextView tvFasilitas, tvbanyakTiket,tvHarga;
    Button btnBayar;
    ImageButton btnBack;
    ImageView imgThumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item_hotel);
        getSupportActionBar().hide();

        imgThumbnail = findViewById(R.id.image_hotel);
        tvNamaPengelola = findViewById(R.id.nama_hotel);
        tvFasilitas = findViewById(R.id.fasilitas_hotel);
        tvHarga = findViewById(R.id.harga_hotel);

        btnBayar = findViewById(R.id.btn_pesan_hotel);
        btnBack = findViewById(R.id.btn_back);

        String namaPengelola = getIntent().getStringExtra(EXTRA_NAMAPENGELOLA);
        String fasilitas= getIntent().getStringExtra(EXTRA_FASILITAS);
        String harga= getIntent().getStringExtra(EXTRA_HARGA);


        tvNamaPengelola.setText(namaPengelola);
        tvFasilitas.setText(fasilitas);
        tvHarga.setText(harga);

        btnBack.setOnClickListener(this);
        btnBayar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_pesan_hotel) {
            Intent kirimData = new Intent(Detail_ItemHotel.this, Pay_ItemHotel.class);
            String harga = getIntent().getStringExtra(EXTRA_HARGA);
            kirimData.putExtra(Pay_ItemHotel.EXTRA_HARGA, harga.trim());
            startActivity(kirimData);
        }
        if (v.getId() == R.id.btn_back) {
            Intent intentSearchFlight = new Intent(Detail_ItemHotel.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}
package com.hehetech.tubes5_travelokey.Activity.Bus;

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

public class Detail_ItemBus extends AppCompatActivity implements View.OnClickListener{

    public static final String EXTRA_NAMAPENGELOLA = "extra_nama_pengelola";
    public static final String EXTRA_IMGTHUMBNAIL = "extra_imageposter";
    public static final String EXTRA_LKBERANGKAT = "extra_lkberangkat";
    public static final String EXTRA_LKTUJUAN = "extra_lktujuan";
    public static final String EXTRA_TGLBERANGKAT = "extra_tglberangkat";
    public static final String EXTRA_TGLSAMPAI = "extra_tglsampai";
    public static final String EXTRA_FASILITAS = "extra_fasilitas";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_JENISTIKET = "extra_jenistiket";

    TextView tvNamaPengelola, tvLkAsal, tvLkTujuan, tvWaktuBerangkat, tvWaktuTiba;
    TextView tvFasilitas, tvJenisTiket,tvHarga;
    Button btnBayar;
    ImageButton btnBack;
    ImageView imgThumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item_bus);
        getSupportActionBar().hide();

        imgThumbnail = findViewById(R.id.image_bus);
        tvNamaPengelola = findViewById(R.id.nama_bus);
        tvLkAsal = findViewById(R.id.et_kota_asal_bus);
        tvLkTujuan = findViewById(R.id.et_kota_tujuan_bus);
        tvWaktuBerangkat = findViewById(R.id.et_jam_berangkat_bus);
        tvWaktuTiba = findViewById(R.id.et_jam_tiba_bus);
        tvFasilitas = findViewById(R.id.tv_fasilitas_bus);
        tvJenisTiket = findViewById(R.id.tv_jenis_tiket_bus);
        tvHarga = findViewById(R.id.tv_harga_bus);

        btnBayar = findViewById(R.id.btn_bayar_bus);
        btnBack = findViewById(R.id.btn_back);

        String namaPengelola = getIntent().getStringExtra(EXTRA_NAMAPENGELOLA);
        String lkAsal = getIntent().getStringExtra(EXTRA_LKBERANGKAT);
        String lkTujuan = getIntent().getStringExtra(EXTRA_LKTUJUAN);
        String waktuBerangkat = getIntent().getStringExtra(EXTRA_TGLBERANGKAT);
        String waktuTiba = getIntent().getStringExtra(EXTRA_TGLSAMPAI);
        String fasilitas= getIntent().getStringExtra(EXTRA_FASILITAS);
        String jenisTiket= getIntent().getStringExtra(EXTRA_JENISTIKET);
        String harga= getIntent().getStringExtra(EXTRA_HARGA);


        tvNamaPengelola.setText(namaPengelola);
        tvLkAsal.setText(lkAsal);
        tvLkTujuan.setText(lkTujuan);
        tvWaktuBerangkat.setText(waktuBerangkat);
        tvWaktuTiba.setText(waktuTiba);
        tvFasilitas.setText(fasilitas);
        tvJenisTiket.setText(jenisTiket);
        tvHarga.setText(harga);

        btnBack.setOnClickListener(this);
        btnBayar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_bayar_bus) {
            Intent kirimData = new Intent(Detail_ItemBus.this, Pay_ItemBus.class);
            String harga = getIntent().getStringExtra(EXTRA_HARGA);
            kirimData.putExtra(Pay_ItemBus.EXTRA_HARGA, harga.trim());
            startActivity(kirimData);
        }
        if (v.getId() == R.id.btn_back) {
            Intent intentSearchFlight = new Intent(Detail_ItemBus.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}
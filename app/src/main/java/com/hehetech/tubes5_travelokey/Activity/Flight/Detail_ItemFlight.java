package com.hehetech.tubes5_travelokey.Activity.Flight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.R;
import com.hehetech.tubes5_travelokey.Entity.Flight.ItemFlight;

public class Detail_ItemFlight extends AppCompatActivity implements View.OnClickListener {

    //Deklar EXTRA
    public static final String EXTRA_NAMAMASKAPAI = "extra_nama_maskapai";
    public static final String EXTRA_IMGTHUMBNAIL = "extra_imageposter";
    public static final String EXTRA_LKBERANGKAT = "extra_lkberangkat";
    public static final String EXTRA_LKTUJUAN = "extra_lktujuan";
    public static final String EXTRA_TGLBERANGKAT = "extra_tglberangkat";
    public static final String EXTRA_TGLSAMPAI = "extra_tglsampai";
    public static final String EXTRA_FASILITAS = "extra_fasilitas";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_JENISTIKET = "extra_jenistiket";

    //Deklar variabel
    TextView tvNamaMaskapai, tvLkAsal, tvLkTujuan, tvWaktuBerangkat, tvWaktuTiba;
    TextView tvFasilitas, tvJenisTiket,tvHarga;
    Button btnBayar;
    ImageButton btnBack;
    ImageView imgThumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pesawat);
        getSupportActionBar().hide();

        imgThumbnail = findViewById(R.id.image_pesawat);
        tvNamaMaskapai = findViewById(R.id.nama_pesawat);
        tvLkAsal = findViewById(R.id.et_kota_asal);
        tvLkTujuan = findViewById(R.id.et_kota_tujuan);
        tvWaktuBerangkat = findViewById(R.id.et_jam_berangkat);
        tvWaktuTiba = findViewById(R.id.et_jam_tiba);
        tvFasilitas = findViewById(R.id.tv_fasilitas);
        tvJenisTiket = findViewById(R.id.tv_jenis_tiket);
        tvHarga = findViewById(R.id.tv_harga);

        btnBayar = findViewById(R.id.btn_bayar);
        btnBack = findViewById(R.id.btn_back);

        String namaMaskapai = getIntent().getStringExtra(EXTRA_NAMAMASKAPAI);
        String lkAsal = getIntent().getStringExtra(EXTRA_LKBERANGKAT);
        String lkTujuan = getIntent().getStringExtra(EXTRA_LKTUJUAN);
        String waktuBerangkat = getIntent().getStringExtra(EXTRA_TGLBERANGKAT);
        String waktuTiba = getIntent().getStringExtra(EXTRA_TGLSAMPAI);
        String fasilitas= getIntent().getStringExtra(EXTRA_FASILITAS);
        String jenisTiket= getIntent().getStringExtra(EXTRA_JENISTIKET);
        String harga= getIntent().getStringExtra(EXTRA_HARGA);


        tvNamaMaskapai.setText(namaMaskapai);
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
        if (v.getId() == R.id.btn_bayar) {
            Intent kirimData = new Intent(Detail_ItemFlight.this, Pay_ItemFlight.class);
            String harga = getIntent().getStringExtra(EXTRA_HARGA);
            kirimData.putExtra(Pay_ItemFlight.EXTRA_HARGA, harga.trim());
            startActivity(kirimData);
        }
        if (v.getId() == R.id.btn_back) {
            Intent intentSearchFlight = new Intent(Detail_ItemFlight.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}

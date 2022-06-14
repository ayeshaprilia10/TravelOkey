package com.hehetech.tubes5_travelokey.Activity.Hotels;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.R;

public class Pay_ItemHotel extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_HARGA = "extra_harga";

    private TextView tvHarga, tvTotalHarga;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran);
        getSupportActionBar().hide();

        tvHarga = findViewById(R.id.tagihan_data);
        tvTotalHarga = findViewById(R.id.tv_total_fee);
        btnBack = findViewById(R.id.btn_bayar_konfirmasi);

        String harga= getIntent().getStringExtra(EXTRA_HARGA);
        int totalHarga = parseInt(harga) + 5000;
        String strTotalHarga = Integer.toString(totalHarga);
        tvHarga.setText(harga);
        tvTotalHarga.setText(strTotalHarga);

        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_bayar_konfirmasi) {
            Intent intentSearchFlight = new Intent(Pay_ItemHotel.this, Home.class);
            startActivity(intentSearchFlight);
        }
    }
}
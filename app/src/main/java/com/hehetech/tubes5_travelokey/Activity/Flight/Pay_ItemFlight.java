package com.hehetech.tubes5_travelokey.Activity.Flight;

import static java.lang.Integer.parseInt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.Activity.Home;
import com.hehetech.tubes5_travelokey.R;

public class Pay_ItemFlight extends AppCompatActivity implements View.OnClickListener{

        //Deklar EXTRA
        public static final String EXTRA_HARGA = "extra_harga";

        //Deklar variabel
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

            //Converter
            String harga= getIntent().getStringExtra(EXTRA_HARGA);
            int totalHarga = parseInt(getIntent().getStringExtra(EXTRA_HARGA)) + 5000;
            String strTotalHarga = Integer.toString(totalHarga);
            tvHarga.setText(harga);
            tvTotalHarga.setText(strTotalHarga);

            btnBack.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn_bayar_konfirmasi) {
                Intent intentSearchFlight = new Intent(Pay_ItemFlight.this, Home.class);
                startActivity(intentSearchFlight);
            }
        }
}

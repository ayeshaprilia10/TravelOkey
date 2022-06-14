package com.hehetech.tubes5_travelokey.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.R;

public class pengaturan extends AppCompatActivity{

    TextView privasi, about, syaratketentuan, nilai, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_pengaturan);

        privasi = (TextView) findViewById(R.id.tv_privasi);
        privasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pengaturan.this, KebijakanPrivasi.class));
            }
        });

        about = (TextView) findViewById(R.id.tentang);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pengaturan.this, com.hehetech.tubes5_travelokey.Activity.AboutActivity.class));
            }
        });

        syaratketentuan = (TextView) findViewById(R.id.sk);
        syaratketentuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pengaturan.this, com.hehetech.tubes5_travelokey.Activity.SdanK.class));
            }
        });

        nilai = (TextView) findViewById(R.id.nilai);
        nilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rate = new Intent(Intent.ACTION_VIEW);
                rate.setData(Uri.parse("https://play.google.com/store/"));
                startActivity(rate);
            }
        });

        keluar = (TextView) findViewById(R.id.logout);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(pengaturan.this, LoginActivity.class));
            }
        });

        getSupportActionBar().setTitle("Pengaturan");
    }
}
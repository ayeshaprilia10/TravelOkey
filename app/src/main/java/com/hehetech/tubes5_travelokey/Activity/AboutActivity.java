package com.hehetech.tubes5_travelokey.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.R;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView fac,yt,wa,tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_about);//biar nampilin layout yang setting_about
        getSupportActionBar().setTitle("About Us");//set judul action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//biar ada tombol back nya wkwkwk biar simpel. kalau mau custom juga boleh
        //untuk setting saat di click tombol 'back' nya bakal ke layout mana, set parent nya di androidmanifest
        fac = findViewById(R.id.img_fb);
        fac.setOnClickListener(this);
        yt = findViewById(R.id.img_yt);
        yt.setOnClickListener(this);
        wa = findViewById(R.id.img_wa);
        wa.setOnClickListener(this);
        tw = findViewById(R.id.img_tw);
        tw.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_fb:
                Intent fb = new Intent(Intent.ACTION_VIEW);
                fb.setData(Uri.parse("https://web.facebook.com/"));
                startActivity(fb);
                break;
            case  R.id.img_yt:
                Intent yt = new Intent(Intent.ACTION_VIEW);
                yt.setData(Uri.parse("https://youtube.com/"));
                startActivity(yt);
                break;
            case  R.id.img_wa:
                Intent wa = new Intent(Intent.ACTION_VIEW);
                wa.setData(Uri.parse("https://whatsapp.com/"));
                startActivity(wa);
                break;
            case  R.id.img_tw:
                Intent tw = new Intent(Intent.ACTION_VIEW);
                tw.setData(Uri.parse("https://twitter.com/"));
                startActivity(tw);
                break;

        }

    }
}

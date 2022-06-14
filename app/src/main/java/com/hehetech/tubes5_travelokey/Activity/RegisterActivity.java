package com.hehetech.tubes5_travelokey.Activity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hehetech.tubes5_travelokey.Helper.DatabaseHelper;
import com.hehetech.tubes5_travelokey.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button btnReg;
    EditText etEmail, etUname, etPassword, etUPass, etNama, etTgl, etPhone, etKota, etKodePos, etAlamat;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();

        openHelper = new DatabaseHelper(this);
        etEmail = (EditText) findViewById(R.id.etRegisterEmail);
        etUname = (EditText) findViewById(R.id.etRegisterUsername);
        etPassword = (EditText) findViewById(R.id.etRegisterPassword);
        etUPass = (EditText) findViewById(R.id.etRegisterUPassword);
        etNama = (EditText) findViewById(R.id.etRegisterNamaLengkap);
        etTgl = (EditText) findViewById(R.id.etRegisterTglLahir);
        etPhone = (EditText) findViewById(R.id.etRegisterPhone);
        etKota = (EditText) findViewById(R.id.etRegisterKotaAsal);
        etKodePos = (EditText) findViewById(R.id.etRegisterKodePos);
        etAlamat = (EditText) findViewById(R.id.etRegisterAlamat);

        btnReg = (Button) findViewById(R.id.btnRegister);
        btnReg.setOnClickListener(this);

        tvLogin = (TextView) findViewById(R.id.tvLoginHere);
        tvLogin.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnRegister:
                db = openHelper.getWritableDatabase();
                String email = etEmail.getText().toString();
                String uname = etUname.getText().toString();
                String password = etPassword.getText().toString();
                String nama = etNama.getText().toString();
                String tglLahir = etTgl.getText().toString();
                String phone = etPhone.getText().toString();
                String kota = etKota.getText().toString();
                String kodePos = etKodePos.getText().toString();
                String alamat = etAlamat.getText().toString();
                String ulang = etUPass.getText().toString();

                if(ulang.equals(password)){
                    insertData(email, uname, password, nama, tglLahir, phone, kota, kodePos, alamat);

                    Toast.makeText(getApplicationContext(), "Berhasil Mendaftar!", Toast.LENGTH_LONG).show();
                    Intent reg = new Intent(this, LoginActivity.class);
                    startActivity(reg);
                    finish();
                }

                else{
                    Toast.makeText(getApplicationContext(), "Password tidak sama!", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.tvLoginHere:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }

    public void insertData(String email, String uname, String password, String nama, String tglLahir, String phone, String kota, String kodePos, String alamat){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.EMAIL, email);
        contentValues.put(DatabaseHelper.USERNAME, uname);
        contentValues.put(DatabaseHelper.PASSWORD, password);
        contentValues.put(DatabaseHelper.NAMA_LENGKAP, nama);
        contentValues.put(DatabaseHelper.TANGGAL_LAHIR, tglLahir);
        contentValues.put(DatabaseHelper.PHONE, phone);
        contentValues.put(DatabaseHelper.KOTA_ASAL, kota);
        contentValues.put(DatabaseHelper.KODE_POS, kodePos);
        contentValues.put(DatabaseHelper.ALAMAT, alamat);
        long id = db.insert(DatabaseHelper.TABLE_NAME, null, contentValues);
    }
}
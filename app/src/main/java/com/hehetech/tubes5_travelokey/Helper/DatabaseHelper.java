package com.hehetech.tubes5_travelokey.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "user.db";
    public static final String TABLE_NAME = "user";
    public static final String ID = "id";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String NAMA_LENGKAP = "nama_lengkap";
    public static final String TANGGAL_LAHIR = "tanggal_lahir";
    public static final String PHONE = "phone";
    public static final String KOTA_ASAL = "kota_asal";
    public static final String KODE_POS = "kode_pos";
    public static final String ALAMAT = "alamat";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME +
                " (id INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT, username TEXT, password TEXT, nama_lengkap TEXT, tanggal_lahir TEXT, phone TEXT, kota_asal TEXT, kode_pos TEXT, alamat TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int old, int newVer) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

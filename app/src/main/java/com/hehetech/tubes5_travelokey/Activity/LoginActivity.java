package com.hehetech.tubes5_travelokey.Activity;

import android.content.Intent;
import android.database.Cursor;
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

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button btLogin;
    EditText etUname, etPassword;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        etUname = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btLogin = (Button) findViewById(R.id.btnLogin);
        btLogin.setOnClickListener(this);

        tvRegister = (TextView) findViewById(R.id.tvCreateAccount);
        tvRegister.setOnClickListener(this);

        openHelper = new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnLogin:
                String uname = etUname.getText().toString();
                String password = etPassword.getText().toString();

                cursor = db.rawQuery(
                        "SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE "
                                + DatabaseHelper.USERNAME + "=? AND "
                                + DatabaseHelper.PASSWORD + "=?",
                        new String[]{uname, password});
                if(cursor != null){
                    if(cursor.getCount() > 0){
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                        Intent user = new Intent(this, Home.class);
                        startActivity(user);
                        finish();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "User Tidak Ditemukan", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.tvCreateAccount:
                Intent intent = new Intent(this, com.hehetech.tubes5_travelokey.Activity.RegisterActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
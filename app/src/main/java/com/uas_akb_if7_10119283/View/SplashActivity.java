package com.uas_akb_if7_10119283.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.uas_akb_if7_10119283.MainActivity;
import com.uas_akb_if7_10119283.R;

// selasa 13 Agustus 2022, 1011983, Rahmatullah Rizki, IF7
public class SplashActivity extends AppCompatActivity {
    Handler handler = new Handler();

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        getSupportActionBar().hide();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(splash);
                finish();
            }
        },2300);
    }
}

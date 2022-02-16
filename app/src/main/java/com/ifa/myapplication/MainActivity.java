package com.ifa.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }public void profile(View view) {
        Intent intent = new Intent(MainActivity.this, profilActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(MainActivity.this, galeryActivity.class);
        startActivity(intent);
    }

    public void ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, eskulActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, perpusActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, guruActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, fasilitasActivity.class);
        startActivity(intent);
    }
}
package com.ifa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import com.ifa.myapplication.AlbumhutriActivity;
import com.ifa.myapplication.AlbumpmrActivity;
import com.ifa.myapplication.AlbumpramukaActivity;
import com.ifa.myapplication.MainActivity;
import com.ifa.myapplication.profilActivity;

public class galeryActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);

        viewFlipper = (ViewFlipper) findViewById(R.id.ViewFlipper);

        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }

    public void Hutri(View view) {
        Intent intent = new Intent(galeryActivity.this, AlbumhutriActivity.class);
        startActivity(intent);
    }
    public void pmr(View view) {
        Intent intent = new Intent(galeryActivity.this, AlbumpmrActivity.class);
        startActivity(intent);
    }

    public void pramuka(View view) {
        Intent intent = new Intent(galeryActivity.this, AlbumpramukaActivity.class);
        startActivity(intent);
    }
}
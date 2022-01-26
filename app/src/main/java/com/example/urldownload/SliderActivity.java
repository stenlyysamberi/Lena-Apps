package com.example.urldownload;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import com.example.urldownload.Adapter.ViewPagerAdepter;

import me.relex.circleindicator.CircleIndicator;

public class SliderActivity extends AppCompatActivity {
      Activity activity;
//    Window window = activity.getWindow();

    ViewPager viewPager2;
    int[] images = {R.drawable.img1,R.drawable.img2};
    String [] header = {"Welcome to Lena","Organize photos"};
    String [] dec    = {
            "Aplikasi Download Manager request.setMimeType(image/jpeg)",
            "Simpan gambar favoritmu dengan sekali klik!"
    };
    ViewPagerAdepter adepter;
    CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

//        Window window = activity.getWindow();
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//        window.setStatusBarColor(activity.getResources().getColor(R.color.purple_700));

        viewPager2 = findViewById(R.id.viewpager2);
        indicator = findViewById(R.id.indicator);
        adepter = new ViewPagerAdepter(this, images,header,dec);
        viewPager2.setAdapter(adepter);
        indicator.setViewPager(viewPager2);
    }

    public void sing_up(View view) {
        startActivity(new Intent(SliderActivity.this,MainActivity.class));
        finish();
    }
}
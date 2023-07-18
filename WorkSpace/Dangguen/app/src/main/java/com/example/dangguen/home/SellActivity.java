package com.example.dangguen.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dangguen.R;

public class SellActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sell);

        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);
        actionBar.setTitle("내 물건 팔기");

    }
}
package com.example.dangguen.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dangguen.R;
import com.example.dangguen.databinding.ActivityHomeDetailBinding;

public class HomeDetailActivity extends AppCompatActivity {

    ActivityHomeDetailBinding binding;
    HomeDTO dto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dto= (HomeDTO) getIntent().getSerializableExtra("dto");
    }
}
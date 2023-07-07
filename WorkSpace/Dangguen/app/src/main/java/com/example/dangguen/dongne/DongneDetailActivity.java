package com.example.dangguen.dongne;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dangguen.R;
import com.example.dangguen.databinding.ActivityDongneDetailBinding;

public class DongneDetailActivity extends AppCompatActivity {

    ActivityDongneDetailBinding binding;
    ActionBar actionBar;
    DongneDTO dto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDongneDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        actionBar = getSupportActionBar();
        actionBar.setTitle("나가기");
        dto = (DongneDTO) getIntent().getSerializableExtra("dto");


    }
}
package com.example.project01_kggtalk.opentalk;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.project01_kggtalk.R;
import com.example.project01_kggtalk.databinding.ActivityOpenDetailBinding;

public class OpenDetailActivity extends AppCompatActivity {

    ActivityOpenDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOpenDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();//액션바를 안보이게 처리한다.

        binding.imgvClose.setOnClickListener(v->{
            finish();
        });

    }
}
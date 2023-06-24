package com.example.project01_kggtalk_practice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.project01_kggtalk_practice.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("kgg Talk");
        dialog.setMessage("로딩 중 대기 바랍니다...");
        dialog.setCancelable(false);
        dialog.show();

        new Handler().postDelayed(()->{

            dialog.dismiss();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();


        },100*5);

    }
}
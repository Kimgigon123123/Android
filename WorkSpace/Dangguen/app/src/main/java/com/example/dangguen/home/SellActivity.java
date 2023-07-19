package com.example.dangguen.home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.example.dangguen.MainActivity;
import com.example.dangguen.R;
import com.example.dangguen.databinding.ActivityMainBinding;
import com.example.dangguen.databinding.ActivitySellBinding;

public class SellActivity extends AppCompatActivity {

    ActionBar actionBar;
    ActivitySellBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySellBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);
        actionBar.setTitle("내 물건 팔기");

        binding.btnComplete.setOnClickListener(v-> {

            Intent intent = new Intent(SellActivity.this, MainActivity.class);
            HomeDTO dto = new HomeDTO(0, Integer.parseInt(binding.edtPrice.getEditText().getText().toString()), 0, 0, binding.edtTitle.getEditText().getText().toString(), "농성동", "방금 전", R.drawable.baseline_person_24, 0, "사람", binding.edtContent.getEditText().getText().toString());

        });

}
}
package com.example.dangguen.dongne;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dangguen.R;
import com.example.dangguen.chat.ChatDetailAdapter;
import com.example.dangguen.databinding.ActivityDongneDetailBinding;
import com.example.dangguen.home.HomeDetailFragment;

public class DongneDetailActivity extends AppCompatActivity {

    ActivityDongneDetailBinding binding;
    ActionBar actionBar;
    DongneDTO dto;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDongneDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        actionBar = getSupportActionBar();
        actionBar.setTitle("나가기");



        dto = (DongneDTO) getIntent().getSerializableExtra("dto");

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container,new DongneDetailFragment(dto)).commit();

      binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              FragmentManager manager = getSupportFragmentManager();
              manager.beginTransaction().replace(R.id.container,new DongneDetailFragment(1)).commit();
          }
      });




    }
}
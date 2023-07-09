package com.example.dangguen.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.dangguen.R;
import com.example.dangguen.chat.ChatDetailActivity;
import com.example.dangguen.databinding.ActivityHomeDetailBinding;
import com.example.dangguen.databinding.FragmentHomeDetailBinding;
import com.example.dangguen.databinding.ItemHomeRecvBinding;

import java.util.ArrayList;

public class HomeDetailActivity extends AppCompatActivity {

    @NonNull ActivityHomeDetailBinding binding;
//   FragmentHomeDetailBinding binding2;
    HomeDTO dto;




    ActionBar actionBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dto= (HomeDTO) getIntent().getSerializableExtra("dto");


//        Intent intent = new Intent(HomeDetailActivity.this,HomeDetailFragment.class);
//        intent.putExtra("dto",dto);
//        startActivity(intent);

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container,new HomeDetailFragment(dto)).commit();



        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);
        actionBar.setTitle(dto.getTitle());


        binding.tvPrice.setText(dto.getPrice()+"");



        if(dto.isLike==false){
            binding.imgvLike.setImageResource(R.drawable.ic_favorite);
        }else if(dto.isLike==true){
            binding.imgvLike.setImageResource(R.drawable.ic_favorite_pink);
        }


        binding.imgvLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dto.isLike==false){
                    binding.imgvLike.setImageResource(R.drawable.ic_favorite_pink);
                    dto.isLike=true;
                    dto.setFavorite(dto.getFavorite()+1);

                }
                else if(dto.isLike==true){
                    binding.imgvLike.setImageResource(R.drawable.ic_favorite);
                    dto.isLike=false;
                    dto.setFavorite(dto.getFavorite()-1);
                }

            }
        });



    }
}
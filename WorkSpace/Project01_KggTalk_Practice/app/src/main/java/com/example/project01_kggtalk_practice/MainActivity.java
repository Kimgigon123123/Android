package com.example.project01_kggtalk_practice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.project01_kggtalk_practice.databinding.ActivityMainBinding;
import com.example.project01_kggtalk_practice.friend.FriendFragment;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;

ActionBar actionBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.setElevation(100f); //그림자 정도
        actionBar.setTitle("친구창");

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container,new FriendFragment()).commit();


    }
}
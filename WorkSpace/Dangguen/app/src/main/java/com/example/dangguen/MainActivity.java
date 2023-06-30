package com.example.dangguen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.dangguen.around.AroundFragment;
import com.example.dangguen.chat.ChatFragment;
import com.example.dangguen.databinding.ActivityMainBinding;
import com.example.dangguen.dongne.DongneFragment;
import com.example.dangguen.home.HomeFragment;
import com.example.dangguen.myprofile.MyprofileFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);
        actionBar.setTitle("농성동");

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container,new HomeFragment()).commit();

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.btm_tab1){
                fragment = new HomeFragment();
                actionBar.setTitle("농성동");

            }else if(item.getItemId()==R.id.btm_tab2){
                fragment = new DongneFragment();
                actionBar.setTitle("농성동");
            }
            else if(item.getItemId()==R.id.btm_tab3){
                fragment = new AroundFragment();
                actionBar.setTitle("농성동");
            }

            else if(item.getItemId()==R.id.btm_tab4){
                fragment = new ChatFragment();
                actionBar.setTitle("채팅");
            }

            else if(item.getItemId()==R.id.btm_tab5){
                fragment = new MyprofileFragment();
                actionBar.setTitle("나의 당근");
            }
            else{
                return false;
            }

            if(fragment==null){

            }else{
                manager.beginTransaction().replace(R.id.container,fragment).commit();
            }

            return true;
        });

    }
}
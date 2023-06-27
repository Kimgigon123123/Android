package com.example.dangguen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.dangguen.databinding.ActivityMainBinding;
import com.example.dangguen.home.HomeFragment;
import com.example.dangguen.myprofile.MyprofileFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container,new HomeFragment()).commit();

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.btm_tab1){
                fragment = new HomeFragment();

            }else if(item.getItemId()==R.id.btm_tab2){
                fragment = new HomeFragment();
            }
            else if(item.getItemId()==R.id.btm_tab3){
                fragment = new HomeFragment();
            }

            else if(item.getItemId()==R.id.btm_tab4){
                fragment = new HomeFragment();
            }

            else if(item.getItemId()==R.id.btm_tab5){
                fragment = new MyprofileFragment();
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
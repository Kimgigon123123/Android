package com.example.project01_kggtalk_practice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.project01_kggtalk_practice.databinding.ActivityMainBinding;
import com.example.project01_kggtalk_practice.friend.FriendFragment;
import com.example.project01_kggtalk_practice.opentalk.OpenTalkMainFragment;

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

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.tab1){
                fragment = new FriendFragment();
                actionBar.setTitle("친구");

            }else if(item.getItemId()==R.id.tab2){
                fragment = new FriendFragment();
                actionBar.setTitle("채팅");




            }else if(item.getItemId()==R.id.tab3){
                fragment = new OpenTalkMainFragment();
                actionBar.setTitle("오픈채팅");


            }else if(item.getItemId()==R.id.tab4){
                fragment = new FriendFragment();
                actionBar.setTitle("쇼핑");

            }else if(item.getItemId()==R.id.tab5){
                fragment = new FriendFragment();
                actionBar.setTitle("더보기");
            }
            else{
                return false; //메뉴가 바뀌는 처리를 취소한다. (돌아올 가능성 없음)
            }
            if(fragment==null){

            }else{
                manager.beginTransaction().replace(R.id.container,fragment).commit();
            }


            return true;
        });


    }
}
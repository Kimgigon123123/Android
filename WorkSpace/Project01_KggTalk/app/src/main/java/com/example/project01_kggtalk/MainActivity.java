package com.example.project01_kggtalk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.project01_kggtalk.chat.ChatFragment;
import com.example.project01_kggtalk.databinding.ActivityMainBinding;
import com.example.project01_kggtalk.friend.FriendFragment;
import com.example.project01_kggtalk.opentalk.OpenTalkMainFragment;

public class MainActivity extends AppCompatActivity {
    //MainActivity 바인딩 (뷰결합) 처리하기

    ActivityMainBinding binding;
    ActionBar actionBar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);
        actionBar.setTitle("친구");

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, new FriendFragment()).commit();


        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.tab1){
                fragment = new FriendFragment();
                actionBar.setTitle("친구");

            }else if(item.getItemId()==R.id.tab2){
                fragment = new ChatFragment();
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
        });//람다식의 메소드가 이해가 안간다면 new를 통해서 interface 구조를 먼저 확인 해 볼것

    }
}
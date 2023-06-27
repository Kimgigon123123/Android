package com.example.project01_kggtalk.friend;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.project01_kggtalk.MainActivity;
import com.example.project01_kggtalk.R;
import com.example.project01_kggtalk.databinding.FragmentFriendBinding;

import java.sql.Array;
import java.util.ArrayList;


public class FriendFragment extends Fragment {

    FragmentFriendBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentFriendBinding.inflate(inflater,container,false);
        binding.recvFriend.setAdapter(new FriendAdapter(getList(),getContext()));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));

  //      Intent intent = new Intent(getContext(),MainActivity.class);
    //    startActivity(intent);

        return binding.getRoot();
    }

    public ArrayList<FriendDTO> getList(){
        ArrayList<FriendDTO> list = new ArrayList<>();
        list.add(new FriendDTO(R.drawable.profile1,"이름1",""));
        list.add(new FriendDTO(R.drawable.profile2,"이름2",""));
        list.add(new FriendDTO(R.drawable.profile3,"이름3",""));
        list.add(new FriendDTO(R.drawable.profile4,"이름4",""));
        list.add(new FriendDTO(R.drawable.profile5,"이름5",""));
        return list;
    }
}
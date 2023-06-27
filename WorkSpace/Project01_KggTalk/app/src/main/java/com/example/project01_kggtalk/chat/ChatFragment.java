package com.example.project01_kggtalk.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_kggtalk.R;
import com.example.project01_kggtalk.databinding.FragmentChatBinding;

import java.util.ArrayList;


public class ChatFragment extends Fragment {

    FragmentChatBinding binding ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentChatBinding.inflate(inflater,container,false);
       binding.recvChat.setAdapter(new ChatAdapter(getlist(),getContext()));
       binding.recvChat.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<ChatDTO> getlist(){
        ArrayList<ChatDTO> list = new ArrayList<>();

        list.add(new ChatDTO(R.drawable.profile1,"이름1","안녕!","오전11시30분"));
        list.add(new ChatDTO(R.drawable.profile2,"이름2","잘자!","오전11시40분"));
        list.add(new ChatDTO(R.drawable.profile3,"이름3","ㅎㅇ","오전5시40분"));
        list.add(new ChatDTO(R.drawable.profile4,"이름4","ㅂㅇ","오전12시40분"));
        list.add(new ChatDTO(R.drawable.profile5,"이름5","saf","오전11시50분"));

        return list;
    }

}
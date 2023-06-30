package com.example.dangguen.chat;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentChatBinding;


public class ChatFragment extends Fragment {

        FragmentChatBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChatBinding.inflate(inflater,container,false);
        //Context context =this;//나 자신은 액티비티 위에있기때문에 액티비티한테 받아와야함.
       // Context context1 = getContext();
        binding.chatRecv1.setAdapter(new ChatAdapter(getContext()));
        binding.chatRecv1.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }
}
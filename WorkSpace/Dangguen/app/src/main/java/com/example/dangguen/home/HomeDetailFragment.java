package com.example.dangguen.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.chat.ChatAdapter;
import com.example.dangguen.databinding.FragmentChatBinding;
import com.example.dangguen.databinding.FragmentHomeDetailBinding;


public class HomeDetailFragment extends Fragment {

    FragmentHomeDetailBinding binding;

    HomeDTO dto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentHomeDetailBinding.inflate(inflater,container,false);



        return binding.getRoot();
    }
}
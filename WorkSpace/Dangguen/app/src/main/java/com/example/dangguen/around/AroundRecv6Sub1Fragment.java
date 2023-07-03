package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub1Binding;


public class AroundRecv6Sub1Fragment extends Fragment {

    FragmentAroundRecv6Sub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv6Sub1Binding.inflate(inflater,container,false);
        binding.recv6Sub1.setAdapter(new AroundAdpter6Sub1(getContext()));
        binding.recv6Sub1.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }
}
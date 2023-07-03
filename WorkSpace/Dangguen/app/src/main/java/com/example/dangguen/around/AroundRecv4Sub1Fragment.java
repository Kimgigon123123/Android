package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub1Binding;


public class AroundRecv4Sub1Fragment extends Fragment {

    FragmentAroundRecv4Sub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv4Sub1Binding.inflate(inflater,container,false);
        binding.recv4Sub1.setAdapter(new AroundAdapter4Sub1(getContext()));
        binding.recv4Sub1.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }
}
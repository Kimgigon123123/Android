package com.example.dangguen.around;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.dangguen.databinding.FragmentAroundRecv4Sub1Binding;
import com.example.dangguen.databinding.FragmentAroundRecv7Sub1Binding;


public class AroundRecv7Sub1Fragment extends Fragment {

    FragmentAroundRecv7Sub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv7Sub1Binding.inflate(inflater,container,false);
        binding.recv7Sub1.setAdapter(new AroundAdapter4Sub1(getContext()));
        binding.recv7Sub1.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }
}
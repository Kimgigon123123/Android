package com.example.project01_kggtalk.opentalk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_kggtalk.R;
import com.example.project01_kggtalk.databinding.FragmentOpenSub1Binding;


public class OpenSub1Fragment extends Fragment {

    FragmentOpenSub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenSub1Binding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}
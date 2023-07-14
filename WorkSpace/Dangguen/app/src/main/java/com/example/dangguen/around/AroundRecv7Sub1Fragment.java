package com.example.dangguen.around;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub1Binding;
import com.example.dangguen.databinding.FragmentAroundRecv7Sub1Binding;

import java.util.ArrayList;


public class AroundRecv7Sub1Fragment extends Fragment {

    FragmentAroundRecv7Sub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv7Sub1Binding.inflate(inflater,container,false);
        binding.recv7Sub1.setAdapter(new AroundAdapter4Sub1(getList(),getContext()));
        binding.recv7Sub1.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv1> getList() {

        ArrayList<AroundDTO4Rcv1> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,123,100,30,"아이시","월계","존맛탱"));

        return list;
    }
}
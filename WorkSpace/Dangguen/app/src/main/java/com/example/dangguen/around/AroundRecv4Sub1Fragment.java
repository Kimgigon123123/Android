package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub1Binding;

import java.util.ArrayList;


public class AroundRecv4Sub1Fragment extends Fragment {

    FragmentAroundRecv4Sub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv4Sub1Binding.inflate(inflater,container,false);
        binding.recv4Sub1.setAdapter(new AroundAdapter4Sub1(getList(),getContext()));
        binding.recv4Sub1.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv1> getList() {

        ArrayList<AroundDTO4Rcv1> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,9620,175,10,"디아치앤갤러리","농성동","디아치카페에서 평일마감파트타임을 구합니다."));
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,11000,329,10,"바른초밥","농성동","바른초밥 농성점(본점)에서 주방사원 구하고"));
        list.add(new AroundDTO4Rcv1(0,10000,560,10,"포차다모임","농성동","실내포차 주 3~4일 홀직원 구함"));
        return list;
    }
}
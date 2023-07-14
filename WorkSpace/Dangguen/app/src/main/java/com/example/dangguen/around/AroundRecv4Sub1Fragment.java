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
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,10000,372,20,"광양돌판한우","농성동","주방두루치기1명 홀써빙 1명. 모집합니다"));
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,10000,127,10,"박고집한우전문전","화정동","홀 서빙 직원 모집"));
        list.add(new AroundDTO4Rcv1(0,10000,211,15,"오리궁댕이","금호동","설것지 주방보조 구합니다"));
        return list;
    }
}
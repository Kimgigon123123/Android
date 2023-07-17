package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub1Binding;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub2Binding;

import java.util.ArrayList;


public class AroundRecv4Sub2Fragment extends Fragment {


    FragmentAroundRecv4Sub2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv4Sub2Binding.inflate(inflater,container,false);
        binding.recv4Sub2.setAdapter(new AroundAdapter4Sub2(getList(),getContext()));
        binding.recv4Sub2.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv2> getList() {

        ArrayList<AroundDTO4Rcv2> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv2(R.drawable.dongne_img1,20000,679,10,"광주 동구국민체육센터","농성동","수영 파트 강사 모집 공고"));
        list.add(new AroundDTO4Rcv2(R.drawable.dongne_img1,10000,710,20,"","농성동","광주 전단지 알바 구합니다"));
        list.add(new AroundDTO4Rcv2(0,10000,155,10,"착한폰","농성동","농성동 폰매장 직원및 알바구함"));
        return list;
    }
}
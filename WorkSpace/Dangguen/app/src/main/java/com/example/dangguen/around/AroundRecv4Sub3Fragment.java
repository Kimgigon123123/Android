package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub2Binding;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub3Binding;

import java.util.ArrayList;


public class AroundRecv4Sub3Fragment extends Fragment {



    FragmentAroundRecv4Sub3Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv4Sub3Binding.inflate(inflater,container,false);
        binding.recv4Sub3.setAdapter(new AroundAdapter4Sub3(getList(),getContext()));
        binding.recv4Sub3.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv3> getList() {

        ArrayList<AroundDTO4Rcv3> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv3(R.drawable.around_img4_3_1,9620,355,10,"비타민마트","농성동","비타민마트 농성점 주말알바 구해요"));
        list.add(new AroundDTO4Rcv3(0,10000,374,10,"광양돌판한우","화정동","주방두루치기1명 홀써빙 1명 모집합니다"));
        list.add(new AroundDTO4Rcv3(R.drawable.around_img4_3_3,10000,400,10,"bhc농성점","농성동","김밥전문점 직원 찾아요"));
        return list;
    }
}
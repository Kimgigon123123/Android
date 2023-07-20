package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv7Sub2Binding;
import com.example.dangguen.databinding.FragmentAroundRecv7Sub3Binding;

import java.util.ArrayList;


public class AroundRecv7Sub3Fragment extends Fragment {



    FragmentAroundRecv7Sub3Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv7Sub3Binding.inflate(inflater,container,false);
        binding.recv7Sub3.setAdapter(new AroundAdapter7Sub1(getList(),getContext()));
        binding.recv7Sub3.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv1> getList() {

        ArrayList<AroundDTO4Rcv1> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv1(R.drawable.around_img7_3_1,1300,30,"리메디필라테스 화정점","필라테스","3년이상 경력의 강사진들과 스탓필라테스 국제"));
        list.add(new AroundDTO4Rcv1(R.drawable.around_img7_3_2,1400,40,"몸이야필라테스화정점","필라테스","몸이야필라테스 화정점 몸이야 Open Event"));
        list.add(new AroundDTO4Rcv1(R.drawable.around_img7_3_3,2400,50,"에스바디휘트니스","헬스","우리동네 최저가회비 초보자 체계적인 지도 냉난"));

        return list;
    }
}
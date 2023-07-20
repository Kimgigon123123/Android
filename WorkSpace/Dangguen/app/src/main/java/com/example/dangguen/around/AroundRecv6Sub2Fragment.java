package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub2Binding;

import java.util.ArrayList;


public class AroundRecv6Sub2Fragment extends Fragment {

    FragmentAroundRecv6Sub2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv6Sub2Binding.inflate(inflater,container,false);
        binding.recv6Sub2.setAdapter(new AroundAdpter6Sub2(getList(),getContext()));
        binding.recv6Sub2.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<AroundDTO6Rcv2> getList(){
        ArrayList<AroundDTO6Rcv2> list = new ArrayList<>();
        list.add(new AroundDTO6Rcv2(R.drawable.around_img6_2_1,R.drawable.around_img6_2_2,R.drawable.around_img6_2_3,
                "햇살처럼.","과일판매","만원의 행복 나주배","약 4시간전",
                "초이다이닝 상무지구점","퓨전음식전문","초이다이닝 메뉴","12일전",
                "달빛블루베리", "농산물", "연이은 장마로 일찍 종료 됬습니다.","16일전"));
        return list;
    }



}
package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub5Binding;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub6Binding;

import java.util.ArrayList;


public class AroundRecv6Sub6Fragment extends Fragment {


    FragmentAroundRecv6Sub6Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv6Sub6Binding.inflate(inflater,container,false);
        binding.recv6Sub6.setAdapter(new AroundAdpter6Sub6(getList(),getContext()));
        binding.recv6Sub6.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<AroundDTO6Rcv6> getList(){
        ArrayList<AroundDTO6Rcv6> list = new ArrayList<>();
        list.add(new AroundDTO6Rcv6(R.drawable.dongne_img1,R.drawable.dongne_img1,R.drawable.dongne_img1,
                "잔잔잔카페","카페","잔잔잔카페입니다. 7.14 개인사정으로 휴무입니다.","약 1시간전",
                "팔팔용달","용달","슈퍼싱글침대 이전설치 용달 #이사","약 2시간전",
                "햇살처럼", "과일판매", "만원의 행복 나주배","약 4시간전"));
        return list;
    }
}
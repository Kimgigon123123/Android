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
        binding.recv7Sub1.setAdapter(new AroundAdapter7Sub1(getList(),getContext()));
        binding.recv7Sub1.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv1> getList() {

        ArrayList<AroundDTO4Rcv1> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,220,10,"Yoon","필라테스","농성역 1번 출구 300미터 방면 서구청 맞은편쪽 위치한 윤 필라테스입니다."));
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,597,20,"SGYM신세계점","헬스","5성급 호텔의 럭셔리한 인테리어 운동공간 실평수 500평"));
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,866,30,"올어바웃필라테스","필라테스","올바른 움직임이 시작되는 공간 올어바웃 필라테스입니다"));

        return list;
    }
}
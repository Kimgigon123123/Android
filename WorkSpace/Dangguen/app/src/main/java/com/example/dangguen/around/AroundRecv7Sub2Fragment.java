package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv7Sub1Binding;
import com.example.dangguen.databinding.FragmentAroundRecv7Sub2Binding;

import java.util.ArrayList;


public class AroundRecv7Sub2Fragment extends Fragment {

    FragmentAroundRecv7Sub2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv7Sub2Binding.inflate(inflater,container,false);
        binding.recv7Sub2.setAdapter(new AroundAdapter7Sub1(getList(),getContext()));
        binding.recv7Sub2.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv1> getList() {

        ArrayList<AroundDTO4Rcv1> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv1(R.drawable.around_img7_2_1,1100,30,"윤코치(PT)","헬스","안녕하세요 윤준현 트레이너 입니다. Certificate 생활스포츠지도사 2급"));
        list.add(new AroundDTO4Rcv1(R.drawable.around_img7_2_2,1200,30,"태양휘트니스","헬스","화정동 1403번지 태양 사우나 4층에 위치 연중무휴"));
        list.add(new AroundDTO4Rcv1(R.drawable.around_img7_2_3,1300,30,"리메디 필라테스 화정점","필라테스","캐나다 스탓 필라테스기구를 사용하는 스탓기구"));

        return list;
    }
}
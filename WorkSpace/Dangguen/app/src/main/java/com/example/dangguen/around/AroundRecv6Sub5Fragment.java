package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub4Binding;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub5Binding;

import java.util.ArrayList;


public class AroundRecv6Sub5Fragment extends Fragment {


    FragmentAroundRecv6Sub5Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv6Sub5Binding.inflate(inflater,container,false);
        binding.recv6Sub5.setAdapter(new AroundAdpter6Sub5(getList(),getContext()));
        binding.recv6Sub5.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<AroundDTO6Rcv5> getList(){
        ArrayList<AroundDTO6Rcv5> list = new ArrayList<>();
        list.add(new AroundDTO6Rcv5(R.drawable.around_img6_5_1,R.drawable.around_img6_5_2,R.drawable.around_img6_5_3,
                "팔팔용달","용달","슈퍼싱글침대 이전설치 용달 #이사","약 2시간전",
                "포시즌에어컨","에어컨판매및이전설치","캐리어냉난방기 9평.13평","12일전",
                "베네르플라워", "꽃집/꽃배달", "취임식,퇴임식 선물 베네르플라워에서 준비해보세요.","12일전"));
        return list;
    }
}
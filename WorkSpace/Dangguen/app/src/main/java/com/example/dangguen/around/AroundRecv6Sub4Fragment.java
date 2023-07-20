package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub3Binding;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub4Binding;

import java.util.ArrayList;


public class AroundRecv6Sub4Fragment extends Fragment {



    FragmentAroundRecv6Sub4Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv6Sub4Binding.inflate(inflater,container,false);
        binding.recv6Sub4.setAdapter(new AroundAdpter6Sub4(getList(),getContext()));
        binding.recv6Sub4.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<AroundDTO6Rcv4> getList(){
        ArrayList<AroundDTO6Rcv4> list = new ArrayList<>();
        list.add(new AroundDTO6Rcv4(R.drawable.around_img6_4_1,R.drawable.around_img6_4_2,R.drawable.around_img6_4_3,
                "햇살언어성장연구소","기타","5~7세 사회성 그룹 모집","약 13시간전",
                "영재사관학원","보습/교습/입시학원","영재학원 프리미엄반 모집","11일전",
                "스페인어 과외!", "", "","16일전"));
        return list;
    }
}
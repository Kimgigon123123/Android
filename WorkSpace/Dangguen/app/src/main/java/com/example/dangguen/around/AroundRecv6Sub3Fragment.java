package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub2Binding;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub3Binding;

import java.util.ArrayList;


public class AroundRecv6Sub3Fragment extends Fragment {

    FragmentAroundRecv6Sub3Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv6Sub3Binding.inflate(inflater,container,false);
        binding.recv6Sub3.setAdapter(new AroundAdpter6Sub3(getList(),getContext()));
        binding.recv6Sub3.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<AroundDTO6Rcv3> getList(){
        ArrayList<AroundDTO6Rcv3> list = new ArrayList<>();
        list.add(new AroundDTO6Rcv3(R.drawable.dongne_img1,R.drawable.dongne_img1,R.drawable.dongne_img1,
                "굿모닝서울안과","안과","여름방학 라식라섹49%","약 21시간전",
                "우리동네점핑 다이어트","기타실내운동시","이런 운동은 처음이시라면??","1일전",
                "짐나빌레라", "헬스", "상무지구PT샵 짐나빌레라 신규등록 이벤트","9일전"));
        return list;
    }


    }

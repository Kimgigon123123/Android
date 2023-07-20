package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv6Sub1Binding;

import java.util.ArrayList;


public class AroundRecv6Sub1Fragment extends Fragment {

    FragmentAroundRecv6Sub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv6Sub1Binding.inflate(inflater,container,false);
        binding.recv6Sub1.setAdapter(new AroundAdpter6Sub1(getList(),getContext()));
        binding.recv6Sub1.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<AroundDTO6Rcv1> getList(){
        ArrayList<AroundDTO6Rcv1> list = new ArrayList<>();
        list.add(new AroundDTO6Rcv1(R.drawable.around_img6_1_1,R.drawable.around_img6_1_2,R.drawable.around_img6_1_3,
                                    "타임뷰티 속눈썹&왁싱","속눈썹펌/연장","LED연장 런칭~","약 7시간전",
                                                "디얼제이","속눈썹펌/연장","디얼제이에서 이벤트를 진행하고있어요.","1일전",
                                                "원트네일", "네일샵", "원트네일 7월3일 정식 오픈","14일전"));
        return list;
    }


}
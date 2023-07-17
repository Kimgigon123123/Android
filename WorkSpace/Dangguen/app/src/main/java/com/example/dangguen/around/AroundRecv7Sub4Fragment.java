package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv7Sub3Binding;
import com.example.dangguen.databinding.FragmentAroundRecv7Sub4Binding;

import java.util.ArrayList;


public class AroundRecv7Sub4Fragment extends Fragment {



    FragmentAroundRecv7Sub4Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv7Sub4Binding.inflate(inflater,container,false);
        binding.recv7Sub4.setAdapter(new AroundAdapter7Sub1(getList(),getContext()));
        binding.recv7Sub4.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv1> getList() {

        ArrayList<AroundDTO4Rcv1> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,3600,60,"오늘필라테스","필라테스","방림점 백운점 둘 다 직접 운영합니다 소그룹 필라테스"));
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,2100,60,"우리동네점핑다이어트","기타실내운동시설","안녕하세요~ 점핑 감량 중량 다이어트 건강하게~ 우리동네"));
        list.add(new AroundDTO4Rcv1(R.drawable.dongne_img1,3100,60,"에이치투짐","헬스","탁트인 7층 씨티뷰, 명품 LEXCO사 운동기구 풀셋팅 24시"));

        return list;
    }
}
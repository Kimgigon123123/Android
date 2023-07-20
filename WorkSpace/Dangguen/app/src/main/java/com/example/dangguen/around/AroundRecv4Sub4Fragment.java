package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub3Binding;
import com.example.dangguen.databinding.FragmentAroundRecv4Sub4Binding;

import java.util.ArrayList;


public class AroundRecv4Sub4Fragment extends Fragment {

    FragmentAroundRecv4Sub4Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAroundRecv4Sub4Binding.inflate(inflater,container,false);
        binding.recv4Sub4.setAdapter(new AroundAdapter4Sub4(getList(),getContext()));
        binding.recv4Sub4.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();

    }

    public ArrayList<AroundDTO4Rcv4> getList() {

        ArrayList<AroundDTO4Rcv4> list = new ArrayList<>();
        list.add(new AroundDTO4Rcv4(0,13000,601,10,"농성화로","농성동","고깃집 직원 알바 구합니다~"));
        list.add(new AroundDTO4Rcv4(0,15000,617,10,"너구리알탕아구찜","농성동","주방 남직원 구함"));
        list.add(new AroundDTO4Rcv4(0,9620,211,10,"오리궁댕이","금호동","설것지 주방보조 구합니다"));
        return list;
    }
}
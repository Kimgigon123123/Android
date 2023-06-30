package com.example.dangguen.around;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentAroundBinding;

import java.util.ArrayList;

public class AroundFragment extends Fragment {

    FragmentAroundBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentAroundBinding.inflate(inflater,container,false);
        binding.aroundRecv1.setAdapter(new AroundAdpater1(getList(),getContext()));
        binding.aroundRecv1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.aroundRecv2.setAdapter(new AroundAdpater2(getContext()));
        binding.aroundRecv2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));


        return binding.getRoot();
    }

    public ArrayList<AroundDTO1> getList(){
        ArrayList<AroundDTO1> list = new ArrayList<>();
        list.add(new AroundDTO1(1,10000,"네일자격증 모델구해요~","운암동"));
        list.add(new AroundDTO1(2,9620,"대리운전콜센터상담원모집","중흥동"));
        list.add(new AroundDTO1(3,10000,"토욜 침대 옴겨주실 분 용달차 필요","봉선동"));
        return list;
    }

}
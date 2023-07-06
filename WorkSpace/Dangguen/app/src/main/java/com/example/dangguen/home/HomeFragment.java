package com.example.dangguen.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       binding=FragmentHomeBinding.inflate(inflater,container,false);
        binding.recvHome.setAdapter(new HomeAdapter(getList(),getContext()));
        binding.recvHome.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<HomeDTO> getList(){
        ArrayList<HomeDTO> list = new ArrayList<>();
        list.add(new HomeDTO(R.drawable.ic_launcher_background,300000,2,12,"정말 급해서 어쩔수 없이 팔아요...","남구 주월2동","4시간 전"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,40000,0,10,"나무 화장대","월산5동","11시간 전"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,300000,4,11,"아이폰11프로","화정동","6시간 전"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,50000,0,4,"PC선반으로 쓰던 테이블 판매합니다!","북구 신안동","1시간 전"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,330000,0,9,"3돈 반지","화정동","22시간 전"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,700000,2,3,"디올 클러치","화정 1동","2시간 전"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,5000,1,5,"오늘비움 팔아요","농성1동","1일 전"));
        return list;
    }
}
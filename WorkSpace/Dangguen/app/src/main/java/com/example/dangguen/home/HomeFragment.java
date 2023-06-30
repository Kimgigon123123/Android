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
        list.add(new HomeDTO(R.drawable.ic_launcher_background,3000,5,10,"컴퓨터 팝니다","농성동","1월2일"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,3000,5,10,"컴퓨터 팝니다","농성동","1월2일"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,5000,5,10,"에어팟","월계동","1월2일"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,5000,5,10,"에어팟","월계동","1월2일"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,5000,5,10,"에어팟","월계동","1월2일"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,5000,5,10,"에어팟","월계동","1월2일"));
        list.add(new HomeDTO(R.drawable.ic_launcher_background,5000,5,10,"에어팟","월계동","1월2일"));
        return list;
    }
}
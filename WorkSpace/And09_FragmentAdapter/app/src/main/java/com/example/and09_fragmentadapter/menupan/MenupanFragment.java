package com.example.and09_fragmentadapter.menupan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;


public class MenupanFragment extends Fragment {

RecyclerView recv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menupan, container, false);
        recv = v.findViewById(R.id.recv);

        ArrayList<MenupanDTO> list = new ArrayList<>();
        list.add(new MenupanDTO(R.drawable.img1,1000,"떡볶이"));
        list.add(new MenupanDTO(R.drawable.img2,2000,"짜장면"));

        AdapterMenupan adpater = new AdapterMenupan(inflater,list);
        recv.setAdapter(adpater);
        recv.setLayoutManager(new LinearLayoutManager(getContext()));



        return v;
    }
}
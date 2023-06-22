package com.example.and09_fragmentadapter.practice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and09_fragmentadapter.R;
import com.example.and09_fragmentadapter.recycler.RecyclerFragment;

import java.util.ArrayList;


public class PracticeFragment extends Fragment {

RecyclerView practicev;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_practice, container, false);
        practicev=v.findViewById(R.id.practicev);

        ArrayList<PracticeDTO> list = new ArrayList<>();

        list.add(new PracticeDTO(R.drawable.chart_img1,1,"퀸카","(여자)아이들"));
        list.add(new PracticeDTO(R.drawable.chart_img2,2,"I AM","IVE(아이브)"));
        list.add(new PracticeDTO(R.drawable.chart_img3,3,"Spicy","aespa"));
        list.add(new PracticeDTO(R.drawable.chart_img4,4,"이브, 프시케 ","LE SSERAFIM(르세라핌)"));
        list.add(new PracticeDTO(R.drawable.chart_img4,5,"Spicy","aespa"));

        AdapterPractice adapter = new AdapterPractice(inflater,list);
        practicev.setAdapter(adapter);
        practicev.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }
}
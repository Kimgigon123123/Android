package com.example.dangguen.dongne;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentDongneBinding;

import java.util.ArrayList;


public class DongneFragment extends Fragment {


    FragmentDongneBinding binding;
    String[] category = {"인기글","동네맛집","동네질문","동네소식","생활정보","취미생활","일상"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentDongneBinding.inflate(inflater,container,false);
        binding.recvDongne.setAdapter(new DongneAdapter(getList(),getContext()));
        binding.recvDongne.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

   public ArrayList<DongneDTO> getList(){
        ArrayList<DongneDTO> list = new ArrayList<>();
        list.add(new DongneDTO(category[0],"제목","내용1","주소3","날짜",10,20,100,R.drawable.logo));
       list.add(new DongneDTO(category[1],"제목2","내용3","주소4","날짜",10,20,200,R.drawable.logo));
       list.add(new DongneDTO(category[2],"제목2","내용2","주소1","날짜",10,20,300,R.drawable.ic_home));
       list.add(new DongneDTO(category[3],"제목3","내용4","주소2","날짜",10,20,400,R.drawable.baseline_person_24));
       list.add(new DongneDTO(category[3],"제목3","내용4","주소2","날짜",10,20,400,R.drawable.baseline_person_24));
       list.add(new DongneDTO(category[3],"제목3","내용4","주소2","날짜",10,20,400,R.drawable.baseline_person_24));
       list.add(new DongneDTO(category[3],"제목3","내용4","주소2","날짜",10,20,400,R.drawable.baseline_person_24));
       list.add(new DongneDTO(category[3],"제목3","내용4","주소2","날짜",10,20,400,R.drawable.baseline_person_24));


       return list;
    }

}
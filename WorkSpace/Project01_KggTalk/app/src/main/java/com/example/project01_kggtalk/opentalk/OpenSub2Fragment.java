package com.example.project01_kggtalk.opentalk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_kggtalk.R;
import com.example.project01_kggtalk.databinding.FragmentOpenSub2Binding;
import com.example.project01_kggtalk.databinding.ItemOpenSub2Recv5Binding;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class OpenSub2Fragment extends Fragment {

    FragmentOpenSub2Binding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenSub2Binding.inflate(inflater,container,false);
        binding.open2Recv1.setAdapter(new OpenSub2Adapter(getList(),getContext()));
        binding.open2Recv1.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.open2Recv2.setAdapter(new OpenSub2Adapter2(getList2(),getContext()));
        binding.open2Recv2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.open2Recv3.setAdapter(new OpenSub2Adapter3(getList3(),getContext()));
        binding.open2Recv3.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.open2Recv4.setAdapter(new OpenSub2Adapter4(getList4(),getContext()));
        binding.open2Recv4.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.open2Recv5.setAdapter(new OpenSub2Adapter5(getList5(),getContext()));
        binding.open2Recv5.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.open2Recv7.setAdapter(new OpenSub2Adapter4(getList7(),getContext()));
        binding.open2Recv7.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.open2Recv8.setAdapter(new OpenSub2Adapter5(getList5(),getContext()));
        binding.open2Recv8.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        return binding.getRoot();
    }


    public ArrayList<OpenSub2Recv1DTO> getList(){
        ArrayList<OpenSub2Recv1DTO> list = new ArrayList<>();
        list.add(new OpenSub2Recv1DTO("외국가서 놀랐던 순간",4000,R.drawable.openimg1));
        list.add(new OpenSub2Recv1DTO("지금 잠이 옵니까",11000,R.drawable.openimg2));
        list.add(new OpenSub2Recv1DTO("다이어트 공유하기",8618,R.drawable.openimg3));
        return list;
    }

    public ArrayList<OpenSub2Recv2DTO> getList2(){
        ArrayList<OpenSub2Recv2DTO> list =new ArrayList<>();
        list.add(new OpenSub2Recv2DTO("당신을 기다리는 제페토","방금 대화",30,R.drawable.openimg4));
        list.add(new OpenSub2Recv2DTO("어이 류세이. 나 좀 그만 꼬셔라","1초전",11,R.drawable.openimg5));
        list.add(new OpenSub2Recv2DTO("애니 소통방","1분전",19,R.drawable.openimg6));
        list.add(new OpenSub2Recv2DTO("완주 애니 단톡방","3분전",9,R.drawable.openimg7));
        list.add(new OpenSub2Recv2DTO("애니 사진 나눔방","1시간전",207,R.drawable.openimg8));
        return  list;
    }

    public ArrayList<OpenSub2Recv3DTO> getList3(){
        ArrayList<OpenSub2Recv3DTO> list = new ArrayList<>();
        list.add(new OpenSub2Recv3DTO("뉴진스 버니즈 소통방","#뉴진스 #버니즈 #안고독 #고독 #민지",R.drawable.openimg9,30,8));
        list.add(new OpenSub2Recv3DTO("안고독한 NEWJEANS","#뉴진스 #민지 #하니 #다니엘 #해린 #혜인",R.drawable.openimg10,50,10));
        return list;
    }

    public ArrayList<OpenSub2Recv4DTO> getList4(){
        ArrayList<OpenSub2Recv4DTO> list =new ArrayList<>();
        list.add(new OpenSub2Recv4DTO("디즈니 ost 노래 부르기","1시간전",30,R.drawable.openimg11));
        list.add(new OpenSub2Recv4DTO("디즈니,픽사,드림웍스 외국..","1일전",24,R.drawable.openimg12));
        list.add(new OpenSub2Recv4DTO("게임, 영화, 수다방","방금 대화",4,R.drawable.openimg13));
        list.add(new OpenSub2Recv4DTO("Disney Lovers","3일전",11,R.drawable.openimg14));
        list.add(new OpenSub2Recv4DTO("영화보러 갈 사람","4일전",2,R.drawable.openimg15));

        return  list;
    }

    public ArrayList<OpenSub2Recv5DTO> getList5(){
        ArrayList<OpenSub2Recv5DTO> list = new ArrayList<>();
        list.add(new OpenSub2Recv5DTO("제목1",R.drawable.profile5));
        list.add(new OpenSub2Recv5DTO("제목2",R.drawable.profile4));
        return list;
    }

    public ArrayList<OpenSub2Recv4DTO> getList7(){
        ArrayList<OpenSub2Recv4DTO> list =new ArrayList<>();
        list.add(new OpenSub2Recv4DTO("야근근무현장","방금전",10,R.drawable.openimg16));
        list.add(new OpenSub2Recv4DTO("교대 근무자 수험생 카톡방","10초전",34,R.drawable.openimg17));
        list.add(new OpenSub2Recv4DTO("야간 근무 공대","30초전",35,R.drawable.openimg18));
        list.add(new OpenSub2Recv4DTO("교대근무 테니스 모임","3분전",345,R.drawable.openimg19));
        list.add(new OpenSub2Recv4DTO("교대 근무자들 떠들어보아여","1시간전",12,R.drawable.openimg20));

        return  list;
    }


}
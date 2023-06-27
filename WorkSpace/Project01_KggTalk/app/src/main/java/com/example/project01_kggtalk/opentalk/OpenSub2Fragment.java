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
        list.add(new OpenSub2Recv1DTO("외국가서 놀랐던 순간",4000));
        list.add(new OpenSub2Recv1DTO("지금 잠이 옵니까",11000));
        return list;
    }

    public ArrayList<OpenSub2Recv2DTO> getList2(){
        ArrayList<OpenSub2Recv2DTO> list =new ArrayList<>();
        list.add(new OpenSub2Recv2DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv2DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv2DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv2DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv2DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv2DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        return  list;
    }

    public ArrayList<OpenSub2Recv3DTO> getList3(){
        ArrayList<OpenSub2Recv3DTO> list = new ArrayList<>();
        list.add(new OpenSub2Recv3DTO("제목1","#해시태그1 #해시태그2",R.drawable.profile3,30));
        list.add(new OpenSub2Recv3DTO("제목2","#해시태그1 #해시태그2",R.drawable.profile4,50));
        return list;
    }

    public ArrayList<OpenSub2Recv4DTO> getList4(){
        ArrayList<OpenSub2Recv4DTO> list =new ArrayList<>();
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
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
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        list.add(new OpenSub2Recv4DTO("ㄴㄹㄹ","1월1일",30,R.drawable.profile2));
        return  list;
    }


}
package com.example.and09_fragmentadapter.recycler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;


public class RecyclerFragment extends Fragment {

    RecyclerView recv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_recycler, container, false);
        //Context:현재 앱의 모든 상태와 외부의 리소스 등에 접근하는 모든 기능들을 의미함.
        // 안드로이드 4대 컴포넌트는 모두 Context를 이용해서 만들어졌고 4대 컴포넌트들만 Context에 자유롭게 접근이 가능하다.
        // 4대 컴포넌트 <=Acitivity
        new NormalClass().testToast(getContext(),"프래그먼트이기때문에 get으로 받아옴");
        ArrayList<RecvDTO> list = getList() ;

        recv =v.findViewById(R.id.recv);
        recv.setAdapter(new AdapterRecv(inflater , list));
//        recv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recv.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }

    ArrayList<RecvDTO> getList(){
        // 데이터 10건을 포함하고 있는 ArrayList만들기

        ArrayList<RecvDTO> list = new ArrayList<>();
        list.add(new RecvDTO(R.drawable.img1,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img2,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img3,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img4,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img5,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img1,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img2,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img3,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img4,10,"김첫째","남자","농성동"));
        list.add(new RecvDTO(R.drawable.img5,10,"김첫째","남자","농성동"));
        return list;
    }

}
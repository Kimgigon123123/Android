package com.example.and09_fragmentadapter.grid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;


public class GridFragment extends Fragment {

    GridView gridv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_grid, container, false);


       ArrayList<GridDTO> list = new ArrayList<>();
       list.add(new GridDTO(R.drawable.img1,"짜장면"));
        list.add(new GridDTO(R.drawable.img2,"치킨"));
        list.add(new GridDTO(R.drawable.img3,"피자"));
        list.add(new GridDTO(R.drawable.img4,"떡볶이"));
        list.add(new GridDTO(R.drawable.img5,"돈까스"));

//        ArrayList<GridDTO> list2 = new ArrayList<>();
//        list2.add(new GridDTO(R.drawable.chart_img1,"1번노래"));


       gridv = v.findViewById(R.id.gridv);
       //1. 어떤 모양이든 상관없음 단 위젯을 두개 이상 포함하는 item_gridv 만들기
        //2. BaseAdapter를 상속받은 AdapterGridview 구현하기
        //3. gridv.setAdater(AdapterGridview);

//        AdapterGridView adapter =
//                new AdapterGridView(inflater,list);
//        gridv.setAdapter(adapter);

        AdapterGridView adapter =
                new AdapterGridView(inflater,list);
        gridv.setAdapter(adapter);


        return v;
    }


    public GridDTO onCreateGridDTO(){
        GridDTO dto = new GridDTO(1 ,"name");
        dto.setName("name4214");

        return new GridDTO(2 , "name2");
    }


}
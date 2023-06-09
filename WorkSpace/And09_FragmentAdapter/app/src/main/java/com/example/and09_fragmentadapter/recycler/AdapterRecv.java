package com.example.and09_fragmentadapter.recycler;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;
import java.util.List;

//2. extends로 AdapterClass를 상속 받는다.?
// 상속을 받을때 ViewHolder가 필요함RecyclerView.Adapter<VH>=>VH:ViewHolder
public class AdapterRecv extends RecyclerView.Adapter<AdapterRecv.KggViewHolder> {

    LayoutInflater inflater;
    ArrayList<RecvDTO> list;

    public AdapterRecv(LayoutInflater inflater, ArrayList<RecvDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }


    //레이아웃을 붙이고 (view) 해당하는 타입으로 ViewHolder를 만들어 내는 과정의 메소드
    @NonNull
    @Override
    public KggViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv,parent,false);
        return new KggViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull KggViewHolder h, int i) {
        h.imgv_profile.setImageResource(list.get(i).getImgRes());
        h.tv_name.setText(list.get(i).getName());
        h.tv_gender.setText(list.get(i).getGender());
        h.tv_address.setText(list.get(i).getAddress());
        h.tv_age.setText(list.get(i).getAge()+"");
    }


    //총 아이템의 개수
    @Override
    public int getItemCount() {
        return list.size();
    }


    //1. InnerClass로 ViewHolder를 먼저 만든다.
    // 위젯들을 묶어놓은 DTO라고 생각하면 됨. 리사이클러뷰는 ViewHolder를 강제한다. (재활용)
    // ViewHolder는 일반 InnerClass에 RecyclerView.ViewHolder를 상속받은 구조.

    public class KggViewHolder extends RecyclerView.ViewHolder {
        ImageView imgv_profile;
        TextView tv_gender,tv_name,tv_age,tv_address;
        Button btn_deail;

        public KggViewHolder(@NonNull View v)

        {

            super(v);
            imgv_profile=v.findViewById(R.id.imgv_profile);
            tv_gender=v.findViewById(R.id.tv_gender);
            tv_name=v.findViewById(R.id.tv_name);
            tv_age=v.findViewById(R.id.tv_age);
            tv_address=v.findViewById(R.id.tv_address);
            btn_deail=v.findViewById(R.id.btn_detail);



        }
    }

}

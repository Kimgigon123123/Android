package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemAroundRecv2Binding;
import com.example.dangguen.databinding.ItemAroundRecv3Binding;

import java.util.ArrayList;

public class AroundAdapter3 extends RecyclerView.Adapter<AroundAdapter3.ViewHolder>{

    ItemAroundRecv3Binding binding;

    ArrayList<AroundDTO3> list;

    Context context;

    public AroundAdapter3(ArrayList<AroundDTO3> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemAroundRecv3Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvPrice.setText(list.get(i).getTv_price()+"");
        h.binding.tvViews.setText(list.get(i).getTv_views()+"명이 보는 중");
        h.binding.imgvMain.setImageResource(list.get(i).getImgv_main());
        h.binding.tvBrand.setText(list.get(i).getTv_brand());
        h.binding.tvName.setText(list.get(i).getTv_name());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemAroundRecv3Binding binding;


        public ViewHolder(@NonNull ItemAroundRecv3Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }


}

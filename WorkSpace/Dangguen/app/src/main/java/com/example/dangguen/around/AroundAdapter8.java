package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemAroundRecv5Binding;
import com.example.dangguen.databinding.ItemAroundRecv8Binding;

import java.util.ArrayList;

public class AroundAdapter8 extends RecyclerView.Adapter<AroundAdapter8.ViewHolder>{

    ItemAroundRecv8Binding binding;



    ArrayList<AroundDTO8> list;

    Context context;

    public AroundAdapter8(ArrayList<AroundDTO8> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemAroundRecv8Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.tvBrand.setText(list.get(i).getTv_brand());
        h.binding.tvName.setText(list.get(i).getTv_name());
        h.binding.tvPrice.setText(list.get(i).getTv_price()+"");
        h.binding.tvViews.setText(list.get(i).getTv_saving()+"만원 절약");
        h.binding.imgvMain.setImageResource(list.get(i).getImgRes());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemAroundRecv8Binding  binding;

        public ViewHolder(@NonNull ItemAroundRecv8Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}

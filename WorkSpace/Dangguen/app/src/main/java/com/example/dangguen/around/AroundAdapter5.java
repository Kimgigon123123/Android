package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemAroundRecv5Binding;

import java.util.ArrayList;

public class AroundAdapter5 extends RecyclerView.Adapter<AroundAdapter5.ViewHolder>{

    ItemAroundRecv5Binding binding;

    ArrayList<AroundDTO5> list;

    public AroundAdapter5(ArrayList<AroundDTO5> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemAroundRecv5Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvMain.setImageResource(list.get(i).getImgv_main());
        h.binding.tvBuilding.setText(list.get(i).getTv_building());
        h.binding.tvDeposit.setText(list.get(i).getTv_deposit()+"");
        h.binding.tvPrice.setText(list.get(i).getTv_price()+"");
        h.binding.tvDong.setText(list.get(i).getTv_dong());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemAroundRecv5Binding  binding;

        public ViewHolder(@NonNull ItemAroundRecv5Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}

package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemAroundRecv1Binding;

import java.util.ArrayList;

public class AroundAdpater1 extends RecyclerView.Adapter<AroundAdpater1.ViewHolder> {

    ItemAroundRecv1Binding binding;

    ArrayList<AroundDTO1> list;
    Context context;

    public AroundAdpater1(ArrayList<AroundDTO1> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemAroundRecv1Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvRank.setText(list.get(i).getTv_rank()+"위");
        h.binding.tvTitle.setText("         "+list.get(i).getTv_title());
        h.binding.tvAddress.setText(list.get(i).getTv_address());
        h.binding.tvPrice.setText(list.get(i).getTv_price()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemAroundRecv1Binding binding;

        public ViewHolder(@NonNull ItemAroundRecv1Binding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }

}

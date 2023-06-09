package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemAroundRecv2Binding;

import java.util.ArrayList;

public class AroundAdpater2 extends RecyclerView.Adapter<AroundAdpater2.ViewHolder> {


    ItemAroundRecv2Binding binding;

    ArrayList<AroundDTO2> list;
    Context context;

    public AroundAdpater2(ArrayList<AroundDTO2> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemAroundRecv2Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.binding.imgvMain.setImageResource(list.get(i).getImgv_main());
    h.binding.imgvProfile.setImageResource(list.get(i).getImgv_profile());
    h.binding.tvTitle.setText(list.get(i).getTv_title());
    h.binding.tvAddress.setText(list.get(i).getTv_address());
    h.binding.tvDate.setText(list.get(i).getTv_date());
    h.binding.tvProfileName.setText(list.get(i).getTv_profile_name());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemAroundRecv2Binding binding;
        public ViewHolder(@NonNull ItemAroundRecv2Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}

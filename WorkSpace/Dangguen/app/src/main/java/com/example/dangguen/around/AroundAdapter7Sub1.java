package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemRecv4Sub1Binding;
import com.example.dangguen.databinding.ItemRecv7Sub1Binding;

import java.util.ArrayList;

public class AroundAdapter7Sub1 extends RecyclerView.Adapter<AroundAdapter7Sub1.ViewHolder>{

    ItemRecv7Sub1Binding binding;

    ArrayList<AroundDTO4Rcv1> list;

    public AroundAdapter7Sub1(ArrayList<AroundDTO4Rcv1> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemRecv7Sub1Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvDate.setText("걸어서 "+list.get(i).getTv_date()+"분");
        h.binding.tvContent.setText(list.get(i).getTv_content());
        h.binding.tvDistance.setText(" "+list.get(i).getTv_distance()+"m");
        h.binding.tvDong.setText(" "+list.get(i).getTv_dong());

        h.binding.tvName.setText(list.get(i).getTv_name());
        h.binding.imgvMain.setImageResource(list.get(i).getImgRes());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemRecv7Sub1Binding binding;

        public ViewHolder(@NonNull ItemRecv7Sub1Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}

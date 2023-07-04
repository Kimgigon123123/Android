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



    public AroundAdapter8( Context context) {

        this.context = context;
    }

    Context context;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemAroundRecv8Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {


    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemAroundRecv8Binding  binding;

        public ViewHolder(@NonNull ItemAroundRecv8Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}

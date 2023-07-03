package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemRecv4Sub1Binding;
import com.example.dangguen.databinding.ItemRecv7Sub1Binding;

public class AroundAdapter7Sub1 extends RecyclerView.Adapter<AroundAdapter7Sub1.ViewHolder>{

    ItemRecv7Sub1Binding binding;

    Context context;

    public AroundAdapter7Sub1(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemRecv7Sub1Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemRecv7Sub1Binding binding;

        public ViewHolder(@NonNull ItemRecv7Sub1Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}

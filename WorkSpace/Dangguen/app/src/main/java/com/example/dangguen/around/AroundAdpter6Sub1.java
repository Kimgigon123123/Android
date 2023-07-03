package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemRecv4Sub1Binding;
import com.example.dangguen.databinding.ItemRecv6Sub1Binding;

public class AroundAdpter6Sub1  extends RecyclerView.Adapter<AroundAdpter6Sub1.ViewHolder> {

    ItemRecv6Sub1Binding binding;

    Context context;

    public AroundAdpter6Sub1(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding= ItemRecv6Sub1Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemRecv6Sub1Binding binding;

        public ViewHolder(@NonNull ItemRecv6Sub1Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}

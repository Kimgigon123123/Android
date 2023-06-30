package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemAroundRecv2Binding;

public class AroundAdpater2 extends RecyclerView.Adapter<AroundAdpater2.ViewHolder> {


    ItemAroundRecv2Binding binding;
    Context context;

    public AroundAdpater2(Context context) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemAroundRecv2Binding binding;
        public ViewHolder(@NonNull ItemAroundRecv2Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}

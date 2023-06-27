package com.example.project01_kggtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kggtalk.databinding.ItemOpenSub2Recv1Binding;

import java.util.ArrayList;

public class OpenSub2Adapter extends RecyclerView.Adapter<OpenSub2Adapter.ViewHolder> {

    ItemOpenSub2Recv1Binding binding;
    ArrayList<OpenSub2Recv1DTO> list;
    Context context;

    public OpenSub2Adapter(ArrayList<OpenSub2Recv1DTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemOpenSub2Recv1Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

       h.binding.tvTitle.setText(list.get(i).getTitle());
       h.binding.tvViews.setText(list.get(i).getViews()+"");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemOpenSub2Recv1Binding binding;

    public ViewHolder(@NonNull ItemOpenSub2Recv1Binding binding) {
        super(binding.getRoot());
        this.binding=binding;
    }
}
}

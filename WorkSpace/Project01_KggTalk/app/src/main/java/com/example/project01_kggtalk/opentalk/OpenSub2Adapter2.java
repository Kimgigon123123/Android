package com.example.project01_kggtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kggtalk.databinding.ItemOpenSub2Recv1Binding;
import com.example.project01_kggtalk.databinding.ItemOpenSub2Recv2Binding;

import java.util.ArrayList;

public class OpenSub2Adapter2 extends RecyclerView.Adapter<OpenSub2Adapter2.ViewHolder> {

    ItemOpenSub2Recv2Binding binding;

    ArrayList<OpenSub2Recv2DTO> list;
    Context context;

    public OpenSub2Adapter2(ArrayList<OpenSub2Recv2DTO> list, Context context) {
        this.list = list;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemOpenSub2Recv2Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.imgvBackground.setImageResource(list.get(i).getImgRes());
        h.binding.tvTitle.setText(list.get(i).getTitle());
        h.binding.tvViews.setText(list.get(i).getViews()+"명");
        h.binding.tvDate.setText("  "+list.get(i).getDate());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemOpenSub2Recv2Binding binding;
        public ViewHolder(@NonNull ItemOpenSub2Recv2Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}

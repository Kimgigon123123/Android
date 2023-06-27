package com.example.project01_kggtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kggtalk.databinding.ItemOpenSub2Recv4Binding;

import java.util.ArrayList;

public class OpenSub2Adapter4 extends RecyclerView.Adapter<OpenSub2Adapter4.ViewHolder> {

    ItemOpenSub2Recv4Binding binding;
    ArrayList<OpenSub2Recv4DTO> list;
    Context context;

    public OpenSub2Adapter4(ArrayList<OpenSub2Recv4DTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemOpenSub2Recv4Binding.inflate(inflater,parent,false);
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

        ItemOpenSub2Recv4Binding binding;
        public ViewHolder(@NonNull ItemOpenSub2Recv4Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}

package com.example.project01_kggtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kggtalk.databinding.ItemOpenSub2Recv3Binding;

import java.util.ArrayList;

public class OpenSub2Adapter3 extends RecyclerView.Adapter<OpenSub2Adapter3.ViewHolder> {

    ItemOpenSub2Recv3Binding binding;
    ArrayList<OpenSub2Recv3DTO> list;
    Context context;

    public OpenSub2Adapter3(ArrayList<OpenSub2Recv3DTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemOpenSub2Recv3Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.binding.imgvRightImg.setImageResource(list.get(i).getImgRes());
    h.binding.tvTitle.setText(list.get(i).getTitle());
    h.binding.tvHashtag.setText(list.get(i).getHashtag());
    h.binding.tvLike.setText(" "+list.get(i).getLike()+"");
    h.binding.tvViews.setText(list.get(i).getViews()+"명");




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemOpenSub2Recv3Binding binding;

        public ViewHolder(@NonNull ItemOpenSub2Recv3Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}

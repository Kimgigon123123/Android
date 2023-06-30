package com.example.dangguen.dongne;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemDongneRecvBinding;

import java.util.ArrayList;

public class DongneAdapter extends RecyclerView.Adapter<DongneAdapter.ViewHolder> {

    ItemDongneRecvBinding binding;

    ArrayList<DongneDTO> list;

    Context context;

    public DongneAdapter(ArrayList<DongneDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemDongneRecvBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.imgvProductImg.setImageResource(list.get(i).getImgRes());
        h.binding.tvView.setText(list.get(i).getView()+"명");
        h.binding.tvAddress.setText(list.get(i).getAddress());
        h.binding.tvCategory.setText(list.get(i).getCategory());
        h.binding.tvComment.setText(" "+list.get(i).getComment()+"");
        h.binding.tvDate.setText(list.get(i).getDate());
        h.binding.tvLike.setText(" "+list.get(i).getLike()+"");
        h.binding.tvTitle.setText(list.get(i).getTilte());
        h.binding.tvContent.setText(list.get(i).getContent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        ItemDongneRecvBinding binding;

        public ViewHolder(@NonNull ItemDongneRecvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }


}

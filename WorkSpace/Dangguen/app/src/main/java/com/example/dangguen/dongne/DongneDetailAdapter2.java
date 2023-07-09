package com.example.dangguen.dongne;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemDongneDetailRecvBinding;

import java.util.ArrayList;

public class DongneDetailAdapter2 extends RecyclerView.Adapter<DongneDetailAdapter2.ViewHolder> {

    ItemDongneDetailRecvBinding binding;
    ArrayList<String> comment;

    Context context;

    public DongneDetailAdapter2(ArrayList<String> comment, Context context) {
        this.comment=comment;
        this.context = context;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemDongneDetailRecvBinding.inflate(inflater,parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvComment.setText(comment.get(i));
    }

    @Override
    public int getItemCount() {
        return comment.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        ItemDongneDetailRecvBinding binding;

        public ViewHolder(@NonNull ItemDongneDetailRecvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }


}

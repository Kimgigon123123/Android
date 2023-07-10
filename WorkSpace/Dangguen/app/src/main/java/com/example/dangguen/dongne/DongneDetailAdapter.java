package com.example.dangguen.dongne;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemDongneDetailRecvBinding;
import com.example.dangguen.databinding.ItemDongneRecvBinding;
import com.example.dangguen.databinding.ItemHomeRecvBinding;

public class DongneDetailAdapter extends RecyclerView.Adapter<DongneDetailAdapter.ViewHolder> {

    ItemDongneDetailRecvBinding binding;

    Context context;

    public DongneDetailAdapter(Context context) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        ItemDongneDetailRecvBinding binding;

        public ViewHolder(@NonNull ItemDongneDetailRecvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }


}

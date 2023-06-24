package com.example.project01_kggtalk_practice.friend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kggtalk_practice.databinding.ItemFriendBinding;

import java.util.ArrayList;

public class FriendAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ItemFriendBinding binding;

    ArrayList<FriendDTO> list;

    public FriendAdapter(ArrayList<FriendDTO> list) {

        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemFriendBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder h, int i) {
        binding.imgvProfile.setImageResource(list.get(i).getResImgId());
        binding.tvName.setText(list.get(i).getName());
    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemFriendBinding binding;

        public ViewHolder(@NonNull ItemFriendBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }

}

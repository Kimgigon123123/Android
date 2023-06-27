package com.example.project01_kggtalk.chat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kggtalk.databinding.ItemChatRecvBinding;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    ItemChatRecvBinding binding;
    ArrayList<ChatDTO> list;
    Context context;

    public ChatAdapter(ArrayList<ChatDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChatRecvBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getImgRes());
        h.binding.tvName.setText(list.get(i).getName());
        h.binding.tvDate.setText(list.get(i).getDate());
        h.binding.tvMsg.setText(list.get(i).getMsg());

        h.binding.intoChating.setOnClickListener(v->{
            Intent intent = new Intent(context,ChatDetailActivity.class);
            intent.putExtra("dto",list.get(i));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemChatRecvBinding binding;

        public ViewHolder(@NonNull ItemChatRecvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}

package com.example.dangguen.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemChatDetailRecvBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChatDetailAdapter extends RecyclerView.Adapter<ChatDetailAdapter.ViewHolder> {

    ItemChatDetailRecvBinding binding;
    ArrayList<ChatDetailDTO> list;
    Context context;


    public ChatDetailAdapter(ArrayList<ChatDetailDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChatDetailRecvBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvContent.setText(list.get(i).getTv_content());
        h.binding.tvDate.setText(list.get(i).getTv_date());
        h.binding.btnButton.setText(list.get(i).getBtn_button());
        h.binding.tvTime.setText(list.get(i).getTv_time());
        h.binding.imgvMain.setImageResource(list.get(i).getImgv_main());
        h.binding.imgvProfile.setImageResource(list.get(i).getImgv_profile());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemChatDetailRecvBinding binding;

        public ViewHolder(@NonNull ItemChatDetailRecvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }


}

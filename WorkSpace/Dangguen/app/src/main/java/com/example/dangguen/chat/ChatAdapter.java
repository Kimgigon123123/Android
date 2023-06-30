package com.example.dangguen.chat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemChatReccvBinding;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    ItemChatReccvBinding binding;
    Context context;

    public ChatAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChatReccvBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.intoChat.setOnClickListener(v->{
            Intent intent = new Intent(context, ChatDetailActivity.class);

            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


            ItemChatReccvBinding binding;
        public ViewHolder(@NonNull ItemChatReccvBinding binding) {
                super(binding.getRoot());
                this.binding=binding;
            }
        }
    }



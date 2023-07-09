package com.example.dangguen.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemHomeRecvBinding;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    ItemHomeRecvBinding binding;
    ArrayList<HomeDTO> list;
    Context context;

    public HomeAdapter(ArrayList<HomeDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemHomeRecvBinding.inflate(inflater,parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProductImg.setImageResource(list.get(i).getImgRes());
        h.binding.tvPrice.setText(list.get(i).getPrice()+"");
        h.binding.tvComment.setText(" "+list.get(i).getComment()+"");
        h.binding.tvFavorite.setText(" "+list.get(i).getFavorite()+"");
        h.binding.tvTitle.setText(list.get(i).getTitle());
        h.binding.tvAddress.setText(list.get(i).getAddress());
        h.binding.tvDate.setText(list.get(i).getDate());

        h.binding.lnHome.setOnClickListener(v -> {

            list.get(i).setViews(list.get(i).getViews()+1);
            Intent intent =  new Intent(context,HomeDetailActivity.class);
            intent.putExtra("dto",list.get(i));
            context.startActivity(intent);

//            Intent intent2 = new Intent(context,HomeDetailFragment.class);
//            intent2.putExtra("dto",list.get(i));
//            context.startActivity(intent2);
        });


//        int imgRes, int price, int comment, int favorite, String title, String address, String date
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemHomeRecvBinding binding;

        public ViewHolder(@NonNull ItemHomeRecvBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}

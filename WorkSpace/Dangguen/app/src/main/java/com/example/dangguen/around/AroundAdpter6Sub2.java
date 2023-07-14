package com.example.dangguen.around;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dangguen.databinding.ItemRecv6Sub1Binding;
import com.example.dangguen.databinding.ItemRecv6Sub2Binding;

import java.util.ArrayList;

public class AroundAdpter6Sub2 extends RecyclerView.Adapter<AroundAdpter6Sub2.ViewHolder> {

    ItemRecv6Sub2Binding binding;

    ArrayList<AroundDTO6Rcv2> list;
    Context context;

    public AroundAdpter6Sub2( ArrayList<AroundDTO6Rcv2> list,Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding= ItemRecv6Sub2Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvMain1.setImageResource(list.get(i).getImgRes1());
        h.binding.tvTitle1.setText(list.get(i).getTv_title1());
        h.binding.tvContent1.setText(list.get(i).getTv_content1());
        h.binding.tvAddress1.setText(" "+list.get(i).getTv_address1());
        h.binding.tvDate1.setText(list.get(i).getTv_date1());

        h.binding.imgvMain2.setImageResource(list.get(i).getImgRes2());
        h.binding.tvTitle2.setText(list.get(i).getTv_title2());
        h.binding.tvContent2.setText(list.get(i).getTv_content2());
        h.binding.tvAddress2.setText(" "+list.get(i).getTv_address2());
        h.binding.tvDate2.setText(list.get(i).getTv_date2());

        h.binding.imgvMain3.setImageResource(list.get(i).getImgRes3());
        h.binding.tvTitle3.setText(list.get(i).getTv_title3());
        h.binding.tvContent3.setText(list.get(i).getTv_content3());
        h.binding.tvAddress3.setText(" "+list.get(i).getTv_address3());
        h.binding.tvDate3.setText(list.get(i).getTv_date3());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemRecv6Sub2Binding binding;

        public ViewHolder(@NonNull ItemRecv6Sub2Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}

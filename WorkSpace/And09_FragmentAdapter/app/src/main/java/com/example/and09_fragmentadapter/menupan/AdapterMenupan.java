package com.example.and09_fragmentadapter.menupan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AdapterMenupan extends RecyclerView.Adapter<AdapterMenupan.MenupanViewHolder>{

    LayoutInflater inflater;
    ArrayList<MenupanDTO> list;

    public AdapterMenupan(LayoutInflater inflater, ArrayList<MenupanDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public MenupanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_menupan,parent,false);
        return new MenupanViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenupanViewHolder h, int i) {

        h.imgv_menu.setImageResource(list.get(i).getImgRes());
        h.tv_name.setText(list.get(i).getName());
        h.tv_price.setText(list.get(i).getPrice()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MenupanViewHolder extends RecyclerView.ViewHolder{

        ImageView imgv_menu;
        TextView tv_name,tv_price;

        public MenupanViewHolder(@NonNull View itemView) {
            super(itemView);
            imgv_menu=itemView.findViewById(R.id.imgv_menu);
            tv_name=itemView.findViewById(R.id.tv_name);
            tv_price=itemView.findViewById(R.id.tv_price);
        }
    }

}

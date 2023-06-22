package com.example.and09_fragmentadapter.grid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and09_fragmentadapter.R;
import com.example.and09_fragmentadapter.listv.ListDTO;

import java.util.ArrayList;

public class AdapterGridView extends BaseAdapter {

    LayoutInflater inflater;
    ArrayList<GridDTO> list;

    public AdapterGridView(LayoutInflater inflater, ArrayList<GridDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {

        v=inflater.inflate(R.layout.item_gridveiw,parent,false);
        ImageView grid_img = v.findViewById(R.id.grid_img);
        grid_img.setImageResource(list.get(position).getImgRes());
        TextView grid_tv = v.findViewById(R.id.grid_tv);
        grid_tv.setText(list.get(position).getName());

        return v;
    }
}

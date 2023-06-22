package com.example.and09_fragmentadapter.practice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;

public class AdapterPractice extends RecyclerView.Adapter<AdapterPractice.practiceViewHolder> {

    LayoutInflater inflater;

    ArrayList<PracticeDTO> list;

    public AdapterPractice(LayoutInflater inflater, ArrayList<PracticeDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public practiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_practice,parent,false);

        return new practiceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull practiceViewHolder h, int i) {
        h.practice_img.setImageResource(list.get(i).getImgRes());
        h.tv_rank.setText(list.get(i).getRank()+"");
        h.tv_title.setText(list.get(i).getTitle());
        h.tv_singer.setText(list.get(i).getSinger());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class practiceViewHolder extends RecyclerView.ViewHolder{

        ImageView practice_img;
        TextView tv_rank,tv_title,tv_singer;
        Button btn_play;


        public practiceViewHolder(@NonNull View itemView) {
            super(itemView);
            practice_img=itemView.findViewById(R.id.practice_img);
            tv_rank=itemView.findViewById(R.id.tv_rank);
            tv_title=itemView.findViewById(R.id.tv_title);
            tv_singer=itemView.findViewById(R.id.tv_singer);


        }
    }

}

package com.example.project01_kggtalk.opentalk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kggtalk.R;
import com.example.project01_kggtalk.databinding.FragmentOpenSub2Binding;
import com.example.project01_kggtalk.databinding.ItemOpenSub2Recv5Binding;
import com.example.project01_kggtalk.databinding.ItemOpenSub2Recv6Binding;

import java.util.ArrayList;

public class OpenSub2Adapter5 extends RecyclerView.Adapter<OpenSub2Adapter5.ViewHolder> {


    ItemOpenSub2Recv5Binding binding;
    ArrayList<OpenSub2Recv5DTO> list;
    Context context;

    public OpenSub2Adapter5(ArrayList<OpenSub2Recv5DTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding=ItemOpenSub2Recv5Binding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

        h.binding.tvTitle.setText(list.get(i).getTitle());
        h.binding.imgvBackground.setImageResource(list.get(i).getImgRes());
        h.binding.open2Recv6.setAdapter(new SubAdapter());
        h.binding.open2Recv6.setLayoutManager(new LinearLayoutManager(context));
//        binding.open2Recv3.setAdapter(new OpenSub2Adapter3(getList3(),getContext()));
//        binding.open2Recv3.setLayoutManager(new LinearLayoutManager(getContext()));

    }

    public ArrayList<OpenSub2Recv6DTO> getList(){
        ArrayList<OpenSub2Recv6DTO> list = new ArrayList<>();
        list.add(new OpenSub2Recv6DTO("제목1", R.drawable.profile3));
        list.add(new OpenSub2Recv6DTO("제목2",R.drawable.profile4));
        return list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SubAdapter extends RecyclerView.Adapter<ViewHolder_Sub>{
        ItemOpenSub2Recv6Binding binding;
        @NonNull
        @Override
        public ViewHolder_Sub onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            binding = ItemOpenSub2Recv6Binding.inflate(LayoutInflater.from(parent.getContext()) , parent,false);
            return new ViewHolder_Sub(binding);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder_Sub h, int i) {

        }

        @Override
        public int getItemCount() {
            return getList().size();
        }
    }
    public class ViewHolder_Sub extends RecyclerView.ViewHolder{
        ItemOpenSub2Recv6Binding binding;
        public ViewHolder_Sub(@NonNull ItemOpenSub2Recv6Binding binding) {
            super(binding.getRoot());
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemOpenSub2Recv5Binding binding;
        public ViewHolder(@NonNull ItemOpenSub2Recv5Binding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}

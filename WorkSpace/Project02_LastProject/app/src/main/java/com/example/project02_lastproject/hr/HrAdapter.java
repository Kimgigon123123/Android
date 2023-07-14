package com.example.project02_lastproject.hr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project02_lastproject.databinding.ItemRecvHrBinding;

import java.util.ArrayList;

public class HrAdapter extends RecyclerView.Adapter<HrAdapter.ViewHolder>{

    ItemRecvHrBinding binding;
    ArrayList<HrVO> list;
    Context context;

    public HrAdapter(ArrayList<HrVO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemRecvHrBinding.inflate(inflater,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvName.setText(list.get(i).getName());
        h.binding.tvEmployeeId.setText("("+list.get(i).getEmployee_id()+")");
        h.binding.tvEmail.setText(list.get(i).getEmail());
        h.binding.tvDepartmentName.setText(list.get(i).getDepartment_name());
        h.binding.tvSalary.setText(list.get(i).getSalary());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemRecvHrBinding binding;
        public ViewHolder(@NonNull ItemRecvHrBinding binding) {
            super(binding.getRoot());
            this.binding =binding;
        }
    }

}

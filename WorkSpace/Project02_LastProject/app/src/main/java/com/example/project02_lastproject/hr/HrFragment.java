package com.example.project02_lastproject.hr;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project02_lastproject.R;
import com.example.project02_lastproject.common.CommonConn;
import com.example.project02_lastproject.customer.CustomerAdapter;
import com.example.project02_lastproject.customer.CustomerVO;
import com.example.project02_lastproject.databinding.FragmentCustomerBinding;
import com.example.project02_lastproject.databinding.FragmentHrBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;


public class HrFragment extends Fragment {

    FragmentHrBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        select();
        binding = FragmentHrBinding.inflate(inflater,container,false);


        binding.btnSearch.setOnClickListener(v -> {
            CommonConn conn = new CommonConn(getContext(),"search");
            conn.addParamMap("department_name",binding.edtSearch.getText().toString());
            conn.onExcute((isResult, data) -> {
                ArrayList<HrVO> list = new Gson().fromJson(data, new TypeToken<ArrayList<HrVO>>() {
                }.getType());
                binding.recvHr.setAdapter(new HrAdapter(list, getContext()));
                binding.recvHr.setLayoutManager(new LinearLayoutManager(getContext()));
            });
        });

        return binding.getRoot();



    }



    public void select() {
        CommonConn conn = new CommonConn(getContext(), "hr");
        conn.onExcute((isResult, data) -> {
            Log.d("결과값", "select: " + data);
            ArrayList<HrVO> list = new Gson().fromJson(data, new TypeToken<ArrayList<HrVO>>() {
            }.getType());
            Log.d("리스트 사이즈", "select: " + list.size());

            binding.recvHr.setAdapter(new HrAdapter(list, getContext()));
            binding.recvHr.setLayoutManager(new LinearLayoutManager(getContext()));

        });
    }
}
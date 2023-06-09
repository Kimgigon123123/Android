package com.example.project02_lastproject.customer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project02_lastproject.common.CommonConn;
import com.example.project02_lastproject.databinding.FragmentCustomerBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;


public class CustomerFragment extends Fragment {
    FragmentCustomerBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCustomerBinding.inflate(inflater,container,false);
        select();
        //인터페이스내부의 메소드가 별도의 파라메터가 없다면 람다식에서는 ()표시후 ->{} , v->{}
        binding.swipeCustomer.setOnRefreshListener(()->{
        select();
        binding.swipeCustomer.setRefreshing(false);
        });

        binding.flbtnInsert.setOnClickListener(v->{
            CustomerDialog dialog = new CustomerDialog(getContext(), null);
            dialog.show();
        });


        return binding.getRoot();
    }

    public void select(){
        CommonConn conn = new CommonConn(getContext(),"list.cu");
        conn.onExcute((isResult, data) -> {
            Log.d("결과값", "select: "+data);
            ArrayList<CustomerVO> list = new Gson().fromJson(data,new TypeToken<ArrayList<CustomerVO>>(){}.getType());
            Log.d("리스트 사이즈", "select: "+list.size());

            binding.reccvCustomer.setAdapter(new CustomerAdapter(list,getContext()));
            binding.reccvCustomer.setLayoutManager(new LinearLayoutManager(getContext()));

        });
    }
}
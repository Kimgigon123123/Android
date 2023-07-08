package com.example.dangguen.dongne;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentDongneBinding;
import com.example.dangguen.databinding.FragmentDongneDetailBinding;
import com.example.dangguen.databinding.FragmentHomeDetailBinding;
import com.example.dangguen.home.HomeAdapter;
import com.example.dangguen.home.HomeDTO;


public class DongneDetailFragment extends Fragment {


    int comment ;
    FragmentDongneDetailBinding binding;

    public DongneDetailFragment(DongneDTO dto) {
    }

    public DongneDetailFragment(int comment){
        this.comment=comment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentDongneDetailBinding.inflate(inflater,container,false);

        if(comment==1){
            binding.recvComment.setAdapter(new DongneDetailAdapter(getContext()));
            binding.recvComment.setLayoutManager(new LinearLayoutManager(getContext()));
        }




        return binding.getRoot();
    }
}
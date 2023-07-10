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

import java.util.ArrayList;


public class DongneDetailFragment extends Fragment {


   ArrayList<String> comment;
   int i;
    FragmentDongneDetailBinding binding;
    DongneDTO dto;

    public DongneDetailFragment(DongneDTO dto) {
        this.dto = dto;
    }




    public DongneDetailFragment(ArrayList<String> comment, int i,DongneDTO dto) {
        this.comment=comment;
        this.i=i;
        this.dto=dto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentDongneDetailBinding.inflate(inflater,container,false);

        binding.tvTitle.setText(dto.getTilte());
        binding.tvContent.setText(dto.getContent());
        binding.tvCategory.setText(dto.getCategory());
        binding.tvComment.setText( dto.getComment()+"");
        binding.tvViews.setText("조회수 " +dto.getView());
        binding.tvAddress.setText(dto.getAddress());
        binding.tvDate.setText(dto.getDate());
        binding.tvLike.setText(dto.getLike()+"");
        binding.imgvMain.setImageResource(dto.getImgRes());
        binding.imgvProfile.setImageResource(dto.getImgProfile());
        binding.tvFavorite.setText(dto.getFavorite()+"");
        binding.tvProfileName.setText(dto.getNickname());




        if(i>=1){

            binding.recvComment.setAdapter(new DongneDetailAdapter2(comment,getContext()));
            binding.recvComment.setLayoutManager(new LinearLayoutManager(getContext()));
        }




        return binding.getRoot();
    }
}
package com.example.dangguen.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.chat.ChatAdapter;
import com.example.dangguen.databinding.FragmentChatBinding;
import com.example.dangguen.databinding.FragmentHomeDetailBinding;


public class HomeDetailFragment extends Fragment {

    FragmentHomeDetailBinding binding;

    HomeDTO dto;

    public HomeDetailFragment(HomeDTO dto) {
        this.dto = dto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentHomeDetailBinding.inflate(inflater,container,false);

        binding.tvDate.setText(dto.getDate());
        binding.imgvMain.setImageResource(dto.getImgRes());
        binding.tvTitle.setText(dto.getTitle());
        binding.tvAddress.setText(dto.getAddress());
        binding.tvComment.setText(dto.getComment()+"");
        binding.tvLike.setText(dto.getFavorite()+"");
        binding.tvViews.setText(dto.getViews()+"");
        binding.tvContent.setText(dto.getContent());
        binding.tvProfileName.setText(dto.getName());
        binding.tvTipName.setText("            "+dto.getName()+"님과 거래할 때, 당근페이를 이용해 보세요! 간편하게 송금할 수 있어요.");
        binding.imgvProfile.setImageResource(dto.getProfileImg());


        return binding.getRoot();
    }
}
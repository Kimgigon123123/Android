package com.example.dangguen.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       binding=FragmentHomeBinding.inflate(inflater,container,false);
        binding.recvHome.setAdapter(new HomeAdapter(getList(),getContext()));
        binding.recvHome.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.btnWrite.setOnClickListener(v->{
            WriteDialog dialog = new WriteDialog(getContext());
            dialog.show();
        });

        return binding.getRoot();
    }

    public ArrayList<HomeDTO> getList(){
        ArrayList<HomeDTO> list = new ArrayList<>();
        list.add(new HomeDTO(R.drawable.home_img1,300000,2,12,"정말 급해서 어쩔수 없이 팔아요...","남구 주월2동","4시간 전",R.drawable.chat_img1,30,"당근이조아","갑자기 급전이 필요해서 싸게 팔아요!!"));
        list.add(new HomeDTO(R.drawable.home_img2,40000,0,10,"나무 화장대","월산5동","11시간 전",R.drawable.baseline_person_24,402,"해버굿타임","1년 가량 사용한 화장대 입니다! 수납공간 좋고 튼튼해요 :) \n 크기가 커서 가지러 오셔야합니다!"));
        list.add(new HomeDTO(R.drawable.home_img3,300000,4,11,"아이폰11프로","화정동","6시간 전",R.drawable.baseline_person_24,57,"nerd22","케이스도 드릴게요"));
        list.add(new HomeDTO(R.drawable.home_img4,50000,0,4,"PC선반으로 쓰던 테이블 판매합니다!","북구 신안동","1시간 전",R.drawable.baseline_person_24,344,"기차","가볍습니다! 1년전에 쇼핑몰에서 구매한 제품입니다! \n 기스는 없습니다! PC를 사고 반년만에 팔았거든요! \n 직접가지러오셔야하고 \n \n 직접가지러오셔야하고 \n 사이즈는 1400x600 입니다. \n 그때 4~6인 조립테이블 이라고 해서 구매했습니다."));
        list.add(new HomeDTO(R.drawable.home_img5,330000,0,9,"3돈 반지","화정동","22시간 전",R.drawable.baseline_person_24,1065,"똑순이","낱개로 구매 가능해요 \n순금특성상 잘찌그러지는거 아시죠? \n순금 모으시거나 녹여서 3돈 반지나 금보태시는분들 \n가져가세요 개당32만원 \n오늘날짜로 순금한돈당 34만원 입니다."));
        list.add(new HomeDTO(R.drawable.home_img6,700000,2,3,"디올 클러치","화정 1동","2시간 전",R.drawable.baseline_person_24,210,"하품","구매후 거의 든 적 없이 보관만 했습니다 ㅎㅎ 당연히 모서리 까짐이나 이염 없구요 내부도 꺠끗합니다 거의 새상품급 이예요!!"));
        list.add(new HomeDTO(R.drawable.home_img7,5000,1,5,"오늘비움 팔아요","농성1동","1일 전",R.drawable.baseline_person_24,13,"하하맨"," "));
        return list;
    }
}
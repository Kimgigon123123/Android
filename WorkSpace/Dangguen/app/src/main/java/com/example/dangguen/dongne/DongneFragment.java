package com.example.dangguen.dongne;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dangguen.R;
import com.example.dangguen.databinding.FragmentDongneBinding;

import java.util.ArrayList;


public class DongneFragment extends Fragment {


    FragmentDongneBinding binding;
    String[] category = {"인기글","동네맛집","동네질문","동네소식","생활정보","취미생활","일상"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentDongneBinding.inflate(inflater,container,false);
        binding.recvDongne.setAdapter(new DongneAdapter(getList(),getContext()));
        binding.recvDongne.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot();
    }

   public ArrayList<DongneDTO> getList(){
        ArrayList<DongneDTO> list = new ArrayList<>();
        list.add(new DongneDTO(category[0],"안녕하세요~ 혹시 진월동/월산동쪽","A4용지 낱장으로 구매 가능한곳 있을까요?","월산동","1시간 전",17,2,0,0));
       list.add(new DongneDTO(category[1],"혹시 소형냉장고 고칠수있는데","아시는분 있을까요?","농성1동","9시간 전",21,0,2,0));
       list.add(new DongneDTO(category[2],"쿠팡체험단이 뭔가용? 저도 해보고 싶어용","","광천동","9시간 전",104,0,3,0));
       list.add(new DongneDTO(category[3],"KB국민카드 찾아가세요","월산5동 서울내과의원입니다 \n 할머니 환자분께서 길에서 주웠다고 하시네요 \n 습득하신 위치는 모르는데 카드에 성함 적혀 있어서 \n올려봅니다","화정동","1일 전",30,2,0,R.drawable.dongne_img1));
       list.add(new DongneDTO(category[4],"지게차 자격증","지게차 자격증 좀 딸려고 하는데 광주에 지게차 학원 없나용","화정동","16시간 전",178,0,12,0));
       list.add(new DongneDTO(category[5],"운동 좋아하시는 분!?","다시 운동을 하려는데 의지부족이라 같이 하실 분 구합니다!! \n 비슷한 나이대(20대)","화정동","16시간 전",172,0,2,0));
       list.add(new DongneDTO(category[6],"터미널 이마트","계산대 앞 닭강정... 깜놀.. \n 어머니가 만오천원짜리 닭강정을 사오셨는데.. \n 이게.. 뭐징..? \n 함깨 먹을려고 벌려보지도 않았는데 이런이런...","농성동","3시간 전",1002,3,12,R.drawable.dongne_img2));
       list.add(new DongneDTO(category[0],"당근","당근 진상 사람 무엇을 있을까요?(에피소드 포함)","월산4동","그저께",322,0,3,0));


       return list;
    }

}
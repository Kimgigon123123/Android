package com.example.dangguen.chat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;

import com.example.dangguen.R;
import com.example.dangguen.databinding.ActivityChatDetailBinding;
import com.example.dangguen.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class ChatDetailActivity extends AppCompatActivity {


    ActivityChatDetailBinding binding;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityChatDetailBinding.inflate(getLayoutInflater());

       // Context context = this;//나자신이 컨텍스트(화면에 떠있는 정보를 알수있음.)

        binding.chatDetailRecv.setAdapter(new ChatDetailAdapter(getList(),this));
        binding.chatDetailRecv.setLayoutManager(new LinearLayoutManager(this));
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);
        actionBar.setTitle("당근마켓");
    }

    public ArrayList<ChatDetailDTO> getList(){
        ArrayList<ChatDetailDTO> list = new ArrayList<>();

        list.add(new ChatDetailDTO(R.drawable.chat_img1,R.drawable.chat_detail_img1,"2023년 3월 22일","오후 1:44","첫 사용 가이드 보기",
                " 사람님, 반갑습니당! \n 동네 이웃과 거래하기 전, 첫 \n 가이드를 꼭 읽어보세요 :)"));

        list.add(new ChatDetailDTO(R.drawable.chat_img1,R.drawable.chat_detail_img2,"2023년 3월 29일","오전 10:45","판매 방법 알아보기",
                "(수줍) 사람님, 지금이 \n바로~ 집 정리할 타이밍! \n사용하지 않는 물건들을 농성동 \n근처에서 판매해보세요"));

        list.add(new ChatDetailDTO(R.drawable.chat_img1,R.drawable.chat_detail_img3,"2023년 4월 1일","오후 5:03","관심 자세히 보기",
                "사람님만의 관심 목록을 \n만들어보세요. 가격이 내려가면 \n알림도 받을 수 있다구요! (뿌듯)"));

        list.add(new ChatDetailDTO(R.drawable.chat_img1,R.drawable.chat_detail_img4,"2023년 4월 8일","오후 6:43","검색하기",
                " (어머) 사람님, 아직도 \n 검색을 안 해보셨나요? 지금 \n 농성동 근처에서 올라온 \n 따끈따끈한 매물들을 \n 검색해보세요"));

        list.add(new ChatDetailDTO(R.drawable.chat_img1,R.drawable.chat_detail_img5,"2023년 4월 28일","오후 1:11","키워드 등록하기",
                " 사람님, 농성동 근처에서 \n 다양한 물품들이 매일 올라오고 \n 있어요. 알림을 받으려면 \n 키워드를 등록해보세요!"));


        return list;



    }


}
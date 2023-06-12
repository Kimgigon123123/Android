package com.example.and05_etclayoutscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       TextView tv_text = findViewById(R.id.tv_text); //내가 레이아웃(activity_main)에 만든 위젯을 찾아서 java코드 변수로 초기화
        Button btn_scroll = findViewById(R.id.btn_scroll);
        ScrollView scrollView = findViewById(R.id.scrollview);
        HorizontalScrollView horizon_sroll = findViewById(R.id.horizon_scroll);
//        TextView.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR // <=Static Member :  클래스가 인스턴스화 하지 않아도 메모리에 이미 올라가있는 멤버

//        tv_text.append(); // < = Member // <= InstenceMember:

//        tv_text.append("안녕하세요2"); // 기존 문자열에 새로운 문자열을 붙임
        for(int i=0; i <=50;i++){
            tv_text.append("안녕하세요"+i+"\n");



        }

        btn_scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("스크롤 위치", "getScollY"+scrollView.getScrollY());
                scrollView.scrollTo(0, scrollView.getScrollY()+100);
            }
        });



        for (int i =0 ; i<=10; i++ ){
            for(int j=0; j<=10; j++){
                tv_text.append("안녕하세요"+j);
            }
            tv_text.append("\n");

        }


        btn_scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("스크롤 위치", "onClick: getScolly:"+scrollView.getScrollY());
                horizon_sroll.scrollTo(horizon_sroll.getScrollX()+100,0 );
            }
        });

        //static키워드가 있어서 초기화 과정없이 사용가능 Kgg.ATTR
        //static키워드가 없어서 초기화 시켜야만 사용가능 .new Kgg().append



    }
}
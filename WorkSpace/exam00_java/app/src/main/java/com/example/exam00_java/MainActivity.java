package com.example.exam00_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //getSum이라는 메소드 만들기. (숫자 두개(아무거나)를 입력받아서 두 수의 합을 구하는 메소드이다.)

    TextView tv1;
    Button btn1,btn2,btn3;

    //메서드는 구현이 자유롭다.
    //실행은 항상 사용하는곳에서 호출을 해줘야지만 됨.



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);

        //CalcDAO에 있는 getSum메소드 호출해보기

        ClacDAO dao = new ClacDAO();
//        dao.getSum(20,30,tv1,btn1);
        dao.num1=1;
        dao.num2=1;
        dao.num4=1;
        ClacDAO.num5=1;
        ClacDAO.num7=1;
        ClacDAO.getSum();
        tv1.setText(dao.getSum(1,2)+"");
        btn1.setText(dao.getSum(1,5)+"");
        ClacDAO.ChildClass  cc = dao.new ChildClass();
        cc.fieldChild = 9;
        ClacDAO.StaticChildClass cs = new ClacDAO.StaticChildClass();
        //getSum(10,20);// 메소드가 구현(정의)되어있는 파라메터부 = 호출부의 파라메터 값을 합치면 변수 초기화식이된다.
        KggCallback callback = new KggCallback() {
            @Override
            public void onResponse(String data) {
                Log.d("성공", "onResponse: ㅅㄱ");
            }

            @Override
            public void onFailure(String data) {
                Log.d("실패", "onResponse:ㅅㅍ ");
            }

        };

        callback.onResponse("성공");
        callback.onFailure("실패");
    }

    public interface KggCallback{

        public void onResponse(String data);
        public void onFailure(String data);
    }

}
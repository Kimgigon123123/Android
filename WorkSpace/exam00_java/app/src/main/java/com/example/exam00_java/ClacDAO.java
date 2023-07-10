package com.example.exam00_java;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

//계산용 DAO
public class ClacDAO {
    //클래스의 멤버는 크게 2가지가 있다.
    //인스턴스멤버, 스태틱멤버
    //왜 멤버를 나눠서 사용을할까???
    //=>
    int num1,num2; //어떤멤버일까? 인
    private int num3; //  인
    public int num4; // 인
    static int num5; // 스
    private static int num6; // 스
    public static int num7; // 스

    public int getSum(int num1,int num2){
        return  num1+num2;
    }

    public static int getSum(){
        return 0;
    }

    public class ChildClass{
        int fieldChild;
    }

    public static class StaticChildClass{
        int fieldChild;
    }


    //지역변수 (메소드 내부에서 선언되어 사용되는 변수)
    public int method(){
        //외부에서 절대로 접근이 불가능하다 ==> return이 필요하다
        int num1=0; //지역변수
        ClacDAO dao = new ClacDAO(); //지역변수
        return num1;
    }


    //void타입은 리턴이 없는 메소드임. 결과를 받을수가없다(외부)
//    public void getSum(int num1, int num2, TextView tv1, Button btn1){
//        Log.d("두수의 합", "getSum: "+(num1+num2));
////        tv1=findViewById(R.id.tv1);
//        tv1.setText(num1+num2+"");
//        btn1.setText(num1+num2+"");
//    }

}

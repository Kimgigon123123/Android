package com.example.test00_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        Intent intent = getIntent();
        int money = intent.getIntExtra("show_money",0);
        TextView tv_money = findViewById(R.id.txt_cash);
        tv_money.setText("잔액: "+money+"원");


            int ucola = intent.getIntExtra("show_cola_cnt",0);
            if(ucola!=0){
                String cola = intent.getStringExtra("show_cola");
                TextView tv_cola = findViewById(R.id.colaname);

                TextView tv_cola_cnt = findViewById(R.id.colacnt);
                tv_cola.setText(cola);
                tv_cola_cnt.setText(ucola + "개");
            }



        int ucider = intent.getIntExtra("show_cider_cnt",0);
        if(ucider!=0){
            String cider = intent.getStringExtra("show_cider");
            TextView tv_cider = findViewById(R.id.cidername);

            TextView tv_cider_cnt = findViewById(R.id.cidercnt);
            tv_cider.setText(cider);
            tv_cider_cnt.setText(ucider+"개");
        }


        int ufanta = intent.getIntExtra("show_fanta_cnt",0);
        if(ufanta!=0){
            String fanta = intent.getStringExtra("show_fanta");
            TextView tv_fanta = findViewById(R.id.fantaname);

            TextView tv_fanta_cnt = findViewById(R.id.fantacnt);
            tv_fanta.setText(fanta);
            tv_fanta_cnt.setText(ufanta+"개");
        }



        int usoda = intent.getIntExtra("show_soda_cnt",0);
        if(usoda!=0){
            String soda = intent.getStringExtra("show_soda");
            TextView tv_soda = findViewById(R.id.sodaname);

            TextView tv_soda_cnt = findViewById(R.id.sodacnt);
            tv_soda.setText(soda);
            tv_soda_cnt.setText(usoda+"개");
        }


//
//
//        Intent intent = getIntent();
//        ArrayList<DrinkDTO> list = (ArrayList<DrinkDTO>) intent.getSerializableExtra("show_list");
//
//
//       TextView tv_name=findViewById(R.id.drinkname);
//        TextView tv_cnt = findViewById(R.id.drinkcnt);
//
//       tv_name.setText(list.get(0).getName());
//        tv_cnt.setText(String.valueOf(list.get(0).getCnt()));


//        String cola="콜라";

//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//            TextView tv = findViewById(R.id.cola);
//
//            tv.setText(cola);

//        tv_drinklist = findViewById(R.id.tv_drinklist);
//
//        Intent intent = getIntent();
//        int colaCnt = intent.getIntExtra("buycola", -1);
//        int ciderCnt = intent.getIntExtra("buycider", -1);
//        int fantaCnt = intent.getIntExtra("buyfanta", -1);
//        int sodaCnt = intent.getIntExtra("buysoda", -1);
//        tv_drinklist.setText("콜라: " + colaCnt + "개\n" +
//                "사이다: " + ciderCnt + "개\n" +
//                "환타: " + fantaCnt + "개\n" +
//                "데미소다: " + sodaCnt + "개");

    }
}
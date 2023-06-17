package com.example.test00_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int ucola,ucider,ufanta,usoda;
    int money;
    EditText edt_cash;
    TextView txt_cash;
    Button btn_cola,btn_cider,btn_fanta,btn_soda,btn_cash,btn_change,btn_call;







    MoneyDTO moneydto = new MoneyDTO();








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<DrinkDTO> drinkdto = new ArrayList<>();
        drinkdto.add(new DrinkDTO("콜라", 800, 10));
        drinkdto.add(new DrinkDTO("사이다", 800, 10));
        drinkdto.add(new DrinkDTO("환타", 700, 0));
        drinkdto.add(new DrinkDTO("데미소다", 700, 10));

        TextView tv_cola = findViewById(R.id.cola);
        TextView tv_colaprice = findViewById(R.id.colaprice);
        TextView tv_colacnt = findViewById(R.id.colacnt);

        tv_cola.setText(drinkdto.get(0).getName());
        tv_colaprice.setText((drinkdto.get(0).getPrice()) + "원");
        tv_colacnt.setText(drinkdto.get(0).getCnt() + "개 남음");


        TextView tv_cider = findViewById(R.id.cider);
        TextView tv_ciderprice = findViewById(R.id.ciderprice);
        TextView tv_cidercnt = findViewById(R.id.cidercnt);

        tv_cider.setText(drinkdto.get(1).getName());
        tv_ciderprice.setText((drinkdto.get(1).getPrice()) + "원");
        tv_cidercnt.setText(drinkdto.get(1).getCnt() + "개 남음");


        TextView tv_fanta = findViewById(R.id.fanta);
        TextView tv_fantaprice = findViewById(R.id.fantaprice);
        TextView tv_fantacnt = findViewById(R.id.fantacnt);

        tv_fanta.setText(drinkdto.get(2).getName());
        tv_fantaprice.setText((drinkdto.get(2).getPrice()) + "원");
        tv_fantacnt.setText(drinkdto.get(2).getCnt() + "개 남음");


        TextView tv_soda = findViewById(R.id.soda);
        TextView tv_sodaprice = findViewById(R.id.sodaprice);
        TextView tv_sodacnt = findViewById(R.id.sodacnt);

        tv_soda.setText(drinkdto.get(3).getName());
        tv_sodaprice.setText((drinkdto.get(3).getPrice()) + "원");
        tv_sodacnt.setText(drinkdto.get(3).getCnt() + "개 남음");


        btn_cola=findViewById(R.id.btn_cola);
        btn_cola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drinkdto.get(0).setCnt(drinkdto.get(0).getCnt()-1);
                tv_cola.setText(drinkdto.get(0).getName());
                ucola++;
                tv_colaprice.setText((drinkdto.get(0).getPrice()) + "원");
                tv_colacnt.setText(drinkdto.get(0).getCnt() + "개 남음");
                if(drinkdto.get(0).getCnt()<0){
                    drinkdto.get(0).setCnt(drinkdto.get(0).getCnt()+1);
                    Toast.makeText(MainActivity.this, "수량이 부족합니다", Toast.LENGTH_SHORT).show();
                    tv_cola.setText(drinkdto.get(0).getName());
                    tv_colaprice.setText((drinkdto.get(0).getPrice()) + "원");
                    tv_colacnt.setText(drinkdto.get(0).getCnt() + "개 남음");
                    ucola--;
                }
            }
        });


        btn_cider=findViewById(R.id.btn_cider);
        btn_cider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drinkdto.get(1).setCnt(drinkdto.get(1).getCnt()-1);
                tv_cider.setText(drinkdto.get(1).getName());
                ucider++;
                tv_ciderprice.setText((drinkdto.get(1).getPrice()) + "원");
                tv_cidercnt.setText(drinkdto.get(1).getCnt() + "개 남음");
                if(drinkdto.get(1).getCnt()<0){
                    drinkdto.get(1).setCnt(drinkdto.get(1).getCnt()+1);
                    Toast.makeText(MainActivity.this, "수량이 부족합니다", Toast.LENGTH_SHORT).show();
                    tv_cider.setText(drinkdto.get(1).getName());
                    tv_ciderprice.setText((drinkdto.get(1).getPrice()) + "원");
                    tv_cidercnt.setText(drinkdto.get(1).getCnt() + "개 남음");
                    ucider--;
                }
            }
        });




        btn_fanta=findViewById(R.id.btn_fanta);
        btn_fanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drinkdto.get(2).setCnt(drinkdto.get(2).getCnt()-1);
                tv_fanta.setText(drinkdto.get(2).getName());
                ufanta++;
                tv_fantaprice.setText((drinkdto.get(2).getPrice()) + "원");
                tv_fantacnt.setText(drinkdto.get(2).getCnt() + "개 남음");
                if(drinkdto.get(2).getCnt()<0){
                    drinkdto.get(2).setCnt(drinkdto.get(2).getCnt()+1);
                    Toast.makeText(MainActivity.this, "수량이 부족합니다", Toast.LENGTH_SHORT).show();
                    tv_fanta.setText(drinkdto.get(2).getName());
                    tv_fantaprice.setText((drinkdto.get(2).getPrice()) + "원");
                    tv_fantacnt.setText(drinkdto.get(2).getCnt() + "개 남음");
                    ufanta--;
                }
            }
        });



        btn_soda=findViewById(R.id.btn_soda);
        btn_soda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drinkdto.get(3).setCnt(drinkdto.get(3).getCnt()-1);
                tv_soda.setText(drinkdto.get(3).getName());
                usoda++;
                tv_sodaprice.setText((drinkdto.get(3).getPrice()) + "원");
                tv_sodacnt.setText(drinkdto.get(3).getCnt() + "개 남음");
                if(drinkdto.get(3).getCnt()<0){
                    drinkdto.get(3).setCnt(drinkdto.get(3).getCnt()+1);
                    Toast.makeText(MainActivity.this, "수량이 부족합니다", Toast.LENGTH_SHORT).show();
                    tv_soda.setText(drinkdto.get(3).getName());
                    tv_sodaprice.setText((drinkdto.get(3).getPrice()) + "원");
                    tv_sodacnt.setText(drinkdto.get(3).getCnt() + "개 남음");
                    usoda--;

                }
            }
        });


        btn_cash = findViewById(R.id.btn_cash);
        edt_cash=findViewById(R.id.edt_cash);
        txt_cash=findViewById(R.id.txt_cash);
        btn_cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    if(Integer.parseInt(edt_cash.getText().toString()) % 10 ==0){
                        money=money+Integer.parseInt(edt_cash.getText().toString());
                        txt_cash.setText("잔액: "+money+"원");
                    }
                   else if(Integer.parseInt(edt_cash.getText().toString()) % 10 != 0){

                    Toast.makeText(MainActivity.this, "현금을 넣어주세요", Toast.LENGTH_SHORT).show();

                }

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }



                btn_change = findViewById(R.id.btn_change);
                btn_change.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("show_money",money);

                intent.putExtra("show_cola",drinkdto.get(0).name);
                intent.putExtra("show_cola_cnt",ucola);

                intent.putExtra("show_cider",drinkdto.get(1).name);
                intent.putExtra("show_cider_cnt",ucider);


                intent.putExtra("show_fanta",drinkdto.get(2).name);
                intent.putExtra("show_fanta_cnt",ufanta);


                intent.putExtra("show_soda",drinkdto.get(3).name);
                intent.putExtra("show_soda_cnt",usoda);


                startActivity(intent);

                ucola=0;ucider=0;ufanta=0;usoda=0;
                    }
                });




            }
        });
        btn_call=findViewById(R.id.btn_call);
        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse(("tel:010-1234-1234")));
                startActivity(intent);

            }
        });


    }







//        String cola="콜라";

//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//            TextView tv = findViewById(R.id.cola);
//
//            tv.setText(cola);


        // ------------------

//        btn_change = findViewById(R.id.btn_change);
//
//
//        drinkdto.add(new DrinkDTO("콜라",800,10));
//        moneydto.Money=10000;
//
//
//        btn_change.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
//                intent.putExtra("show_list",drinkdto);
//                startActivity(intent);
//

//                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
//                intent.putExtra("buycola", uCola);
//                intent.putExtra("buycider", uCider);
//                intent.putExtra("buyfanta", uFanta);
//                intent.putExtra("buysoda", uSoda);
//                startActivity(intent);


//            }
//        });





    }


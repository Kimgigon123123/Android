package com.example.project02_lastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.project02_lastproject.common.CommonConn;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









//        CommonConn conn = new CommonConn(this,"member/login");
//        conn.addParamMap("id","admin");
//        conn.addParamMap("pw","admin1234");
//        conn.onExcute((isResult, data) -> {
//            Log.d("결과값", "onCreate: "+data+" isResult: "+isResult);
//        });





//        RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("id","1");
//        map.put("pw","1");
//        api.clientGetMethod("member/login",map).enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                Log.d("결과", "onResponse: "+response.body());
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//                Log.d("결과", "onResponse: ");
//            }
//        });


    }
}
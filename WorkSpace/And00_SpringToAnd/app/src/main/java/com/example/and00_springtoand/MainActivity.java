package com.example.and00_springtoand;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ApiInterface 가 초기화 되어야함.
        //초기화 식 : ApiInterface name = Retrofit.create(ApiInterface.class);
        // Collecttion 자료구조.

        RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("param","값안드");
        paramMap.put("param","값안드1");
        paramMap.put("param","값안드2");
        paramMap.put("param1","값안드2");
        //CallBack : 희미하게 KakaoLogin
        //jsp 카카오 로그인 버튼 누름 -> Controller -> REST API (카카오 서버에 특정 맵핑을 호출하거, 파라메터를 넘겨줌.(Client_id)) -> 페이지
        //->사용자가 카카오 로그인을 함.(언제끝남?모름?) 끝나면 내가 만들어둔 나의 Controller로 데이터를 주라. -> CallBack

        //Dialog처리 : 사용자는 기다리는 일을 잘못함.(==> 아무런 디자인 처리 없이)
        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("레트로핏");
        dialog.setMessage("데이터를 가져오는중...");
        dialog.setProgress(ProgressDialog.STYLE_SPINNER);
        dialog.setCancelable(false);
        dialog.show();

        api.clientGetMethod("list.cu",paramMap).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d("레트로핏", "onResponse: 응답이 왔음. Spring에서 이후 처리 진행"+response.body());
                dialog.dismiss();
                // 어댑터 생성, 리사이클러뷰 연결...
                //

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("레트로핏", "onResponse: url,포트,Spring응답없음 등의 이유로 실패");
            }
        });










//        RetrofitClient rc = new RetrofitClient();
//        RetrofitInterface api = rc.getRetrofit().create(RetrofitInterface.class);
//        //초기화식.
//        api.getCu().enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                Log.d("레트로핏", "onResponse: ");
//                //String to Object(CustomerVO) 'Gson'
//                CustomerVO vo = new Gson().fromJson(response.body() , CustomerVO.class);
//                Log.d("레트로핏", "onResponse: " + vo);
//                Log.d("레트로핏", "onResponse: " + vo.getName());
//
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//                Log.d("레트로핏", "onResponse: ");
//            }
//        });
//
//        api.getCuList().enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                String result = response.body();
//                //TypeToken : 버그가 있음 new TypeToken을 바로 메소드에 넣으면 가끔 안나옴.
//                //그럴때는 아무대나 가서 TypeToken글자를 쳐줌.<= List형태로 바꿀때 사용함.
//                ArrayList<CustomerVO> list = new Gson().fromJson(
//                        result , new TypeToken<ArrayList<CustomerVO>>(){}.getType()
//                );
//                Log.d("레트로핏", "onResponse: " + list.size());
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//
//            }
//        });
    }
}
package com.example.project02_lastproject.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.project02_lastproject.R;
import com.example.project02_lastproject.common.RetrofitClient;
import com.example.project02_lastproject.common.RetrofitInterface;
import com.example.project02_lastproject.databinding.ActivityPracBinding;

import java.util.HashMap;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class pracActivity extends AppCompatActivity {

    ActivityPracBinding binding;
    CallbackKgg callback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPracBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        callback = new CallbackKgg() {
            @Override
            public void onResult(String data) {
                binding.tvResult.setText("응답 : "+data);
            }
        };

        binding.btnSelect.setOnClickListener(v->{
            //RetrofitClient : 접속 방법, 컨버터 등 통신에 대한 전반적인 방법이 있는 객체.
            //RetrofitInterface : 접속 후 데이터 전송 방식, 파라메터 타입 등등의 기능에 가까운 객체.

            //3.
            commonExcute(binding.edtUrl.getText().toString(),new HashMap<>());


//            RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);
//
//
//
//            api.clientPostMethod(binding.edtUrl.getText().toString(),new HashMap<>()).enqueue(new Callback<String>() {
//                @Override
//                public void onResponse(Call<String> call, Response<String> response) {
//                    callback.onResult(response.body());
//                }
//
//                @Override
//                public void onFailure(Call<String> call, Throwable t) {
//                    callback.onResult(t.getMessage());
//                }
//            });



        });

        binding.btnInsert.setOnClickListener(v->{
            HashMap<String,Object> params = new HashMap<>();
            params.put("col1","random값"+new Random().nextInt(100));
//            RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);
            commonExcute("pc_insert",params);

//            api.clientPostMethod("pc_insert",params).enqueue(new Callback<String>() {
//                @Override
//                public void onResponse(Call<String> call, Response<String> response) {
//                    binding.tvResult.setText(response.body());
//                }
//
//                @Override
//                public void onFailure(Call<String> call, Throwable t) {
//                    binding.tvResult.setText(t.getMessage());
//                }
//            });
        });


        binding.btnUpdate.setOnClickListener( v->{
//            method(new CallbackKgg() {
//                @Override
//                public void onResult(String data) {
//                            Log.d("로그", "onResult: 여기가 실행됨 찍히게 하려면 어떻게 해야할까? ");
//                        }
//            });




        });


    }

//    public class KggVO{
//        public void method(){
//            Log.d("로그", "onResult: 여기가 실행됨 찍히게 하려면 어떻게 해야할까? ");
//        }
//    }

    //1.
    public interface CallbackKgg{
        public void onResult (String data);
    }


    //2.
    public void commonExcute(String url,HashMap<String,Object> map){
        RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);

        api.clientPostMethod(url,map).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                callback.onResult(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callback.onResult(t.getMessage());
            }
        });
    }


//
//    public void method(CallbackKgg callback){
//        Toast.makeText(this, "메소드가 호출되었습니다.", Toast.LENGTH_SHORT).show();
//        callback.onResult("dd");
//    }

}
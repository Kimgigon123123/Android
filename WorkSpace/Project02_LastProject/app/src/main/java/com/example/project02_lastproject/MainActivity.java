package com.example.project02_lastproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.project02_lastproject.customer.CustomerFragment;
import com.example.project02_lastproject.databinding.ActivityMainBinding;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container,new CustomerFragment()).commit();

        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {

                if(i==0){
                    //customer패키지 내부에 CustomerFragment를 만들고 i가 0일때 하당하는 Fragment가 Container에 붙게 처리하기
                    manager.beginTransaction().replace(R.id.container,new CustomerFragment()).commit();
                }else if(i==1){

                }else if(i==2){

                }else if(i==3){

                }

                return true;
            }
        });


    }
}










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




package com.example.and00_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    //메소드 => 리턴타입이 있는 메소드를 구현, 호출을 자유롭게 하고 사용하는 이유를 명확히 알고있다.
    //클래스 => 클래스내부에 있는 멤버의 접근과 각각의 멤버를 구분하고 자유롭게 커스텀할수있다.(변형)
    //멤버 => 인터페이스의 규칙을 명확히 알고 자유롭게 구현하여 사용할수있다.


    EditText edt_id,edt_pw;
    Button btn_login;
    String TAG = "레트로핏";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_id=findViewById(R.id.edt_id);
        edt_pw=findViewById(R.id.edt_pw);
        btn_login=findViewById(R.id.btn_login);


        RetrofitClient rc = new RetrofitClient();
        RetrofitInterface api = rc.getRetrofit().create(RetrofitInterface.class);
        HashMap<String, Object> paramMap = new HashMap<>();

        CommonConn.KggCallBack callBack = new CommonConn.KggCallBack() {
            @Override
            public void onResult(boolean isResult, String data) {
                Log.d("결과", "onResult: "+data);
            }
        };
        Log.d("콜백", "콜백(인터페이스의 메모리)"+callBack);

        btn_login.setOnClickListener(v-> {


                CommonConn conn = new CommonConn(this,"member/login");
                conn.addParamMap("id",edt_id.getText().toString());
                conn.addParamMap("pw",edt_pw.getText().toString());
                conn.onExcute(callBack);//onExcute 메소드가 실행되면 일단 Spring으로 전송처리는 정상적으로 작동한다. (결과를 가져오려면 어떻게 해야할까?)




//                paramMap.put("id",edt_id.getText().toString());
//                paramMap.put("pw",edt_pw.getText().toString());
//                api.clientGetMethod("login",paramMap).enqueue(new Callback<String>() {
//                    @Override
//                    public void onResponse(Call<String> call, Response<String> response) {
//                        Log.d("레트로핏", "onResponse: 응답이 왔음. Spring에서 이후 처리 진행"+response.body());
//                    }
//
//                    @Override
//                    public void onFailure(Call<String> call, Throwable t) {
//                        Log.d("레트로핏", "onResponse: url,포트,Spring응답없음 등의 이유로 실패");
//                    }
//                });

        });


    }

    //올바른 방법아니여서 한번 확인하고 지울꺼임.
//    public static void test(String data){
//        Log.d("결과", "test: ↑"+data);
//    }

}
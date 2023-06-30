package com.example.dangguen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.dangguen.databinding.ActivitySplashBinding;


public class SplashActivity extends AppCompatActivity {

    ActivitySplashBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

         getSupportActionBar().hide();//액션바를 안보이게 처리한다.




        //Splash Screen : 데이터 로딩이나, 앱 실행 시 , 유저에게 로고를 노출함으로써 각인효과를 주고 기다리는 시간을 조금 더 짧게 느끼게 한다.
        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("당근");
        dialog.setMessage("로딩 중 대기 바랍니다...");
        dialog.setCancelable(false);
        dialog.show();
        // Intent intent = new Intent(this,MainActivity.class);
        //  startActivity(intent);

        // Thread : Handler
        // 안드로이드의 앱은 메인 프로세스가 진행되면서 모든 처리가 일어남.
        new Handler().postDelayed(()->{

            dialog.dismiss();
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();

        },100*10);



    }
}
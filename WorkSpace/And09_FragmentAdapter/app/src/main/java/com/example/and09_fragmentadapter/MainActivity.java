package com.example.and09_fragmentadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.and09_fragmentadapter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //FrameLayout과 Button 두개 초기화 시키기.

    //Button을 각각 클릭시 로그에 메뉴1,메뉴2가 출력되게 코딩해보기



//    FrameLayout container;
//    Button btn_menu1,btn_menu2,btn_adapter;
    FragmentManager manager =  getSupportFragmentManager(); //프래그먼트 매니저의 초기화식.
    ActivityMainBinding binding;

    Intent intent = getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());//getRoot==> 디자인xml파일의 최상단의 레이아웃.
        //Fragment를 붙이기 위한 공간, Fragment, FragmentManager 3가지의 요소가 필요하다.
//        container=findViewById(R.id.container);  <= FragmentManager에서는 객체로 초기화된 위젯이 필요 x , 디자인파일에 있는 id만 명시해주면 됨
//        btn_menu1=findViewById(R.id.btn_menu1);
//        btn_menu2=findViewById(R.id.btn_menu2);
//        btn_adapter=findViewById(R.id.btn_adapter);




        binding.btnMenu1.setOnClickListener(this);
        binding.btnMenu2.setOnClickListener(this);
        binding.btnAdapter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_menu1){
            Log.d("확인", "onClick: 메뉴1");
            //트랜잭션 : Oracle 작업 최소 단위 세트: commit & Rollback
//            manager.beginTransaction().add(R.id.container,new HomeFragment(),"A").commit();
           manager.beginTransaction().replace(R.id.container,new HomeFragment()).commit();


        } else if (v.getId() == R.id.btn_menu2) {
            Log.d("확인", "onClick: 메뉴2");
            //subFragment를 하나 추가 후 (디자인 구분을 할수있게 배경색을 바꿔줌)
            //FragmentManger를 이용해서 replace처리해보기
            manager.beginTransaction().replace(R.id.container,new SubFragment()).commit();

//            manager.beginTransaction().remove()

        }else if(v.getId()==R.id.btn_adapter){
            Intent intent = new Intent(MainActivity.this,AdapterActivity.class);
            startActivity(intent);

        }

    }
}
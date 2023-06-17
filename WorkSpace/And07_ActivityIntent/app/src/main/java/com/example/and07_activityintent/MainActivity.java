package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "수명주기";
    EditText txt1, txt2, txt3, txt4,txt5;
    Button btn1, btn2, btn3, btn4,btn5,btn6,btn7;

    //현재는 onCreate내부에서만 코드처리를 해도 무방함.
    //추후에 여러 화면이나 Spring연동시 새로고침 등의 처리가 필요할때는 수명주기가 있다는것을 생각하고, 적절한 수명주기를 이용하자.

    //안드로이드도 Spring과 마찬가지로 Debuggimg을 잘하면 오류찾는게 빠르다.(디버깅모드를 한번씩 연습해보는 습관을 들이면 좋음)

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();//방금 LoginActivity에서 startActivity('intent') 사용된 intent를 가져옴.(내부에 넣어둔(putExtra)데이터를 빼오기 위해서)
        String strValue = intent.getStringExtra("strkey");
        int intValue = intent.getIntExtra("intkey", -1);
        //name으로 값을 찾았을때 없다면 , 기본값을 어떤걸로 할껀지 defaultValue
        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dtokey"); //객체의 타입을 주고 강제로 바꾸는것 ==> 역직렬화 ==> 내부에 있는 멤버를 사용하기위해 Serializable=>dto

        //int 값 받아보기
        Log.d(TAG, "onCreate: " + strValue);
        Log.d(TAG, "onCreate: " + intValue);
        Log.d(TAG, "onCreate: " + dto.getId());

        ArrayList<LoginDTO> list = (ArrayList<LoginDTO>) intent.getSerializableExtra("list");
        // LoginDTO를 5개 아무 데이터나 넣고 묶은 ArrayList 만들어보기.

        Log.d(TAG, "onCreate: " + list.size());


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");


        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);




        //lamda 인터페이스를 파라메터로 넘겨야할때 함수로 메소드 지역만 만들어냄. this를 써보면 new와 함수형 lamda식을 알수있음.
        //주의사항. 람다식에서 인터페이스를 함수형으로 쓸때 인터페이스 내부에는 메소드가 반드시 하나여야만함.
        //명시적:activity => activity.class 이동 시 많이 사용.
        // 암시적,묵시적 : activity => action(내가 없는 기능) 사용할때 씀.
        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:/" + txt1.getText().toString())
            );
            startActivity(intent);
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                intent.putExtra("btn4",txt4.getText().toString());

                startActivity(intent);

//                Intent intent = new Intent(Intent.ACTION_SENDTO);
//                intent.setData(Uri.parse("smsto:" + Uri.encode("010-1234-5678")));
//                intent.putExtra("sms_body", txt3.getText().toString());
//                startActivity(intent);

            }


        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                int num = 10 ;
                String str = num+"";
                num = Integer.parseInt(str);


                intent.putExtra("btn5", Integer.parseInt(txt5.getText().toString()));

                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                DTO dto = new DTO(txt4.getText().toString(),Integer.parseInt(txt5.getText().toString()));
                intent.putExtra("btn6",dto);
                startActivity(intent);

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drinkdto.add(new DTO("콜라",800));

                Intent intent = new Intent(MainActivity.this,TestActivity.class);
//                ArrayList<DTO> btn7 = new ArrayList<>();
//                btn7.add(new DTO(txt4.getText().toString(),Integer.parseInt(txt5.getText().toString())));
//                intent.putExtra("btn7",btn7);
                intent.putExtra("showlist",drinkdto);

                startActivity(intent);






            }
        });


//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }//on


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn2) {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, txt2.getText().toString());
            startActivity(intent);
        } else if (v.getId() == R.id.btn3) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("smsto:" + Uri.encode("010-1234-5678")));
            intent.putExtra("sms_body", txt3.getText().toString());
            startActivity(intent);
            //암시적 인텐트나 명시적 인텐트를 사용해서 통신 후 다시 결과를 받아와야하는 상황에 쓰는 것들이 있음. ActivityLauncher, startActivityForResult
            //현재는 사용할수가


        }



    }

    ArrayList<DTO> drinkdto = new ArrayList<>();




/*

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

*/
}
package com.example.and04_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn_change1,btn_change2;
//    ImageView imgv1, imgv2, imgv3;
    ArrayList<ImageView> imgList = new ArrayList<>();//?

//    int count = 1;
    int flag =0;
    //현재 객체를 선언만 해둔 상태에서는 4개의 객체 모두 null인 상태이다
    // null이 아니게 하려면 어떤처리가 필요할까?




    // null이 아니게 만들고 if문을 이용하여 nullCheck를 하고 log를 찍어보기.
    // nullCheck : btn... imgv3 중 하나라도 null이라면 null이 섞여있음 이라는 로그가 찍힘. 그게 아니라면 전부 초기화 완료 라고 로그에 찍힘
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        //res하위에 있는 모든것들은 R이라는 클래스로 하나로 묶인다

        imgList.add(findViewById(R.id.imgv1));
        imgList.add(findViewById(R.id.imgv2));
        imgList.add(findViewById(R.id.imgv3));

        btn_change1=findViewById(R.id.btn_change1);
        btn_change2=findViewById(R.id.btn_change2);
//        imgv1 = findViewById(R.id.imgv1);
//        imgv2 = findViewById(R.id.imgv2);
//        imgv3 = findViewById(R.id.imgv3);

        //4개의 위젯중 하나라도 null이 섞여있다면 <=if문으로 작성해보기


//        if(btn_change == null || imgv1 == null || imgv2 == null || imgv3== null){
//            Log.d("NULLCHECK", "null이 섞여있음 ");
//        }
//        else{
//            Log.d("NULLCHECK", "null이 아님 초기화 완료 ");
//        }

        // 버튼의 클릭을 감지하는 메소드. 인터페이스 view.OnClickListner<-
// 1. 직접 인터페이스를 인스턴스화하여 파라메터로 넘기는 방법
//        View.OnClickListener kggOnclick = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("버튼", "onClick: 버튼이 눌림");
//            }
//        };

//        btn_change.setOnClickListener(kggOnclick);
        // 2. 인터페이스를 초기화 할수있는 new 생성자로 파라메터를 넘기는 방법
//        btn_change.setOnClickListener(new View.OnClickListener() {
//            int count = 1;
//            @Override
//            public void onClick(View v) {
//
//                Log.d("버튼", ""+count);
//                if(count==1){
//                    imgv3.setVisibility(View.GONE);
//                    imgv2.setVisibility(View.VISIBLE);
//                    count=count+1;
//
//                }
//
//                else if(count==2){
//                    imgv2.setVisibility(View.GONE);
//                    imgv1.setVisibility(View.VISIBLE);
//                    count=count+1;
//
//                }
//               else if(count==3){
//                    imgv1.setVisibility(View.GONE);
//                    imgv3.setVisibility(View.VISIBLE);
//                    count=1;
//
//                }
//
//            }
//        });

//       btn_change1.setOnClickListener(new View.OnClickListener() {
//
//           @Override
//           public void onClick(View v) {
//               count=count-1;
//
//
//               if(count<=0){
//                   count=3;
//               }
//               else if(count>=4){
//                   count=1;
//               }
//               img();
//               Log.d("번호", " "+count);
//           }
//       });
//
//       btn_change2.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               count=count+1;
//
//
//               if(count>=4){
//                   count=1;
//               }
//               else if(count<=0){
//                   count=3;
//               }
//               img();
//               Log.d("번호", " "+count);
//           }
//       });


        btn_change1.setOnClickListener(v->{
            flag++; // 0 -> 1
            for (int i = 0; i <imgList.size();i++){
                imgList.get(i).setVisibility(View.GONE);
            }
            if(flag==imgList.size()) {
                flag=0;
            }

            imgList.get(flag).setVisibility(View.VISIBLE);

        });


        //3. 인터페이스를 상속받는 방법
        // -> Spring MVC의 경우에는 DAO또는 Service가 반드시 구현해야만 하는 메소드의 형태를 만들어서 설계도 개념으로 사용.(많은 개발자가 협업시 편리한방법)
        // -> Android <- 다형성을 이용한 방법. : View.OnClickLister <= onClick이라는 메소드를 반드시 가지고 있음
//                                                View.OnClickListener라는것을 상속받은 Class == ViewOnClickLister와 같다가 성립
//        btn_change.setOnClickListener(this);

        //4. 자바의 인터페이스 단점을 보완 => lamda(람다식,함수형으로 new나 불필요한 코드를 생략하고 사용하는 방법)
        // 인터페이스의 abstract메소드가 1개의 경우만 사용가능. ( 인터페이스 내부 구조를 모르면 사용이 거의 불가능함, 초보자)

//        btn_change.setOnClickListener(v->{//인터페이스가 주는 파라메터를 (v)써주고 메소드 지역을 -> 가르킴{}
//
//        });
//
//    }
    // java코드를 이용하여 이미지 바꾸기 클릭시 계속해서 이미지가 바뀌게 처리해보기
    // setVisibility속성을 잘 이용할것




//    @Override
//    public void onClick(View v) {
//        Log.d("버튼", "인터페이스 상속받아서 버튼 눌림을 감지");
//        imgv3.setVisibility(View.GONE);
    }

//    public void img(){
//        if(count==1){
//                    imgv2.setVisibility(View.GONE);
//                    imgv3.setVisibility(View.GONE);
//                    imgv1.setVisibility(View.VISIBLE);
//
//
//                }
//
//                else if(count==2){
//                imgv2.setVisibility(View.VISIBLE);
//                imgv3.setVisibility(View.GONE);
//                imgv1.setVisibility(View.GONE);
//
//
//                }
//               else if(count==3){
//                imgv2.setVisibility(View.GONE);
//                imgv3.setVisibility(View.VISIBLE);
//                imgv1.setVisibility(View.GONE);
//
//
//                }
//    }
}
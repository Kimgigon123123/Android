package com.example.and999_practiceframelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
        Button btn1;
        ImageView imgv1, imgv2, imgv3;
        int count=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1=findViewById(R.id.btn_change);
        imgv1=findViewById(R.id.imgv1);
        imgv2=findViewById(R.id.imgv2);
        imgv3=findViewById(R.id.imgv3);

        ImageView[] arr = {imgv1,imgv2,imgv3};


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count==1){
                    arr[0].setVisibility(View.VISIBLE);
                    arr[1].setVisibility(View.GONE);
                    arr[2].setVisibility(View.GONE);
                    count=count+1;
                }
                else if(count==2){
                    arr[0].setVisibility(View.GONE);
                    arr[1].setVisibility(View.VISIBLE);
                    arr[2].setVisibility(View.GONE);
                    count=count+1;
                }
                else if(count==3){
                    arr[0].setVisibility(View.GONE);
                    arr[1].setVisibility(View.GONE);
                    arr[2].setVisibility(View.VISIBLE);
                    count=1;
                }

            }
        });

    }
}
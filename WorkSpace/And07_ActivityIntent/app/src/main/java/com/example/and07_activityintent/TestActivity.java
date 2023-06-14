package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Intent intent = getIntent();
        String strValue = intent.getStringExtra("btn4");
        Log.d("btn4", "onCreate: "+strValue);

        int intValue = intent.getIntExtra("btn5",0);
        Log.d("btn5", "onCreate: "+intValue);

        DTO dto = (DTO) intent.getSerializableExtra("btn6");
        Log.d("btn6", "onCreate: "+dto.btn4+dto.btn5);

        ArrayList<DTO> list = (ArrayList<DTO>) intent.getSerializableExtra("btn7");
        Log.d("btn7", "onCreate: "+list.get(0).btn4+list.get(0).btn5);










    }
}
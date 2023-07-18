package com.example.dangguen.home;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.dangguen.R;


public class WriteDialog extends Dialog {



    public WriteDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.dialog_write);
        RelativeLayout btn_sell = findViewById(R.id.btn_sell);

        btn_sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (context,SellActivity.class);
                context.startActivity(intent);

            }
        });

    }
}

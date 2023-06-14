package com.example.and07_activityintent;

import android.widget.EditText;

import java.io.Serializable;

public class DTO implements Serializable {
    String btn4;
    int btn5;

    public DTO(String btn4, int btn5) {
        this.btn4 = btn4;
        this.btn5 = btn5;
    }

    public String getBtn4() {
        return btn4;
    }

    public int getBtn5() {
        return btn5;
    }

    public void setBtn4(String btn4) {
        this.btn4 = btn4;
    }

    public void setBtn5(int btn5) {
        this.btn5 = btn5;
    }
}

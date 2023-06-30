package com.example.project01_kggtalk.exam;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KggAdapterParent {

    public abstract static class KggAdapter<KVH extends KggViewHolder>{
        public abstract KVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType);
        public abstract void onBindViewHolder();
        public abstract int getIntCount();

    }

    public abstract static class KggViewHolder{
        // 디자인 파일을 묶어놓은 객체 ===> View
        @NonNull
        final View view; //상수의 규칙 (1. 상수를 선언과 동시에 값 할당 ==> 초기화 해놓는 방법)
                        //               2. 생성자를 이용해서 초기화 하는 방법

        public KggViewHolder(@NonNull View view) {
            this.view = view;
        }
    }


}

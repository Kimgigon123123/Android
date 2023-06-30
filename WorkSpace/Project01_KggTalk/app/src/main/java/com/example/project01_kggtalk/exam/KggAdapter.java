package com.example.project01_kggtalk.exam;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

public class KggAdapter extends KggAdapterParent.KggAdapter<KggAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder() {

    }

    @Override
    public int getIntCount() {
        return 0;
    }

    public class ViewHolder extends KggAdapterParent.KggViewHolder{

        public ViewHolder(@NonNull View view) {
            super(view);
        }
    }


}

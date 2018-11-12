package com.example.zhouwenguang.mycardlayout.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

public abstract class BaseCard {
    public View setContentView(Context context,int layoutId){
        return inflate(context,layoutId);
    }
    public abstract View getView(Context context);
    public abstract void loadData(Context context);
    public View inflate(Context context,int layoutId){
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(layoutId,null);
        return view;
    }
}

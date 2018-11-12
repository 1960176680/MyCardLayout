package com.example.zhouwenguang.mycardlayout.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

public abstract class BaseCardView {
    public View setContentView(Context context,int layoutId){
        return inflate(context,layoutId);
    }
    public abstract View getView(Context context,int layoutId);
    public abstract void loadData(Context context);
    public View inflate(Context context,int layoutId){
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(layoutId,null);
        return view;
//        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//        lp.height=500;
//        lp.width=800;
//        lp.gravity=Gravity.CENTER;
//        this.setBackgroundColor(Color.BLUE);
//        this.addView(view,lp);
    }
}

package com.example.zhouwenguang.mycardlayout;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CardView extends LinearLayout {
    public CardView(Context context,String title) {
        super(context);
        TextView textView=new TextView(getContext());
        textView.setGravity(Gravity.CENTER);
        textView.setText(title);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(28);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.height=500;
        lp.width=800;
        lp.gravity=Gravity.CENTER;
        this.setBackgroundColor(Color.BLUE);
        this.addView(textView,lp);
    }
    public CardView(Context context,int layoutId) {
        super(context);
        inflate(layoutId);
    }
    public void inflate(int layoutId){
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View view=inflater.inflate(layoutId,null);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.height=500;
        lp.width=800;
        lp.gravity=Gravity.CENTER;
        this.setBackgroundColor(Color.BLUE);
        this.addView(view,lp);
    }
    public View getView(){
        return this;
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        loadData();
    }

    public void loadData(){
        Toast.makeText(getContext(),"后台线程正在加载数据...",Toast.LENGTH_SHORT).show();
    }

}

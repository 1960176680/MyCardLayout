package com.example.zhouwenguang.mycardlayout.impl;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.zhouwenguang.mycardlayout.base.BaseCardView;
public class ToDoCardView extends BaseCardView {
    @Override
    public View getView(Context context,int layoutId) {
        View view=setContentView(context,layoutId);
        return view;
    }

    @Override
    public void loadData(Context context) {
        Toast.makeText(context,"后台线程正在加载数据...",Toast.LENGTH_LONG).show();
    }

}

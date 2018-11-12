package com.example.zhouwenguang.mycardlayout.impl;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.zhouwenguang.mycardlayout.R;
import com.example.zhouwenguang.mycardlayout.base.BaseCard;
/**
 * author：zhouwenguang
 * date：2018/11/12 19:06
 */
public class AttendanceCard extends BaseCard {
    @Override
    public View getView(Context context) {
        return setContentView(context,R.layout.item_card1);
    }
    @Override
    public void loadData(Context context) {
        Toast.makeText(context,"后台线程正在加载数据...",Toast.LENGTH_SHORT).show();
    }
}

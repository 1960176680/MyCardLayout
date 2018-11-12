package com.example.zhouwenguang.mycardlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhouwenguang.mycardlayout.base.BaseCardView;
import com.example.zhouwenguang.mycardlayout.impl.AttendanceCardView;
import com.example.zhouwenguang.mycardlayout.impl.CardGroupLayout;
import com.example.zhouwenguang.mycardlayout.impl.NoticeCardView;
import com.example.zhouwenguang.mycardlayout.impl.ToDoCardView;

public class MainActivity extends AppCompatActivity {
    CardGroupLayout cardGroupLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }
    private void initView() {
        cardGroupLayout=findViewById(R.id.layout_cardgroup);
        cardGroupLayout.addChildView(MainActivity.this,new NoticeCardView(),R.layout.item_card1);
        cardGroupLayout.addChildView(MainActivity.this,new AttendanceCardView(),R.layout.item_card1);
        cardGroupLayout.addChildView(MainActivity.this,new ToDoCardView(),R.layout.item_card1);
        cardGroupLayout.addChildView(MainActivity.this,new ToDoCardView(),R.layout.item_card1);
        cardGroupLayout.addChildView(MainActivity.this,new ToDoCardView(),R.layout.item_card1);
        cardGroupLayout.addChildView(MainActivity.this,new ToDoCardView(),R.layout.item_card1);
    }
    private void initData() {

    }


}

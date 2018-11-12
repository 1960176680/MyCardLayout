package com.example.zhouwenguang.mycardlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhouwenguang.mycardlayout.impl.AttendanceCard;
import com.example.zhouwenguang.mycardlayout.base.CardGroupLayout;
import com.example.zhouwenguang.mycardlayout.impl.NoticeCard;
import com.example.zhouwenguang.mycardlayout.impl.ToDoCard;

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
        cardGroupLayout.addChildView(MainActivity.this,new NoticeCard());
        cardGroupLayout.addChildView(MainActivity.this,new AttendanceCard());
        cardGroupLayout.addChildView(MainActivity.this,new ToDoCard());
        cardGroupLayout.addChildView(MainActivity.this,new AttendanceCard());
        cardGroupLayout.addChildView(MainActivity.this,new ToDoCard());
        cardGroupLayout.addChildView(MainActivity.this,new NoticeCard());
    }
    private void initData() {

    }


}

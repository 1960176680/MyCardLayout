package com.example.zhouwenguang.mycardlayout.base;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;

public class CardGroupLayout extends LinearLayout {
    private Context mContext;
    public CardGroupLayout(Context context) {
        super(context);
        mContext=context;
        setOrientation(LinearLayout.VERTICAL);
        setGravity(Gravity.CENTER);
    }

    public CardGroupLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext=context;
        setOrientation(LinearLayout.VERTICAL);
        setGravity(Gravity.CENTER);
    }

    /**
     * 添加子View
     * @param cardView
     */
    public void addChildView(Context context, BaseCard cardView){
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.setMargins(20, 20, 20, 0);
        lp.height=500;
        lp.width=800;
        lp.topMargin=80;
        lp.gravity=Gravity.CENTER;
        this.addView(cardView.getView(mContext),lp);
        cardView.loadData(context);
    }
}

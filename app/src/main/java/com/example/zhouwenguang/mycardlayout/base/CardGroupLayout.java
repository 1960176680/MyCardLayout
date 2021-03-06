package com.example.zhouwenguang.mycardlayout.base;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.LinearLayout;
/**
 * author：zhouwenguang
 * date：2018/11/12 19:06
 */
public class CardGroupLayout extends LinearLayout {
    public CardGroupLayout(Context context) {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
        setGravity(Gravity.CENTER);
    }
    public CardGroupLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.VERTICAL);
        setGravity(Gravity.CENTER);
    }

    /**
     * 添加子View
     * @param cardView
     */
    public void addChildView(Context context, BaseCard cardView){
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        lp.setMargins(20, 50, 20, 30);
        lp.height=350;
        lp.width=1000;
        lp.gravity=Gravity.CENTER;
        addView(cardView.getView(context),lp);
        cardView.loadData(context);
    }
}

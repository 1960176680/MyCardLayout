package com.example.zhouwenguang.mycardlayout.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * author：zhouwenguang
 * date：2018/11/12 19:06
 */
public abstract class BaseCard {
    /**
     * 用于创建子View
     * @param context
     * @return
     */
    public abstract View getView(Context context);

    /**
     * View的数据加载
     * @param context
     */
    public abstract void loadData(Context context);

    /**
     * 用于填充子View的布局
     * @param context
     * @param layoutId
     * @return
     */
    public View setContentView(Context context,int layoutId){
        return inflate(context,layoutId);
    }
    public View inflate(Context context,int layoutId){
        return LayoutInflater.from(context).inflate(layoutId,null);
    }
}

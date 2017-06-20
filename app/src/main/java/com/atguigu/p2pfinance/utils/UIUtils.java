package com.atguigu.p2pfinance.utils;

import android.content.Context;
import android.view.View;

import com.atguigu.p2pfinance.common.MyApplication;

/**
 * Created by Administrator on 2017/6/20.
 */

public class UIUtils {

    private static View Inflate(int id){
        return  View.inflate(getContext(),id,null);
    }

    private static Context getContext(){
        return MyApplication.getContext();
    }


}

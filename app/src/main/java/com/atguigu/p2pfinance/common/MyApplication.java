package com.atguigu.p2pfinance.common;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/6/20.
 */

public class MyApplication extends Application {

    public static Context getContext() {
        return context;
    }

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}

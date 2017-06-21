package com.atguigu.p2pfinance.utils;

import android.content.Context;
import android.view.View;

import com.atguigu.p2pfinance.common.MyApplication;

/**
 * Created by Administrator on 2017/6/20.
 */

public class UIUtils {

    public static View getInflate(int layoutId) {
        return View.inflate(getContext(), layoutId, null);
    }

    public static Context getContext() {
        return MyApplication.getContext();
    }


}

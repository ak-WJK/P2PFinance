package com.atguigu.p2pfinance.common;

/**
 * Created by Administrator on 2017/6/21.
 */

public class CrashHandler implements Thread.UncaughtExceptionHandler {

    private CrashHandler() {
    }


    private CrashHandler crashHandler = new CrashHandler();


    public CrashHandler getInstance() {
        return crashHandler;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {

    }
}

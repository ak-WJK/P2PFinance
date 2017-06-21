package com.atguigu.p2pfinance.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/6/21.
 */

public class ThreadManager {
    private ThreadManager() {
    }

    private static ThreadManager threadManager = new ThreadManager();


    public static ThreadManager getInstance() {

        return threadManager;
    }

    private ExecutorService service = Executors.newCachedThreadPool();

    public ExecutorService getThread() {
        return service;
    }


}

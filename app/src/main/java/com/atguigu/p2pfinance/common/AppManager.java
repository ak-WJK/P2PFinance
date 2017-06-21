package com.atguigu.p2pfinance.common;

import android.app.Activity;

import java.util.Stack;

/**
 * Created by Administrator on 2017/6/21.
 */

public class AppManager {
    //单例模式

    private AppManager() {
    }

    private static AppManager appManager = new AppManager();

    public static AppManager getInstance() {

        return appManager;
    }


    private Stack<Activity> stack = new Stack<>();

    /*
    *
    * 添加Activity
    *
    * */
    public void addActivity(Activity activity) {
        //校验
        if (activity != null) {
            stack.add(activity);
        } else {

        }


    }

    /*
    *
    * 删除Activity
    * */
    public void removeActivity(Activity activity) {

        if (activity != null) {

            for (int i = stack.size() - 1; i >= 0; i--) {
                Activity currentActivity = stack.get(i);
//                if(currentActivity == activity) {
//
//                }


                if (currentActivity.getClass().equals(activity.getClass())) {
                    currentActivity.finish();
                    stack.remove(i);
                }
            }

            //此处有不同,当移除activity时移除中间的上边的会自动下移就会出现循环不到,故从顶端到低端循环
//            for (int i = 0; i < stack.size(); i++) {
//                Activity currentActivity = stack.get(i);

            //移除的是当前类的地址值相同的activity,当一个activity创建多个对象时,移除地址值相等的那个
////                if(currentActivity == activity) {
////
////                }

//                  //移除的是当前类的所有的activity,当一个activity创建多个对象时,移除所有
//                if (currentActivity.getClass().equals(activity.getClass())) {
//                    currentActivity.finish();
//                    stack.remove(i);
//                }
//            }


        }


    }


    /*
    *
    * 删除所有的Activity
    * */
    public void removeAllActivity() {

        for (int i = stack.size(); i >= 0; i--) {
            Activity currentActivity = stack.get(i);
            //先销毁当前的activity
            currentActivity.finish();
            //再移除,避免了移除后仍然持有activity的引用不能及时回收
            stack.remove(i);
        }


    }

}

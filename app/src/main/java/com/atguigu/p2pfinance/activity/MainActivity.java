package com.atguigu.p2pfinance.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.atguigu.p2pfinance.R;
import com.atguigu.p2pfinance.fragment.HomeFragment;
import com.atguigu.p2pfinance.fragment.InvesFragment;
import com.atguigu.p2pfinance.fragment.MoreFragment;
import com.atguigu.p2pfinance.fragment.ProperyFragment;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.fl_main)
    FrameLayout flMain;
    @BindView(R.id.rb_main)
    RadioButton rbMain;
    @BindView(R.id.rb_invest)
    RadioButton rbInvest;
    @BindView(R.id.rb_propert)
    RadioButton rbPropert;
    @BindView(R.id.rb_more)
    RadioButton rbMore;
    @BindView(R.id.main_rg)
    RadioGroup mainRg;
    private HomeFragment homeFragment;
    private InvesFragment invesFragment;
    private MoreFragment moreFragment;
    private ProperyFragment properyFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //初始化视图
        initView();

        //装配数据
        initData();

        //设置事件监听
        initListener();

    }

    private void initListener() {
        mainRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkId) {
                //点击切换不同的fragment
                switchFragment(checkId);
            }
        });


    }

    private void switchFragment(@IdRes int checkId) {
        FragmentTransaction fm = getSupportFragmentManager().beginTransaction();
        hideFragment(fm);


        if (checkId == R.id.rb_main) {
            if (homeFragment == null) {
                homeFragment = new HomeFragment();
                fm.add(R.id.fl_main, homeFragment);
            } else {
                fm.show(homeFragment);
            }


        }
        if (checkId == R.id.rb_invest) {
            if (invesFragment == null) {
                invesFragment = new InvesFragment();
                fm.add(R.id.fl_main, invesFragment);
            } else {
                fm.show(invesFragment);

            }

        }
        if (checkId == R.id.rb_more) {
            if (moreFragment == null) {
                moreFragment = new MoreFragment();

                fm.add(R.id.fl_main, moreFragment);
            } else {
                fm.show(moreFragment);
            }


        }
        if (checkId == R.id.rb_propert) {
            if (properyFragment == null) {
                properyFragment = new ProperyFragment();

                fm.add(R.id.fl_main, properyFragment);
            } else {
                fm.show(properyFragment);
            }

        }

        fm.commit();
    }

    private void hideFragment(FragmentTransaction fm) {
        if (homeFragment != null) {
            fm.hide(homeFragment);
        }
        if (invesFragment != null) {
            fm.hide(invesFragment);
        }
        if (moreFragment != null) {
            fm.hide(moreFragment);
        }
        if (homeFragment != null) {
            fm.hide(homeFragment);
        }
        if (properyFragment != null) {
            fm.hide(properyFragment);
        }

    }

    private void initData() {

    }

    private void initView() {
        //设置进入软件默认选中
        switchFragment(R.id.rb_main);

    }


    public <T> T getInstance(int id) {

        return (T) findViewById(id);
    }

    //设置点击两次退出程序
    private boolean isBack = false;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            if (isBack) {
                finish();
            } else {

                Toast.makeText(MainActivity.this, "再点我!!再点我!!!", Toast.LENGTH_SHORT).show();

                isBack = true;

                //延迟两秒更改状态
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        isBack = false;
                    }
                }, 2000);
            }

            //此处返回true表示只响应 KEYCODE_BACK 的状态
            // . 若在最后返回true可能会出现别的按键也响应次状态
            // .即出现点击两次返回
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}

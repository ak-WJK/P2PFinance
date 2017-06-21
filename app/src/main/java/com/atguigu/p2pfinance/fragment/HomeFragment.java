package com.atguigu.p2pfinance.fragment;

import android.view.View;

import com.atguigu.p2pfinance.R;
import com.atguigu.p2pfinance.base.BaseFragment;
import com.atguigu.p2pfinance.utils.UIUtils;

/**
 * Created by Administrator on 2017/6/20.
 */

public class HomeFragment extends BaseFragment {


    @Override
    public View initView() {
        return UIUtils.getInflate(R.layout.fragment_home);
    }


    @Override
    protected void initData() {


    }

}

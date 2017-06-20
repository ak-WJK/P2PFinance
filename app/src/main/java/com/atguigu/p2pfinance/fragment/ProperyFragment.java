package com.atguigu.p2pfinance.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atguigu.p2pfinance.common.MyApplication;

/**
 * Created by Administrator on 2017/6/20.
 */

public class ProperyFragment extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        textView = new TextView(MyApplication.getContext());
        textView.setTextColor(Color.BLACK);

        return textView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        textView.setText("ProperyFragment");
        super.onActivityCreated(savedInstanceState);
    }


}

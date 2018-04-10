package com.example.zhouwen26.myyizhiapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zhouwen26 on 2018/1/5.
 */

public abstract class BaseCompatActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayoutId());
        initView();
        initData();
        initListener();
    }

    protected abstract int initLayoutId();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initListener();
}

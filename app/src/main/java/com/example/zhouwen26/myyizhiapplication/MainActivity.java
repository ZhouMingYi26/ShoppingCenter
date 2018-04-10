package com.example.zhouwen26.myyizhiapplication;

import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseCompatActivity {


    @BindView(R.id.fl_container)
    FrameLayout flContainer;
    @BindView(R.id.bniv_bar)
    BottomNavigationItemView bnivBar;
    @BindView(R.id.nv)
    NavigationView nv;
    @BindView(R.id.dl_root)
    DrawerLayout dlRoot;

    protected int initLayoutId() {
        return R.layout.activity_main;
    }

    protected void initView() {
        ButterKnife.bind(this);
//        WindowManager windowManager = this.getWindowManager();
//        int width = windowManager.getDefaultDisplay().getWidth();
//        int height = windowManager.getDefaultDisplay().getHeight();
//        DrawerLayout mDl = findViewById(R.id.dl_root);
//        ViewGroup.LayoutParams params = mDl.getLayoutParams();
//        params.width = width/5*4;
//        params.height = height;
//        mDl.setLayoutParams(params);
    }

    protected void initData() {

    }

    protected void initListener() {

    }

    @OnClick({R.id.bniv_bar, R.id.nv})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bniv_bar:
                break;
            case R.id.nv:
                break;
        }
    }
}

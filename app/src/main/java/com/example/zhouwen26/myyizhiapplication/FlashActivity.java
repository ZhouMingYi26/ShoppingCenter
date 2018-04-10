package com.example.zhouwen26.myyizhiapplication;

import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sdk.helper.RxHelper;
import com.example.sdk.utils.StringUtils;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

public class FlashActivity extends BaseCompatActivity {

    @BindView(R.id.tv_count_down)
    TextView tvCountDown;
    @BindView(R.id.ll_skip)
    LinearLayout llSkip;
    private int mTime = 3;


    @Override
    protected int initLayoutId() {
        return R.layout.activity_flash;
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);

    }

    @Override
    protected void initData() {
        Observable.interval(1, TimeUnit.SECONDS)
                .take(3)
                .map(new Function<Long, Long>() {
                    @Override
                    public Long apply(Long aLong) throws Exception {
                        return mTime - aLong;
                    }
                })
                .compose(RxHelper.<Long>rxSchedulerHelper())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Long value) {
                        String s = String.valueOf(value);
                        tvCountDown.setText(StringUtils.isEmail(s) ? "" : s);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        Intent intent = new Intent(FlashActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
    }

    @Override
    protected void initListener() {

    }

    @OnClick(R.id.ll_skip)
    public void onViewClicked() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

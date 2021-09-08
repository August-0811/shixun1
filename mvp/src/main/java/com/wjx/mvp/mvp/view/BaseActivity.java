package com.wjx.mvp.mvp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wjx.mvp.mvp.presenter.IPresenter;



/**
 * Description :
 *
 * @author wangjiaxing
 * @date 2021/9/3
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IView,IActivity {
    protected P mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bandLayout());
        initView();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null){
            mPresenter.destory();
            mPresenter=null;
        }
    }
}

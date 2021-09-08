package com.wjx.mvp.mvp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.wjx.mvp.mvp.presenter.IPresenter;


/**
 * Description :
 *
 * @author wangjiaxing
 * @date 2021/9/3
 */
public abstract class BaseFragment<P extends IPresenter> extends Fragment implements IFragment,IView{
    protected P mPresenter;
    View baseView;
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        baseView= inflater.inflate(bandLayout(), container, false);
        return baseView;
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
    }

    @Override
    public <T extends View> T findViewById(int id) {
        return baseView.findViewById(id);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null){
            mPresenter.destory();
            mPresenter=null;
        }
    }
}

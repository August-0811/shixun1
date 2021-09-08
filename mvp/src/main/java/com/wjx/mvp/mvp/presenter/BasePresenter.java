package com.wjx.mvp.mvp.presenter;


import com.wjx.mvp.mvp.model.IModel;
import com.wjx.mvp.mvp.view.IView;


/**
 * Description :
 *
 * @author wangjiaxing
 * @date 2021/9/3
 */
public class BasePresenter<V extends IView,M extends IModel> implements IModel {
    protected  V mView;
    protected  M mModel;

    public BasePresenter(V mView, M mModel) {
        this.mView = mView;
        this.mModel = mModel;
    }

    @Override
    public void destory() {
        if (mView!=null){
            mView=null;
        }
        if (mModel!=null){
            mModel.destory();
            mModel=null;
        }
    }
}

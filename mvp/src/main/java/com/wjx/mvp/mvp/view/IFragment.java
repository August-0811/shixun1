package com.wjx.mvp.mvp.view;

import android.view.View;

import androidx.annotation.IdRes;

/**
 * Description :
 *
 * @author wangjiaxing
 * @date 2021/9/3
 */
public interface IFragment extends IActivity{
    public <T extends View> T findViewById(@IdRes int id);
}

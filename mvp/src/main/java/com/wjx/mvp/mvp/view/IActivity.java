package com.wjx.mvp.mvp.view;

import androidx.annotation.LayoutRes;

/**
 * Description :
 *
 * @author wangjiaxing
 * @date 2021/9/3
 */
public interface IActivity {
    @LayoutRes
    int bandLayout();
    void initView();
    void initData();
}

package com.wjx.common.utilis

import android.content.Context
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Description :
 *
 * @author wangjiaxing
 * @date 2021/9/8
 */
object GlideUtilis {
    fun loadImg(view:View,url:String,img:ImageView) {
        Glide.with(view).load(url).into(img)
    }
    fun loadImg(context: Context, url:String, img:ImageView) {
        Glide.with(context).load(url).into(img)
    }
    fun loadImg(context: Context, url:Int, img:ImageView) {
        Glide.with(context).load(url).into(img)
    }

}
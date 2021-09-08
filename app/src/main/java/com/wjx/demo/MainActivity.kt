package com.wjx.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wjx.common.utilis.GlideUtilis
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlideUtilis.loadImg(this,"https://tse3-mm.cn.bing.net/th/id/OIP-C.S2zKj-4y-JyQDG04boxtGgHaMW?pid=ImgDet&rs=1",img);
    }
}
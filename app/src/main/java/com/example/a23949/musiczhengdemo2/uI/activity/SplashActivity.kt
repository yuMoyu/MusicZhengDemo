package com.example.a23949.musiczhengdemo2.uI.activity

import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.example.a23949.musiczhengdemo1.base.BaseActivity
import com.example.a23949.musiczhengdemo2.R
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

/**
 * author 墨鱼
 * Date: 2019/5/12
 * ClassName:SplashActivity
 * Description:欢迎页
 */

class SplashActivity: BaseActivity(), ViewPropertyAnimatorListener {
    override fun onAnimationEnd(p0: View?) {
        //进入主界面
        // startActivity<MainActivity>()
        //.结束当前界面
        //finish()
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(p0: View?) {

    }

    override fun onAnimationStart(p0: View?) {

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    /**
     *缩小动画
     * ViewCompat 属性动画 animate所需处理view
     */
    override fun initData() {
        //imageView  x y各缩放至1.0，动画时间2秒
        //listener监听动画结束否
       ViewCompat.animate(imageView).scaleX(1.0f).scaleY(1.0f).setListener(this).setDuration(2000)
    }

}
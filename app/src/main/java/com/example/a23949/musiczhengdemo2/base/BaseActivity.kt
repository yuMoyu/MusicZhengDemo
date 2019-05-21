package com.example.a23949.musiczhengdemo1.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 * author 墨鱼
 * Date: 2019/5/10
 * ClassName:BaseActivity
 * Description:所有Activity的基类
 */
//继承自AppCompatActivity
//继承AnkoLogger弹log日志
abstract class BaseActivity:AppCompatActivity(),AnkoLogger{
    //复写
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }
    /**
     * 初始化数据
     * open 允许子类复写
     */
    open protected fun initData() {
    }
    /**
     * listener与adapter相关操作
     */
    protected fun initListener() {

    }
    /**
     * 获取布局ID
     */
    abstract fun getLayoutId():Int

    /**
     * 解决子线程弹toast的安全问题
     */
    protected fun myToast(msg:String){
        runOnUiThread { toast(msg) }
    }

    /**
     * 开启activity并且finish当前界面
     * 模仿原startActivity,上限为BaseActivity
      */
    inline fun <reified T:BaseActivity> startActivityAndFinish(){
        startActivity<T>()
        finish()
    }

}
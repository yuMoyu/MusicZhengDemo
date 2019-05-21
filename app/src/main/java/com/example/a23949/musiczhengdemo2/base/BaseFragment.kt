package com.example.a23949.musiczhengdemo1.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.support.v4.toast
import org.jetbrains.anko.toast

/**
 * author 墨鱼
 * Date: 2019/5/10
 * ClassName:BaseFragment
 * Description:所有fragment的基类
 */

abstract class BaseFragment:Fragment() ,AnkoLogger{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    /**
     * fragment初始化
     */
    protected fun init() {
    }

    /**
     * 实现布局
     */
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //不知道view类型，由子类返回view类型
        return initView()
    }

    /**
     * 获取布局view
     */
    abstract fun initView(): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }
    /**
     * 数据
     */
    protected fun initData() {
    }
    /**
     * listener adapter
     */
    protected fun initListener() {
    }

    fun myToast(msg:String){
        context?.runOnUiThread { toast(msg) }
    }
}
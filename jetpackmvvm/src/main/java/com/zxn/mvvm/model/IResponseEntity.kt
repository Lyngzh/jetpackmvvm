package com.zxn.mvvm.model

/**
 * Created by zxn on 2021/2/5.
 */
interface IResponseEntity<out T> {

    /**
     *判断请求的结果状态.
     * @return true:网络数据请求成功,false:请求失败.
     */
    fun succeed(): Boolean

    /**
     * 响应码
     */
    fun code(): Int

    /**
     * 获取抽象实体结果.
     * @return T
     */
    fun entity(): T?

    /**
     * 响应结果信息描述
     */
    fun message(): String
}
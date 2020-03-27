package com.chigo.architecturedemo.mvp

import com.chigo.architecturedemo.Login

/**
 * <pre>
 *     author : Chigo
 *     e-mail : isllyend@gmail.com
 *     time   : 2020/03/26
 *     desc   :
 *     (:
 * </pre>
 */
interface IModel {
    //持有Presenter
    fun setPresenter(presenter: IPresenter)

    //登录处理
    fun login(login: Login)
}

interface IView {
    //持有Presenter
    fun setPresenter(presenter: IPresenter)

    //数据加载时UI展示
    fun showLoading();

    //数据处理完后的UI展示
    fun showResult(result: String)
}

interface IPresenter {
    //持有model
    fun setModel(model: IModel)

    //持有view
    fun setView(view: IView)

    //view更新之后通知Presenter
    fun login(login: Login)

    //model更新数据后通知Presenter
    fun showResult(str: String)

    //加载数据时
//    fun handleData()
}
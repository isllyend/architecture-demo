package com.chigo.architecturedemo.mvvm

import com.chigo.architecturedemo.Login

/**
 * <pre>
 *     author : Chigo
 *     e-mail : isllyend@gmail.com
 *     time   : 2020/03/29
 *     desc   :
 *     (:
 * </pre>
 */
interface IViewModel {
    //持有model
    fun setModel(model: IModel)

    fun login()

    fun showResult(result: String)
}

interface IModel {
    fun setViewModel(iViewModel: IViewModel)

    fun login(login: Login)
}
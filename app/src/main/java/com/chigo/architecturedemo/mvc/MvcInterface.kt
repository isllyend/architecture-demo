package com.chigo.architecturedemo.mvc

import com.chigo.architecturedemo.Login

/**
 * <pre>
 *     author : Chigo
 *     e-mail : isllyend@gmail.com
 *     time   : 2020/03/25
 *     desc   :
 *     (:
 * </pre>
 */
interface IModel{
    fun setView(view:IView)

    fun login(login: Login)
}
interface IView{
    fun setController(controller: IController)

    fun onDataHanding()

    fun onDataHanded(msg: String)
}

interface IController{

    fun setModel(model: IModel)

    fun login(login: Login)
}
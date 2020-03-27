package com.chigo.architecturedemo.mvc

import android.util.Log
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
class LoginController : IController {
    private var model: IModel? = null;
    override fun setModel(model: IModel) {
        this.model = model;
    }

    override fun login(login: Login) {
        Log.e("Chigo LoginController login",login.toString());
        model?.login(login)
    }

}
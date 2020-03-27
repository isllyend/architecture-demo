package com.chigo.architecturedemo.mvp

import android.util.Log
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
class LoginPresenter : IPresenter {
    private var loginModel: IModel? = null;
    private var loginView: IView? = null;
    override fun setModel(model: IModel) {
        this.loginModel = model;
    }

    override fun setView(view: IView) {
        loginView = view;
    }

    override fun login(login: Login) {
        loginView?.showLoading();
        loginModel?.login(login)
    }

    override fun showResult(str: String) {
        Log.e("Chigo presenter showResult",str);
        loginView?.showResult(str)
    }

}
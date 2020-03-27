package com.chigo.architecturedemo.mvp

import android.os.Handler
import android.os.Looper
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
class LoginModel : IModel {
    private var presenter: IPresenter? = null;
    private val handle: Handler = Handler(Looper.getMainLooper());
    override fun setPresenter(presenter: IPresenter) {
        this.presenter = presenter
    }

    override fun login(login: Login) {
        Log.e("Chigo model",login.toString());
        val msg = if (login.account == "1234" && login.password == "123") {
            "login success"
        } else {
            "account or password error !"
        }
        handle.postDelayed({
            presenter?.showResult(msg)
        }, 3000)
        Log.e("Chigo model",msg);

    }

}
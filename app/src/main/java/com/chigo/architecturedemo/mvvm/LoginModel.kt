package com.chigo.architecturedemo.mvvm

import android.os.Handler
import android.os.Looper
import android.util.Log
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
class LoginModel : IModel {
    private var iViewModel: IViewModel? = null;
    private val handle = Handler(Looper.getMainLooper());
    override fun setViewModel(iViewModel: IViewModel) {
        this.iViewModel = iViewModel;
    }

    override fun login(login: Login) {
        Log.e("MVVM Login ",login.toString())
        handle.removeCallbacksAndMessages(null)
        val result = if (login.account == "1234" && login.password == "123") {
            " login success";
        } else {
            "account or password error !"
        }
        handle.postDelayed({
            iViewModel?.showResult(result)
            Log.e("MVVM Login ",result)
        }, 3000)
    }

}
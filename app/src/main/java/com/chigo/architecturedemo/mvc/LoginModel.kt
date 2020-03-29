package com.chigo.architecturedemo.mvc

import android.os.Handler
import android.os.Looper
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
class LoginModel : IModel {
    private lateinit var view: IView;

    private val handler: Handler = Handler(Looper.getMainLooper())

    override fun setView(view: IView) {
        this.view = view
    }

    override fun login(login: Login) {
        Log.e("Chigo model login",login.toString());
        // 处理数据中
        view.onDataHanding()
        handler.removeCallbacksAndMessages(null)
        // 延迟来模拟网络或者磁盘操作
        handler.postDelayed({
            // 数据处理完成，通知 View 更新界面
            var msg=if (login.password==="123"&&login.account==="1234") "login success" else "account or password error "
            view.onDataHanded(msg)
        }, 3000)
    }

}
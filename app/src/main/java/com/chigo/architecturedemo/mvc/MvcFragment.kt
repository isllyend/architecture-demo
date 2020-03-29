package com.chigo.architecturedemo.mvc

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chigo.architecturedemo.Login
import com.chigo.architecturedemo.R
import kotlinx.android.synthetic.main.architecture.*

/**
 * <pre>
 *     author : Chigo
 *     e-mail : isllyend@gmail.com
 *     time   : 2020/03/25
 *     (:
 * </pre>
 */

class MvcFragment : Fragment(), IView {
    companion object {
        fun newInstance(): Fragment {
            return MvcFragment()
        }
    }

    private var loginModel: IModel= LoginModel();
    private var loginController: IController = LoginController();

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.architecture, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setController(loginController)
        loginModel.setView(this)
        Log.e("Chigo","login model not null")

        tvTitle.text = "MVC"


        btnConfirm.setOnClickListener {
            Log.e("Chigo","btnConfirm click");
            loginController.login(Login(etAccount.text.toString(), etPwd.text.toString()))
        }
    }

    override fun setController(controller: IController) {
        this.loginController = controller;
        this.loginController.setModel(loginModel)
    }

    override fun onDataHanding() {
        tvHandle.text = "login loading ..."
    }

    override fun onDataHanded(msg: String) {
        tvHandle.text = msg
    }

}
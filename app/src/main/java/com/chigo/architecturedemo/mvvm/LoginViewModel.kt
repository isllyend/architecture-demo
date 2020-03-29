package com.chigo.architecturedemo.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
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
class LoginViewModel : IViewModel {
    private var model: IModel? = null;
    var accountText: MutableLiveData<String> = MutableLiveData()
    var passwordText: MutableLiveData<String> = MutableLiveData()
    var handleText: MutableLiveData<String> = MutableLiveData()

    init {
//        accountText.observeForever { Log.e("Chigo",it); }
//        passwordText.observeForever { passwordText.value = it }
        handleText.value = "please login"
        accountText.value = ""
        passwordText.value = ""
    }

    override fun setModel(model: IModel) {
        this.model = model;
    }

    override fun login() {
        Log.e("Chigo click",accountText.value!!);
        handleText.value="login loading..."
        model?.login(Login(accountText.value!!, passwordText.value!!))
    }

    override fun showResult(result: String) {
        Log.e("Chigo showResult",result);
        handleText.value = result;
    }

}

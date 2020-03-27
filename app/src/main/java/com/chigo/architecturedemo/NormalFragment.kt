package com.chigo.architecturedemo

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.architecture.*

/**
 * <pre>
 *     author : Chigo
 *     e-mail : isllyend@gmail.com
 *     time   : 2020/03/25
 *     (:
 * </pre>
 */

class NormalFragment : Fragment() {
    companion object {
        fun newInstance(): Fragment {
            return NormalFragment()
        }
    }

    private val handler: Handler = Handler()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.architecture, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnConfirm.setOnClickListener {
            handleData(Login(etAccount.text.toString(), etPwd.text.toString()))
        }
    }

    private fun handleData(data: Login) {
        tvHandle.text = "handle data..."
        if (data.account == "1234" && data.password == "123") {
            handler.postDelayed({
                tvHandle.text = "login successfully!!"
            }, 3000)
        } else {
            handler.postDelayed({
                tvHandle.text = "account or password error!!"
            }, 3000)
        }
    }
}
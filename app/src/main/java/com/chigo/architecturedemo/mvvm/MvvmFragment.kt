package com.chigo.architecturedemo.mvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.chigo.architecturedemo.R
import com.chigo.architecturedemo.databinding.DatabindingArchitectureBinding

/**
 * <pre>
 *     author : Chigo
 *     e-mail : isllyend@gmail.com
 *     time   : 2020/03/25
 *     (:
 * </pre>
 */

class MvvmFragment : Fragment() {
    companion object {
        fun newInstance(): Fragment {
            return MvvmFragment()
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: DatabindingArchitectureBinding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.databinding_architecture,
                container,
                false
            );
        binding.lifecycleOwner = this
        val loginViewModel = LoginViewModel()
        val loginModel=LoginModel();
        loginModel.setViewModel(loginViewModel)
        loginViewModel.setModel(loginModel)
        binding.viewmodel = loginViewModel
        return binding.root
    }

}
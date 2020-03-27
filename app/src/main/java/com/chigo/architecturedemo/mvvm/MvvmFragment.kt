package com.chigo.architecturedemo.mvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
        return inflater.inflate(R.layout.architecture, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvTitle.text="MVVM"
    }

}
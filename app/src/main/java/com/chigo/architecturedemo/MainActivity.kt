package com.chigo.architecturedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.chigo.architecturedemo.mvc.MvcFragment
import com.chigo.architecturedemo.mvp.MvpFragment
import com.chigo.architecturedemo.mvvm.MvvmFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment(NormalFragment.newInstance())
        tvNormal.setOnClickListener {
            setFragment(NormalFragment.newInstance())
        }
        tvMvc.setOnClickListener { setFragment(MvcFragment.newInstance()) }
        tvMvp.setOnClickListener { setFragment(MvpFragment.newInstance()) }
        tvMvvm.setOnClickListener { setFragment(MvvmFragment.newInstance()) }
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment).commit()
    }
}

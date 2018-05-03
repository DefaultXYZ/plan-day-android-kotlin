package com.defaultxyz.planday.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.defaultxyz.planday.R
import com.defaultxyz.planday.ui.fragment.LoginFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            val fragment = LoginFragment()
            supportFragmentManager.beginTransaction()
                    .add(R.id.container, fragment, LoginFragment.TAG).commit()
        }
    }
}

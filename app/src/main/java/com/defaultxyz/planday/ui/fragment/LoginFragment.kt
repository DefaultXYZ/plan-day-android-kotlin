package com.defaultxyz.planday.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.defaultxyz.planday.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_sign_up.setOnClickListener { onSignUp() }
        btn_sign_in.setOnClickListener { onSignIn() }
    }

    private fun onSignUp() {
        val fragment = SignUpFragment()
        activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.container, fragment, SignUpFragment.TAG)
                ?.addToBackStack(null)?.commit()
    }

    private fun onSignIn() {
        val fragment = SignInFragment()
        activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.container, fragment, SignInFragment.TAG)
                ?.addToBackStack(null)?.commit()
    }

    companion object {
        const val TAG = "LoginFragment"
    }
}

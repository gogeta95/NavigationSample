package com.example.navigationsample.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationsample.R
import com.example.navigationsample.SharedPreferenceHelper
import kotlinx.android.synthetic.main.layout_login.*

class LoginFragment :Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.layout_login,container,false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener{
            SharedPreferenceHelper.setLoggedIn(requireContext(),true)
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        btn_register.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }
}
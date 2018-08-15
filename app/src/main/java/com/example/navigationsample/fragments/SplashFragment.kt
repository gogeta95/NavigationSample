package com.example.navigationsample.fragments

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationsample.R
import com.example.navigationsample.SharedPreferenceHelper

class SplashFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.layout_splash, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Handler().postDelayed({
            context?.let {
                if (SharedPreferenceHelper.isLoggedIn(it))
                    findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
                else
                    findNavController().navigate(R.id.action_splashFragment_to_login)

            }
        }, 2500)
    }
}
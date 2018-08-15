package com.example.navigationsample

import android.content.Context
import android.preference.PreferenceManager

object SharedPreferenceHelper {
    private const val KEY_LOGGED_IN = "LOGGED_IN"

    fun isLoggedIn(context: Context) =
            PreferenceManager.getDefaultSharedPreferences(context)
                    .getBoolean(KEY_LOGGED_IN, false)

    fun setLoggedIn(context: Context, isLoggedIn: Boolean) =
            PreferenceManager.getDefaultSharedPreferences(context)
                    .edit()
                    .putBoolean(KEY_LOGGED_IN, isLoggedIn)
                    .apply()
}
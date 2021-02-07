package com.vexxtechmedia.utilslibrary

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager

object VexxTechViewUtils {

    fun hideKeyboard(activity: Activity) {
        activity.currentFocus?.let {
            val manager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

            manager.hideSoftInputFromWindow(it.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        }
    }

    fun startNoKeyboard(activity: Activity) = activity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

    fun isPortrait(context: Context): Boolean = context.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT
}
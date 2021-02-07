package com.vexxtechmedia.utilslibrary

import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.io.File

object VexxTechFontUtils {

    const val FONT_AWESOME_FOUR: String = "fonts/fontawesome-four.ttf"
    const val FONT_AWESOME_FIVE: String = "fonts/fontawesome-five.otf"

    fun getTypeface(fontFile: File): Typeface = Typeface.createFromFile(fontFile)

    fun renderIconsInView(view: View, iconLibrary: String) {
        if (view is ViewGroup) {
            val viewGroup: ViewGroup = view

            for (i in 0 until viewGroup.childCount) {
                val child = viewGroup.getChildAt(i)

                renderIconsInView(child, iconLibrary)
            }
        } else if (view is TextView) {
            view.typeface = createIconTypeface(view.context, iconLibrary)
        }
    }

    private fun createIconTypeface(context: Context, iconLibrary: String): Typeface {
        return Typeface.createFromAsset(context.assets, iconLibrary)
    }
}
package com.screechstudios.customtoast

import android.content.Context
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class CustomToast {

    fun showToastWithImage(message: String, @DrawableRes imageDrawable: Int, gravity: Int,
                           xOffset: Int, yOffset: Int, context: Context, layoutInflater: LayoutInflater) {

        val rootLayout = layoutInflater.inflate(R.layout.view_toast, null).apply {
            (findViewById<TextView>(R.id.toastTextView)).text = message
            (findViewById<ImageView>(R.id.toastImage)).setImageDrawable(ContextCompat.getDrawable(context, imageDrawable))
        }

        Toast(context).apply {
            duration = Toast.LENGTH_LONG
            view = rootLayout
            setGravity(gravity, xOffset, yOffset)
            show()
        }
    }
}
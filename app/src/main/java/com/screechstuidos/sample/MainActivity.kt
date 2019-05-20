package com.screechstuidos.sample


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View

import com.screechstudios.customtoast.CustomToast

class MainActivity : AppCompatActivity() {

    private val customToast = CustomToast()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.buttonTop).setOnClickListener { customToast.showToastWithImage("This is a top Toast", R.mipmap.ic_launcher, Gravity.TOP, 0, 0, this@MainActivity, layoutInflater) }

        findViewById<View>(R.id.buttonCenter).setOnClickListener { customToast.showToastWithImage("This is a center Toast", R.mipmap.ic_launcher, Gravity.CENTER, 0, 0, this@MainActivity, layoutInflater) }

        findViewById<View>(R.id.buttonBottom).setOnClickListener { customToast.showToastWithImage("This is a bottom Toast", R.mipmap.ic_launcher, Gravity.BOTTOM, 0, 0, this@MainActivity, layoutInflater) }
    }
}

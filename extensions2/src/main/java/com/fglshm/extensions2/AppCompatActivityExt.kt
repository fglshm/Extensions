package com.fglshm.extensions2

import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.screenWidth(): Int {
    val displayMetrics = DisplayMetrics()
    this.windowManager.defaultDisplay.getMetrics(displayMetrics)
    return displayMetrics.widthPixels
}

fun AppCompatActivity.screenHeight(): Int {
    val displayMetrics = DisplayMetrics()
    this.windowManager.defaultDisplay.getMetrics(displayMetrics)
    return displayMetrics.heightPixels
}

fun AppCompatActivity.scale(): Float {
    return this.resources.displayMetrics.scaledDensity
}




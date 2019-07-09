package com.fglshm.extensions2

import android.content.Context
import android.util.Log

fun Context.showLogV(message: Any?) {
    Log.v(this::class.java.simpleName, message?.toString() ?: "NO TEXT")
}

fun Context.showLogD(message: Any?) {
    Log.d(this::class.java.simpleName, message?.toString() ?: "NO TEXT")
}

fun Context.showLogI(message: Any?) {
    Log.i(this::class.java.simpleName, message?.toString() ?: "NO TEXT")
}

fun Context.showLogW(message: Any?) {
    Log.w(this::class.java.simpleName, message?.toString() ?: "NO TEXT")
}

fun Context.showLogE(message: Any?) {
    Log.e(this::class.java.simpleName, message?.toString() ?: "NO TEXT")
}



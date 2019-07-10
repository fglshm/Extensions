package com.fglshm.extensions2

import android.util.Log
import kotlin.reflect.KClass


fun <T : Any> KClass<T>.showLogV(message: Any?) {
    Log.v(this.java.simpleName, message?.toString() ?: "NO TEXT")
}

fun <T : Any> KClass<T>.showLogD(message: Any?) {
    Log.d(this.java.simpleName, message?.toString() ?: "NO TEXT")
}

fun <T : Any> KClass<T>.showLogI(message: Any?) {
    Log.i(this.java.simpleName, message?.toString() ?: "NO TEXT")
}

fun <T : Any> KClass<T>.showLogW(message: Any?) {
    Log.w(this.java.simpleName, message?.toString() ?: "NO TEXT")
}

fun <T : Any> KClass<T>.showLogE(message: Any?) {
    Log.e(this.java.simpleName, message?.toString() ?: "NO TEXT")
}



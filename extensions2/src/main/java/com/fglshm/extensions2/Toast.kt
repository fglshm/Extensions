package com.fglshm.extensions2

import android.content.Context
import android.view.Gravity
import android.widget.Toast

fun String?.showToast(ctx: Context) {
    Toast.makeText(ctx, this ?: "NO TEXT", Toast.LENGTH_SHORT).show()
}

fun String?.showToastInCenter(ctx: Context) {
    val toast = Toast.makeText(ctx, this ?: "NO TEXT", Toast.LENGTH_SHORT)
    toast.setGravity(Gravity.CENTER, 0, 0)
    toast.show()
}
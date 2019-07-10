package com.fglshm.extensions2

import android.content.Context
import android.os.Handler

fun Context.doAfter(after: Long, action: () -> Unit) {
    Handler().postDelayed({
        action()
    }, after)
}
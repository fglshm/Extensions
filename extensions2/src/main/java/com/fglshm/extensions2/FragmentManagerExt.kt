package com.fglshm.extensions2

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply(action).commit()
}
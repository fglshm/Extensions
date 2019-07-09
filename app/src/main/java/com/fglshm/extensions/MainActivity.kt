package com.fglshm.extensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fglshm.extensions2.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progress.setInvisible()

        supportFragmentManager.transact {

        }

        val width = screenWidth()
        val height = screenHeight()

        this.showLogD("Hello world!!!")

        width.toString().showToastInCenter(this)

    }
}

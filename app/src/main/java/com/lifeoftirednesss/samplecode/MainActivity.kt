package com.lifeoftirednesss.samplecode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        JavaButton.setOnClickListener { startActivity<JavaActivity>() }
        kotlinButton.setOnClickListener { startActivity<kotlinActivity>() }
    }
}

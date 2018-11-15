package com.lifeoftirednesss.samplecode

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kotlin.*
import org.jetbrains.anko.*

class kotlinActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        kotlinButton()
        ankoButton()
        ankoAndIntent()
    }
    private fun kotlinButton(){
        startKotlin.setOnClickListener {
            debug("kotlin")
            Toast.makeText(this, "wahaha!!", Toast.LENGTH_LONG)
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    private fun ankoButton(){
        anko.setOnClickListener {
            longToast("wahaha!!")
            startActivity<MainActivity>()
        }
    }
    private fun ankoAndIntent(){
        AnkoIntent.setOnClickListener {
            startActivity(intentFor<MainActivity>()
                .noHistory()
                .putExtra("wahaha!","Wahaha!!!!"))
        }
    }
}

package com.cursokotlin.androidchips

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ChipChoiceActivity : AppCompatActivity() {

    companion object {
        fun create(context: Context) = Intent(context, ChipChoiceActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip_choice)
    }
}
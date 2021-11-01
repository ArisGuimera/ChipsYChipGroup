package com.cursokotlin.androidchips

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.androidchips.databinding.ActivityChipInputBinding

class ChipInputActivity : AppCompatActivity() {

    companion object {
        fun create(context: Context) = Intent(context, ChipInputActivity::class.java)
    }

    private lateinit var binding: ActivityChipInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChipInputBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
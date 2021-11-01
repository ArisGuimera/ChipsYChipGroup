package com.cursokotlin.androidchips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.androidchips.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAction.setOnClickListener { startActivity(ChipActionActivity.create(this)) }
        binding.btnChoice.setOnClickListener { startActivity(ChipChoiceActivity.create(this)) }
        binding.btnFilter.setOnClickListener { startActivity(ChipFilterActivity.create(this)) }
        binding.btnInput.setOnClickListener { startActivity(ChipInputActivity.create(this)) }
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val group = findViewById<ChipGroup>(R.id.group)
//
//        list.forEachIndexed { index, chipText ->
////            val chipDrawablee = ChipDrawable.createFromAttributes(this, null, 0, R.style.CustomChipChoice)
////            val currentChip = Chip(this).apply {
////                text = chipText
////                id = index
////                setChipDrawable(chipDrawablee)
////            }
//
////            chip.addView(currentChip)
//        }
//
//        //Input
////        group.setOnCheckedChangeListener { group, checkedId ->
////            val chip = group.findViewById<Chip>(checkedId)
////            group.removeView(chip)
////        }
//
//        //Choise
//        group.setOnCheckedChangeListener { group, checkedId ->
//            val chip = group.findViewById<Chip>(checkedId)
//            group.removeView(chip)
//        }
//
//    }
}
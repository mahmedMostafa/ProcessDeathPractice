package com.alien.brainean.processdeathpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val controller = Navigation.findNavController(this, R.id.fragmentContainer)
//        homeButton.setOnClickListener {
//            controller.navigate(R.id.homeFragment)
//        }
//        secondButton.setOnClickListener {
//            controller.navigate(R.id.secondFragment)
//        }
//        thirdButton.setOnClickListener {
//            controller.navigate(R.id.thirdFragment)
//        }
    }
}
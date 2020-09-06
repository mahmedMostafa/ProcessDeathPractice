package com.alien.brainean.processdeathpractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.alien.brainean.processdeathpractice.MainViewModel
import com.alien.brainean.processdeathpractice.R
import kotlinx.android.synthetic.main.fragment_home.*


const val LOCAL_COUNTER = "local_counter"

class HomeFragment : Fragment(R.layout.fragment_home) {


    private val viewModel: MainViewModel by activityViewModels()

    private var localCounter = 0
    private var savedCounter = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState != null) {
            savedCounter = savedInstanceState.getInt(LOCAL_COUNTER)
        }
        setTexts()
        increaseButton.setOnClickListener {
            localCounter++
            savedCounter++
            viewModel.increaseCounter()
            viewModel.increaseStateCounter()
            setTexts()
        }
    }

    private fun setTexts() {
        localCounterText.text = localCounter.toString()
        viewModelLocalText.text = viewModel.getCounter().toString()
        fragmentSavedCounterText.text = savedCounter.toString()
        viewModelSavedCounterText.text = viewModel.savedCounter.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LOCAL_COUNTER, savedCounter)
    }
}
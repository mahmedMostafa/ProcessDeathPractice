package com.alien.brainean.processdeathpractice

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel


const val COUNTER_KEY = "counter"

class MainViewModel(
    private val state: SavedStateHandle
) : ViewModel() {

    private var counter: Int = 0
    var savedCounter: Int
        get() = state.get<Int>(COUNTER_KEY) ?: 0
        set(value) = state.set(COUNTER_KEY, value)

    fun getCounter() = counter

    fun increaseCounter() {
        counter++
    }

    fun increaseStateCounter() {
        println("Counter is ${state.get<Int>(COUNTER_KEY)}")
        savedCounter++
    }
}
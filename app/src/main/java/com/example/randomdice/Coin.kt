package com.example.randomdice

class Coin() {

    fun flip(): String{
        val side = arrayOf("Heads", "Tails")
        return side.random()
    }

}
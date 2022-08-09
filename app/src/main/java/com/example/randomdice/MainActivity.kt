package com.example.randomdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)

        //val myFirstDice = Dice(6)
        //println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

        rollButton.setOnClickListener { rollDice() }


        //val mySecondDice = Dice(20)
        //println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")

        //val coin = Coin()
        //println("Side: ${coin.flip()}")

        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //Set the lucky number
        val luckyNumber = 4
        val diceImage: ImageView = findViewById(R.id.imageView)

        when (diceRoll) {
            luckyNumber -> {
                diceImage.setImageResource(R.drawable.dice_4)
                Toast.makeText(this, "You won", Toast.LENGTH_SHORT).show()
            }
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }

        diceImage.contentDescription = diceRoll.toString()
    }
}
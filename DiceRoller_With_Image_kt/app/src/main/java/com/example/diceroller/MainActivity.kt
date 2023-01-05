package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollDiceBtn)
        rollButton.setOnClickListener {
            rollDice()
            val toast = Toast.makeText(this,"Dice Rolled! ",Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun rollDice() {
        val obj = Dice(6)
        val rollAns : Int = obj.roll()
        val resultImageView: ImageView = findViewById(R.id.imageView)
        resultImageView.setImageResource(R.drawable.dice_1)
        val textView: TextView = findViewById(R.id.roll_the_dice)
        textView.text = rollAns.toString()
        when (rollAns) {
            1 -> resultImageView.setImageResource(R.drawable.dice_1)
            2 -> resultImageView.setImageResource(R.drawable.dice_2)
            3 -> resultImageView.setImageResource(R.drawable.dice_3)
            4 -> resultImageView.setImageResource(R.drawable.dice_4)
            5 -> resultImageView.setImageResource(R.drawable.dice_5)
            6 -> resultImageView.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(private val numSide: Int) {
    fun roll(): Int {
        return (1..numSide).random()
    }
}
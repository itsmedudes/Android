package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollDiceBtn)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
        }


    }

    private fun rollDice() {
        val obj = Dice(6)
        val resultTextview : TextView = findViewById(R.id.rollDiceText)
        resultTextview.text = obj.roll().toString()
        obj.roll()

    }
}
class Dice(private val numSide : Int){
    fun roll(): Int{
        return (1..numSide).random()
    }
}
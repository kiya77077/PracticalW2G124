package com.example.practicalw2g124

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.RollBtn)
        rollBtn.setOnClickListener{ rollDice()}
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val numberTxt: TextView = findViewById(R.id.Numbertxt)
        Toast.makeText(  this,  "Dice is rolled",
        Toast.LENGTH_SHORT).show()
        numberTxt.text = randomInt.toString()
    }
}
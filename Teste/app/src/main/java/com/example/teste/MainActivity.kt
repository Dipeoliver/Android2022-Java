package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roolButton : Button = findViewById((R.id.Btn_roll))
        roolButton.setOnClickListener {it
            //Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()
            roolDice()

         }

    }

    private fun roolDice() {
        //val resulText: TextView = findViewById(R.id.textView)
        //resulText.text = randomInt.toString()
        val randomInt = Random().nextInt(6)+1 // +1 para não começar no zero
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage : ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }
}
package com.example.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.imageView)
        val firstCoffeeBtn = findViewById<Button>(R.id.coffee1btn)
        val secondCoffeeBtn = findViewById<Button>(R.id.coffeetBtn)

        firstCoffeeBtn.setOnClickListener {
            image.setImageResource(R.drawable.coffee1)
        }

        secondCoffeeBtn.setOnClickListener {
            image.setImageResource(R.drawable.coffee2)
        }
    }
}
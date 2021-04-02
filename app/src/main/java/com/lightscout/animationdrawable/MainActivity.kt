package com.lightscout.animationdrawable

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var rocketAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rocketImage = findViewById<ImageView>(R.id.icon_imageView).apply {
            setBackgroundResource(R.drawable.rocket_thrust)
            rocketAnimation = background as AnimationDrawable
        }
        rocketImage.setOnClickListener { rocketAnimation.start() }


        //*
        //
        // It's important to note that the start() method called on the AnimationDrawable cannot be called during the onCreate() method of your Activity, because the AnimationDrawable is not yet fully attached           to the window. If you want to play the animation immediately, without requiring interaction, then you might want to call it from the onStart() method in your Activity, which will get called when              Android makes the view visible on screen.
        //
        // */
    }

}




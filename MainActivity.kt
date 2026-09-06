package com.example.helloworld

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "Hello, World!"
            textSize = 24f
            gravity = Gravity.CENTER
            setTextColor(Color.BLACK)
        }

        setContentView(textView)
    }
}

package com.methersx2.emulator

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "MetherSx2 Engine Ready"
            textSize = 22f
            gravity = Gravity.CENTER
        }
        setContentView(textView)
    }
}

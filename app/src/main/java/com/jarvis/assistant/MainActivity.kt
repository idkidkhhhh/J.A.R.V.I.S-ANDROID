package com.jarvis.assistant

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(5, 11, 24))

        val title = TextView(this)
        title.text = "J.A.R.V.I.S"
        title.textSize = 36f
        title.setTextColor(Color.CYAN)
        title.gravity = Gravity.CENTER

        val status = TextView(this)
        status.text = "SYSTEM ONLINE\n\nGood evening, Sir."
        status.textSize = 20f
        status.setTextColor(Color.WHITE)
        status.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(status)

        setContentView(layout)
    }
}

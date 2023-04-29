package com.zybooks.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class
AboutPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        val backButton = findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "This is my prototype of my mobile application for ISM and the purpose of this app" +
                " will be to demonstrate a prototype of what a weather/ weather event app for the students of FGCU." +
                "The app was made by Sebastian Campos and the app was intended to be a prototype for students. Some examples" +
                " of the functions will be allowing the student to view the weather in Fort Myers or talk about the different weather events" +
                " like hurricanes."

    }


}
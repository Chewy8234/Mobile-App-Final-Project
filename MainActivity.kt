package com.zybooks.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById<Button>(R.id.btn_click_me)
        // set on-click listener
        btn_click_me.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,SplashScreenActivity::class.java)
            startActivity(intent)
        }

        val aboutButton = findViewById<Button>(R.id.about)

        aboutButton.setOnClickListener {
            // Create an intent to start the new activity
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }
    }
}
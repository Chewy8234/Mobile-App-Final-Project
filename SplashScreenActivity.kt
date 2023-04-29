package com.zybooks.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

const val USERNAME = "myusername"
const val PASSWORD = "mypassword"


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.apply {
            title = "Splash Screen"
            setDisplayHomeAsUpEnabled(true)
        }

        setContentView(R.layout.activity_splash_screen)

        val usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        val passwordEditText = findViewById<EditText>(R.id.editTextPassword)
        val loginButton = findViewById<Button>(R.id.buttonLogin)
        val backButton = findViewById<Button>(R.id.btn_back)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Check if the user input matches the login credentials
            if (username == USERNAME && password == PASSWORD) {
                // Navigate the user to the next screen
                val intent = Intent(this@SplashScreenActivity, FGCUWelcome::class.java)
                startActivity(intent)
            } else {
                // Display an error message
                Toast.makeText(this@SplashScreenActivity, "Incorrect username or password", Toast.LENGTH_SHORT).show()
            }
        }
        backButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

}

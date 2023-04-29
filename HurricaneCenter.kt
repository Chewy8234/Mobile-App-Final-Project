package com.zybooks.finalproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class HurricaneCenter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hurricane_center)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnNHC = findViewById<Button>(R.id.NHC)
        btnNHC.setOnClickListener{
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse ("https://www.nhc.noaa.gov/"))
            startActivity(browserIntent)
        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            android.R.id.home -> {
                // This is the back button in the ActionBar
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
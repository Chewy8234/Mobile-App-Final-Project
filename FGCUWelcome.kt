package com.zybooks.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class FGCUWelcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fgcuwelcome)

        val btnFortMyers = findViewById<Button>(R.id.btn_fortmyers)
        btnFortMyers.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse ("https://forecast.weather.gov/MapClick.php?lat=26.6408&lon=-81.8679#.ZEiI-3bMKUk"))
            startActivity(browserIntent)
        }

        val btnNaples = findViewById<Button>(R.id.btn_naples)
        btnNaples.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse ("https://forecast.weather.gov/MapClick.php?lat=26.1393&lon=-81.7958#.ZEiIvHbMKUk"))
            startActivity(browserIntent)
        }

        val btnCapeCoral = findViewById<Button>(R.id.btn_Cape_Coral)
        btnCapeCoral.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse ("https://forecast.weather.gov/MapClick.php?CityName=Cape+Coral&state=FL&site=TBW&textField1=26.6377&textField2=-81.9972&e=0#.ZEiJKnbMKUk"))
            startActivity(browserIntent)
        }

        val nhcButton = findViewById<Button>(R.id.NHC)

        nhcButton.setOnClickListener {
            // Create an intent to start the new activity
            val intent = Intent(this, HurricaneCenter::class.java)
            startActivity(intent)
        }


        val weatherEventsButton = findViewById<Button>(R.id.weatherEvents)

        weatherEventsButton.setOnClickListener {
            val intent = Intent(this, WeatherEvents::class.java)
            startActivity(intent)
        }




        // calling the action bar
        val actionBar: ActionBar? = supportActionBar

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                // Display a confirmation dialog before finishing the activity
                AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to go back?")
                    .setPositiveButton("Yes") { _, _ ->
                        finish()
                    }
                    .setNegativeButton("No", null)
                    .show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


}

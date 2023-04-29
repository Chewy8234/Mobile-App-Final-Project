package com.zybooks.finalproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class WeatherEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_events)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val btnHurricanes = findViewById<Button>(R.id.hurricanes)
        btnHurricanes.setOnClickListener{
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse ("https://oceanservice.noaa.gov/facts/hurricane.html"))
            startActivity(browserIntent)
        }
        val btnTornadoes = findViewById<Button>(R.id.tornadoes)
        btnTornadoes.setOnClickListener{
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse ("https://www.nssl.noaa.gov/education/svrwx101/tornadoes/"))
            startActivity(browserIntent)
        }

        val btnBlizzards = findViewById<Button>(R.id.blizzards)
        btnBlizzards.setOnClickListener{
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse ("https://www.weather.gov/fgz/WinterStorms#:~:text=Blizzards%20are%20dangerous%20winter%20storms,fallen%2C%20creating%20a%20ground%20blizzard."))
            startActivity(browserIntent)
        }

        val btnClimateChange = findViewById<Button>(R.id.climateChange)
        btnClimateChange.setOnClickListener{
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse ("https://climate.nasa.gov/"))
            startActivity(browserIntent)
        }

        val btnDrought = findViewById<Button>(R.id.droughts)
        btnDrought.setOnClickListener{
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse ("https://education.nationalgeographic.org/resource/extreme-weather-droughts/"))
            startActivity(browserIntent)
        }

        val textView = findViewById<TextView>(R.id.text)
        textView.text = "These are some the weather events the first version of the app will have included."


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
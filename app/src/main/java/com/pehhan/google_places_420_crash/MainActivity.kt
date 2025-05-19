package com.pehhan.google_places_420_crash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.google.android.libraries.places.api.Places
import com.pehhan.google_places_420_crash.ui.MainUI

// Obviously an incorrect API key. Isn't related to the crash though, it happens with a valid API key as well.
private const val API_KEY = "XXX"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        initializeGooglePlaces()
        setContent {
            MainUI()
        }
    }

    private fun initializeGooglePlaces() {
        Places.initialize(applicationContext, API_KEY)

        // This is the line where the crash happens.
        val placesClient = Places.createClient(this)
    }
}
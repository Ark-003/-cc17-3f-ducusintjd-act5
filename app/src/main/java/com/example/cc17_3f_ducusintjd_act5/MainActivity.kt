package com.example.cc17_3f_ducusintjd_act5

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val images = arrayOf(
        R.drawable.a_night_under_the_milky_way,
        R.drawable.beneath_the_infinite,
        R.drawable.fields_of_gold_under_a_summer_sky,
        R.drawable.golden_hour_companion,
        R.drawable.lost_relic_of_the_unknown,
        R.drawable.solitary_escape_into_fictional_world,
        R.drawable.sun_dappled_sanctuary,
        R.drawable.twilight_vigil,
        R.drawable.where_dreams_take_flight
    )

    // Arrays for images, titles, and authors
    private val titles = arrayOf(
        "A Night Under the Milky Way",
        "Beneath the Infinite",
        "Fields of Gold Under a Summer Sky",
        "Golden Hour Companion",
        "Lost Relic of the Unknown",
        "Solitary Escape into Fictional World",
        "Sun-Dappled Sanctuary",
        "Twilight Vigil",
        "Where Dreams Take Flight"
    )

    private val authors = arrayOf(
        "Thinution (2020)",
        "IX (2024)",
        "Nuzx Ohn (2018)",
        "Tristan Ducusin (2021)",
        "Ean Shind (2022)",
        "VgDrfU (2017)",
        "Arkx Ynn (2022)",
        "Arkean Milq (2019)",
        "Azki Ent (2022)"
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val imageView = findViewById<ImageView>(R.id.imV)
        val titleTextView = findViewById<TextView>(R.id.titleTxt)
        val authorTextView = findViewById<TextView>(R.id.authorTxt)
        val nextButton = findViewById<Button>(R.id.nextBtn)
        val previousButton = findViewById<Button>(R.id.preveBtn)

        updateArtwork(imageView, titleTextView, authorTextView)

        nextButton.setOnClickListener {
            currentIndex = (currentIndex + 1) % images.size
            updateArtwork(imageView, titleTextView, authorTextView)
        }

        previousButton.setOnClickListener {
            currentIndex = if (currentIndex - 1 < 0) images.size - 1 else currentIndex - 1
            updateArtwork(imageView, titleTextView, authorTextView)
        }
    }

    private fun updateArtwork(imageView: ImageView, titleTextView: TextView, authorTextView: TextView) {
        imageView.setImageResource(images[currentIndex])
        titleTextView.text = titles[currentIndex]
        authorTextView.text = authors[currentIndex]
    }
}
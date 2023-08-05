package com.websarva.wings.android.hajimetenoandroid1

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rate = findViewById<RatingBar>(R.id.rating)
        rate.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            ratingBar.contentDescription = rating.toString()
            Toast.makeText(
                this@MainActivity,
                String.format(Locale.JAPAN, "現在の評価は%fです。", rating),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

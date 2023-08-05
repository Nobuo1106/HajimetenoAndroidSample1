package com.websarva.wings.android.hajimetenoandroid1

import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnEnv = findViewById<Button>(R.id.btnEnv)
        val btnPub = findViewById<Button>(R.id.btnPub)

        val wv = findViewById<WebView>(R.id.wv)
        btnHome.setOnClickListener {
            wv.loadUrl("https://www.google.co.jp/")
        }
        btnEnv.setOnClickListener {
            wv.loadUrl("https://qiita.com/")
        }
        btnPub.setOnClickListener {
            wv.loadUrl("https://www.shuwasystem.co.jp/smp/")
        }
    }
}

package com.websarva.wings.android.hajimetenoandroid1

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Date


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chk = findViewById<CheckBox>(R.id.chk)
        chk.setOnCheckedChangeListener { _ , isChecked ->
            Toast.makeText(
                this@MainActivity,
                if (isChecked) "メール送信をオン" else "メール送信をオフ",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

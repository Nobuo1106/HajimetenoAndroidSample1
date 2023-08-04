package com.websarva.wings.android.hajimetenoandroid1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<Button>(R.id.btnSend)
        val txtName = findViewById<EditText>(R.id.txtName)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnSend.setOnClickListener {
            txtResult.text = getString(R.string.greet, txtName.text)
        }
    }
}

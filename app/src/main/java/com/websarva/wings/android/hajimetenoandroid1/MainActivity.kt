package com.websarva.wings.android.hajimetenoandroid1

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Date


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnCurrentClick(v: View) {
       val txtResult = findViewById<TextView>(R.id.txtResult)
        txtResult.text = Date().toString()
        Log.d("CurrentTime", Date().toString())
        val toast = Toast.makeText(this, Date().toString(), Toast.LENGTH_LONG)
        toast.show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        outState.putString("txtResult", txtResult.text.toString())
    }

    override fun onRestoreInstanceState (savedInstanceState: Bundle){
        super.onRestoreInstanceState(savedInstanceState)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        txtResult.text = savedInstanceState.getString("txtResult")
    }
}

package com.example.test1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var check: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        check   = findViewById(R.id.checkbox)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)

        check.setOnCheckedChangeListener { _, isChecked ->
            Log.d("happySDK", "status : $isChecked")
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button1 -> {
                check.isChecked = true
            }
            R.id.button2 -> {
                check.isChecked = false
            }
        }
    }
}
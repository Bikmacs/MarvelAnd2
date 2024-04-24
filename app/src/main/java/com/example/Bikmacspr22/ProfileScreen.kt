package com.example.Bikmacspr22

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.yalymovpetrpr_22.R

class ProfileScreen : AppCompatActivity() {
    lateinit var button: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_screen)
        button = findViewById(R.id.telek)
    }
    fun perehod1(view: View){
        val intent = Intent(this, Main_Screen::class.java)
        startActivity(intent)

    }
}
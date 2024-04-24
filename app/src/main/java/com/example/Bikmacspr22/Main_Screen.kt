package com.example.Bikmacspr22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Main_Screen : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        button = findViewById(R.id.profil)
    }
    fun perehod(view: View){
        val intent = Intent(this, ProfileScreen::class.java)
        startActivity(intent)

    }

}
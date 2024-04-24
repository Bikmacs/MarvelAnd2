package com.example.Bikmacspr22

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.yalymovpetrpr_22.R

class launch_screen : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)
        email = findViewById(R.id.editText)
        password = findViewById(R.id.editText2)
    }
    fun sigin(view: View){
        if(email.text.toString().isNotEmpty()&&password.text.toString().isNotEmpty()) {
            val intent = Intent(this, Main_Screen::class.java)
            startActivity(intent)
        }else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас не заполненные поля")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }

}
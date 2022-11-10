package com.example.android_teachmeskills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val btnGoToActivity2 = findViewById<Button>(R.id.btnGoToActivity2)

        btnGoToActivity2.setOnClickListener{
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }

// как выйти из приложения через кнопку назад
//    override fun onBackPressed() {
//        super.onBackPressed()
//        finishAffinity()
//    }





}
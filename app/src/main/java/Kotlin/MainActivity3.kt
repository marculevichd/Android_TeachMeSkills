package Kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.android_teachmeskills.R

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val btnGoToActivity3 = findViewById<Button>(R.id.btnGoToActivity1)

        btnGoToActivity3.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
package com.example.android_teachmeskills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

// цикл жизни приложения 6 методов onCreate  onStart onResume onPause onStop onDestroy
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnGoToActivity2 = findViewById<Button>(R.id.btnGoToActivity2)

        btnGoToActivity2.setOnClickListener {
            startActivity(
                Intent(this, MainActivity2::class.java)
                    // с первой на вторую, с второй на третью, с третьей на вторую, с второй выйти
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // активити 2 корневая

                //.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY) // добавить флаг NOHistory означает что 2 активити не добавляется в историю
            // поэтому переход назад в третьей активити перекинет сразу на первую
            )
        }

    }


}
package com.lachlanvass.sit305quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var appData:AppData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.start_button)


        startButton.setOnClickListener {
            val userName = findViewById<EditText>(R.id.name_input)
            val userNameText = userName.text.toString()

            val questionOneIntent = Intent(this, QuizQuestionOne::class.java)

            passAppDataToIntent(questionOneIntent, userNameText, 0)

            startActivity(questionOneIntent)
        }

    }
}
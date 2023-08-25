package com.codecademy.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput: EditText = findViewById(R.id.nameInput)
        val goalsInput: EditText = findViewById(R.id.goalsInpiut)
        val submitBtn: Button = findViewById(R.id.submitBtn)
        val nameOutput: TextView = findViewById(R.id.nameOutput)
        val goalsOutput: TextView = findViewById(R.id.goalsOutput)
        val myPhoto: ImageButton = findViewById(R.id.myImageBtn)
        val myInfo: TextView = findViewById(R.id.aboutMeTv)

        nameOutput.visibility = View.INVISIBLE
        goalsOutput.visibility = View.INVISIBLE
        myInfo.visibility = View.INVISIBLE

        submitBtn.setOnClickListener {
            var name = nameInput.text.toString()
            var goals = goalsInput.text.toString()

            nameOutput.text = "Hello $name!!!"
            goalsOutput.text = "You will become a/an $goals"

            nameOutput.visibility = View.VISIBLE
            goalsOutput.visibility = View.VISIBLE
        }

        myPhoto.setOnClickListener {
            myInfo.text = """Heyyy!! 
                |My name is Nolawi Workineh but you can call me Noli. 
                |I would like to become an android developer. 
                """.trimMargin()
            myInfo.visibility = View.VISIBLE
        }

    }
}
package com.example.myapplication
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

     lateinit var textLabel: TextView
     lateinit var inputField: EditText
     lateinit var validateButton: Button
      var numToGuess: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textLabel = findViewById(R.id.textlabel)
        inputField = findViewById(R.id.textbox)
        validateButton = findViewById(R.id.button1)


        numToGuess = Random.nextInt(1, 100)

        validateButton.setOnClickListener {
            validateInput()
        }
    }

     private fun validateInput() {
        val number = inputField.text.toString().toIntOrNull()

        if (number != null) {
            if (number > numToGuess) {
                textLabel.text = "Too High"
            } else if (number < numToGuess) {
                textLabel.text = "Too Low"
            } else {
                textLabel.text = "Correct"
            }
        } else {
            textLabel.text = "Please enter a valid number"
        }
    }
}

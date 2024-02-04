package com.example.myapplication
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.*

class AnotherActivity : AppCompatActivity() {

private lateinit var arms: ImageView
private lateinit var eyes: ImageView
private lateinit var eyebrows: ImageView
private lateinit var glasses: ImageView
private lateinit var nose: ImageView
private lateinit var mouth: ImageView
private lateinit var mustache: ImageView
private lateinit var ears: ImageView
private lateinit var shoes: ImageView
private lateinit var hat: ImageView

        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        hat = findViewById(id.hat)
        eyes = findViewById(id.eyes)
        eyebrows = findViewById(id.eyebrows)
        glasses = findViewById(id.glasses)
        nose = findViewById(id.nose)
        mouth = findViewById(id.mouth)
        mustache = findViewById(id.mustache)
        ears = findViewById(id.ears)
        arms = findViewById(id.arms)
        shoes = findViewById(id.shoes)

        // Initially, set all parts to be invisible except for potato head
        setAllInvisible()
        }

        fun selectItem(view: View) {
        val checked = (view as CheckBox).isChecked

        when (view.id) {
        id.cbHat -> setVisibility(hat, checked)
        id.cbEyes -> setVisibility(eyes, checked)
        id.cbEyebrows -> setVisibility(eyebrows, checked)
        id.cbGlasses -> setVisibility(glasses, checked)
        id.cbNose -> setVisibility(nose, checked)
        id.cbMouth -> setVisibility(mouth, checked)
        id.cbMustache -> setVisibility(mustache, checked)
        id.cbEars -> setVisibility(ears, checked)
        id.cbArms -> setVisibility(arms, checked)
        id.cbShoes -> setVisibility(shoes, checked)
        }
        }

private fun setVisibility(imageView: ImageView, isVisible: Boolean) {
        if (isVisible) {
        imageView.visibility = View.VISIBLE
        } else {
        imageView.visibility = View.INVISIBLE
        }
        }

private fun setAllInvisible() {
        hat.visibility = View.INVISIBLE
        eyes.visibility = View.INVISIBLE
        eyebrows.visibility = View.INVISIBLE
        glasses.visibility = View.INVISIBLE
        nose.visibility = View.INVISIBLE
        mouth.visibility = View.INVISIBLE
        mustache.visibility = View.INVISIBLE
        ears.visibility = View.INVISIBLE
        arms.visibility = View.INVISIBLE
        shoes.visibility = View.INVISIBLE
        }
        }
package by.tms.androidtestapp.dz2

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.tms.androidtestapp.R
import kotlinx.android.synthetic.main.animation_layout.*

private lateinit var catsAnimation: AnimationDrawable

class AnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation_layout)
        animationImage.apply {
            //setBackgroundResource(R.drawable.cat_animation)
            catsAnimation = background as AnimationDrawable
        }


    }

    override fun onStart() {
        super.onStart()
        catsAnimation.start()
    }
}
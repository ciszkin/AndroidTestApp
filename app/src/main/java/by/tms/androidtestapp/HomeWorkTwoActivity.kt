package by.tms.androidtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.home_work_two_layout.*

class HomeWorkTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_work_two_layout)

        showFlags.setOnClickListener {
            startActivity(Intent(this, FlagsActivity::class.java))
        }

        showAnimation.setOnClickListener {
            startActivity(Intent(this, AnimationActivity::class.java))
        }
    }
}

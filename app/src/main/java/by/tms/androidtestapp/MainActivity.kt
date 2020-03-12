package by.tms.androidtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val buttonGoToHomeWork1 = button_homework1
        buttonGoToHomeWork1.setOnClickListener{
            startActivity(Intent(this, HomeWorkOneActivity::class.java))
        }

        val buttonGoToHomeWork2 = button_homework2
        buttonGoToHomeWork2.setOnClickListener {
            startActivity(Intent(this, HomeWorkTwoActivity::class.java))
        }

        val buttonGoToHomeWork3 = button_homework3
        buttonGoToHomeWork3.setOnClickListener {
            startActivity(Intent(this, HomeWorkThreeActivity::class.java))
        }

        val buttonGoToHomeWork4 = button_homework4
        buttonGoToHomeWork4.setOnClickListener {
            startActivity(Intent(this, HomeWorkFourActivity::class.java))
        }
    }
}

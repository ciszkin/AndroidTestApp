package by.tms.androidtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.tms.androidtestapp.dz1.HomeWorkOneActivity
import by.tms.androidtestapp.dz2.HomeWorkTwoActivity
import by.tms.androidtestapp.dz3.HomeWorkThreeActivity
import by.tms.androidtestapp.dz4.HomeWorkFourActivity
import by.tms.androidtestapp.dz5.HomeWorkFiveActivity
import by.tms.androidtestapp.dz6.HomeWorkSixActivity
import by.tms.androidtestapp.dz7.HomeWorkSevenActivity
import by.tms.androidtestapp.dz8.HomeWorkEightActivity
import by.tms.androidtestapp.dz9.HomeWorkNineActivity
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

        val buttonGoToHomeWork5 = button_homework5
        buttonGoToHomeWork5.setOnClickListener {
            startActivity(Intent(this, HomeWorkFiveActivity::class.java))
        }

        val buttonGoToHomeWork6 = button_homework6
        buttonGoToHomeWork6.setOnClickListener {
            startActivity(Intent(this, HomeWorkSixActivity::class.java))
        }

        val buttonGoToHomeWork7 = button_homework7
        buttonGoToHomeWork7.setOnClickListener {
            startActivity(Intent(this, HomeWorkSevenActivity::class.java))
        }

        val buttonGoToHomeWork8 = button_homework8
        buttonGoToHomeWork8.setOnClickListener {
            startActivity(Intent(this, HomeWorkEightActivity::class.java))
        }

        val buttonGoToHomeWork9 = button_homework9
        buttonGoToHomeWork9.setOnClickListener {
            startActivity(Intent(this, HomeWorkNineActivity::class.java))
        }
    }
}

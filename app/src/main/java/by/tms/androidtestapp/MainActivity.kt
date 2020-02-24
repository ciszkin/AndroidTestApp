package by.tms.androidtestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGoToHomeWork1 = button_homework1
        buttonGoToHomeWork1.setOnClickListener{
            Intent(this, HomeWorkOneActivity::class.java)
            startActivity(intent)
        }
    }
}

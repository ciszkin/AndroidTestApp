package by.tms.androidtestapp.dz5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.tms.androidtestapp.R

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_layout)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.portraitContainer, DetailsFragment())
            .commit()
    }
}

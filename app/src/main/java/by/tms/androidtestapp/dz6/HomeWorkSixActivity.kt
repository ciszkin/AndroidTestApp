package by.tms.androidtestapp.dz6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import by.tms.androidtestapp.R
import by.tms.androidtestapp.dz6.database.Planet
import kotlinx.android.synthetic.main.home_work_six_layout.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

var currentPlanet: Planet? = null

class HomeWorkSixActivity : AppCompatActivity(), View.OnClickListener {

    //val planetFragment = PlanetFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_work_six_layout)
        showPlanet.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val db = PlanetCollection.getInstance(this)
        if (p0?.id == showPlanet.id && input.text.isNotEmpty()) {
            CoroutineScope(Dispatchers.IO).launch {
                val list = db.database.getPlanetDao().getPlanets()

                if (list.isEmpty()) db.fillCollection()

                currentPlanet = db.database.getPlanetDao().findByName(input.text.toString().toLowerCase())
                withContext(Dispatchers.Main) {
                    val planetFragment = PlanetFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.planetContainer, planetFragment).commit()
                    input.text.clear()
                }
            }
        }
    }
}

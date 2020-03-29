package by.tms.androidtestapp.dz6

import android.content.Context
import androidx.room.Room
import by.tms.androidtestapp.dz6.database.Planet
import by.tms.androidtestapp.dz6.database.PlanetDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PlanetCollection(context: Context) {

    var currentPlanet: Planet? = null

    val database by lazy {
        Room.databaseBuilder(context, PlanetDatabase::class.java, "PlanetsDatabase").build()
    }

    companion object {
        fun getInstance(context: Context) = PlanetCollection(context)
    }

    fun fillCollection() {
        database.getPlanetDao().apply {
            CoroutineScope(Dispatchers.IO).launch {
                addPlanet(
                    Planet(
                        0,
                        "mercury",
                        2439700,
                        0.055274,
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Mercury_in_color_-_Prockter07_centered.jpg/800px-Mercury_in_color_-_Prockter07_centered.jpg"
                    )
                )

                addPlanet(
                    Planet(
                        0,
                        "venus",
                        6051800,
                        0.815,
                        "https://upload.wikimedia.org/wikipedia/commons/e/e5/Venus-real_color.jpg"
                    )
                )

                addPlanet(
                    Planet(
                        0,
                        "earth",
                        6378100,
                        1.0,
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/Africa_and_Europe_from_a_Million_Miles_Away.png/800px-Africa_and_Europe_from_a_Million_Miles_Away.png"
                    )
                )

                addPlanet(
                    Planet(
                        0,
                        "mars",
                        3389500,
                        0.107,
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0e/Tharsis_and_Valles_Marineris_-_Mars_Orbiter_Mission_%2830055660701%29.png/800px-Tharsis_and_Valles_Marineris_-_Mars_Orbiter_Mission_%2830055660701%29.png"
                    )
                )

                addPlanet(
                    Planet(
                        0,
                        "jupiter",
                        69911000,
                        317.8,
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Jupiter%2C_image_taken_by_NASA%27s_Hubble_Space_Telescope%2C_June_2019_-_Edited.jpg/800px-Jupiter%2C_image_taken_by_NASA%27s_Hubble_Space_Telescope%2C_June_2019_-_Edited.jpg"
                    )
                )

                addPlanet(
                    Planet(
                        0,
                        "saturn",
                        58232000,
                        95.2,
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Saturn_-_April_25_2016_%2837612580000%29.png/1024px-Saturn_-_April_25_2016_%2837612580000%29.png"
                    )
                )

                addPlanet(
                    Planet(
                        0,
                        "uranus",
                        25362000,
                        14.54,
                        "https://upload.wikimedia.org/wikipedia/commons/b/bb/Uranus.jpg"
                    )
                )

                addPlanet(
                    Planet(
                        0,
                        "neptune",
                        24622000,
                        17.147,
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Neptune_-_Voyager_2_%2829347980845%29_flatten_crop.jpg/800px-Neptune_-_Voyager_2_%2829347980845%29_flatten_crop.jpg"
                    )
                )

            }
        }
    }
}
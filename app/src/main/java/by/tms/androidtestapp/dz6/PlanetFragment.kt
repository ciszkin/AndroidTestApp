package by.tms.androidtestapp.dz6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import by.tms.androidtestapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.planet_fragment_layout.*

class PlanetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.planet_fragment_layout, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(currentPlanet != null) {
            Picasso.get().load(currentPlanet?.imageUrl).into(planetImage)
            planetName.text = currentPlanet?.name
            planetRadius.text = currentPlanet?.radius.toString()
            planetMass.text = currentPlanet?.mass.toString()
        } else {
            Toast.makeText(
                activity, "No such a planet in the Solar system!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
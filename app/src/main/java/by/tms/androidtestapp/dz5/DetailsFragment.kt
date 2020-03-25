package by.tms.androidtestapp.dz5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.tms.androidtestapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.details_fragment_layout.*

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.details_fragment_layout, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Picasso.get().load(SnackCollection.instance.selectedSnack?.imageUrl).into(detailedSnackImage)
        detailedSnackName.text = SnackCollection.instance.selectedSnack?.name
        detailedSnackDescription.text = SnackCollection.instance.selectedSnack?.description
    }
}
package by.tms.androidtestapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_layout.*

class FlowerFragment : Fragment() {

    private var index = 0

    interface CountListener {
        fun countClick()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        when(container?.id) {
            R.id.topFragmentPlace -> index = 0
            R.id.bottomFragmentPlace -> index = 1
        }
        return inflater.inflate(R.layout.fragment_layout, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val model = activity?.run {
            ViewModelProvider(this).get(FlowerChooserViewModel::class.java)
        }

        val currentFlower = model?.getFlower(index)

        Picasso.get().load(currentFlower?.url).into(flowerImage)
        infoCardFlowerName.text = currentFlower?.name
        infoCardFlowerPrice.text = currentFlower?.price.toString()

        buttonCounter.setOnClickListener {
            val countListener = context as CountListener
            countListener.countClick()
        }
    }
}
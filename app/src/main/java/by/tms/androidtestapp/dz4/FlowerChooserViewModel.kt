package by.tms.androidtestapp.dz4

import androidx.lifecycle.ViewModel
import by.tms.androidtestapp.dz4.Flower

class FlowerChooserViewModel : ViewModel() {

    private val listOfFlowers = ArrayList<Flower>()

    fun addFlower(flowerUrl: String, flowerName: String, flowerPrice: Double) {
        listOfFlowers.add(
            Flower(
                flowerUrl,
                flowerName,
                flowerPrice
            )
        )
    }

    fun getSize(): Int {
        return listOfFlowers.size
    }

    fun getFlower(index: Int): Flower {
        return listOfFlowers[index]
    }
}

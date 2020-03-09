package by.tms.androidtestapp

import androidx.lifecycle.ViewModel

class FlowerChooserViewModel : ViewModel() {

    private val listOfFlowers = ArrayList<Flower>()

    fun addFlower(flowerUrl: String, flowerName: String, flowerPrice: Double) {
        listOfFlowers.add(Flower(flowerUrl, flowerName, flowerPrice))
    }

    fun getSize(): Int {
        return listOfFlowers.size
    }

    fun getFlower(index: Int) : Flower {
        return listOfFlowers[index]
    }
}

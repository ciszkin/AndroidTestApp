package by.tms.androidtestapp.dz4

import androidx.lifecycle.ViewModel
import by.tms.androidtestapp.dz4.Flower

class InfoCardViewModel : ViewModel() {
    var flower : Flower? = null

    fun addFlower(flowerUrl: String, flowerName: String, flowerPrice: Double) {
        flower =
            Flower(flowerUrl, flowerName, flowerPrice)
    }
}
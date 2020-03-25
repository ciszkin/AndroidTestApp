package by.tms.androidtestapp.dz3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

class MyViewModel : ViewModel() {

    val confirmedCount = MutableLiveData(0)
    val recoveredCount = MutableLiveData(0)
    val deadCount = MutableLiveData(0)

    suspend fun getDataFromInternet() {
        delay(2000)

        confirmedCount.postValue(28000)
        recoveredCount.postValue(19000)
        deadCount.postValue(50)
    }
}
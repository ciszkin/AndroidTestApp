package by.tms.androidtestapp.dz7

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.tms.androidtestapp.R
import by.tms.androidtestapp.dz7.retrofit.ApiFactory
import kotlinx.android.synthetic.main.home_work_seven_layout.*
import kotlinx.coroutines.*

class HomeWorkSevenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_work_seven_layout)

        CoroutineScope(Dispatchers.IO).launch {
            val coins = ApiFactory.getCoinApi().getTopCoins(10, "USD").await().body()
            withContext(Dispatchers.Main) {
                if (coins != null) {
                    outputView.adapter = CryptoAdapter(coins)
                    outputView.layoutManager = LinearLayoutManager(this@HomeWorkSevenActivity)
                    loading.visibility = View.INVISIBLE
                }
            }
        }

    }
}

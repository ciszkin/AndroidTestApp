package by.tms.androidtestapp.dz5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import by.tms.androidtestapp.R
import kotlinx.android.synthetic.main.home_work_five_layout.*

class HomeWorkFiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_work_five_layout)
        if(SnackCollection.instance.snacks.isEmpty()) SnackCollection.instance.fillTheList()

        val adapter = SnackAdapter(SnackCollection.instance.snacks, recyclerList, supportFragmentManager)
        recyclerList.adapter = adapter
        recyclerList.layoutManager = LinearLayoutManager(this)
        recyclerList.setHasFixedSize(true)
    }
}

package by.tms.androidtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.home_work_three_layout.*
import kotlinx.coroutines.*

class HomeWorkThreeActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_work_three_layout)

        lifecycle.addObserver(MyLifeObserver())

        addConfirmed.setOnClickListener(this)
        addRecovered.setOnClickListener(this)
        addDead.setOnClickListener(this)
        refreshStats.setOnClickListener(this)

        val model = ViewModelProvider(this).get(MyViewModel::class.java)

        model.confirmedCount.observe(this, Observer {
            confirmed.text = it.toString()
        })
        model.recoveredCount.observe(this, Observer {
            recovered.text = it.toString()
        })
        model.deadCount.observe(this, Observer {
            dead.text = it.toString()
        })
    }

    override fun onClick(p0: View?) {

        val model = ViewModelProvider(this).get(MyViewModel::class.java)

        when(p0?.id) {

            R.id.addConfirmed -> {
                with(model.confirmedCount) {
                    postValue(this.value?.plus(1)) }
            }
            R.id.addRecovered -> {
                model.recoveredCount.run {
                    postValue(this.value?.plus(1)) }
            }
            R.id.addDead -> {
                model.deadCount.apply{
                    postValue(this.value?.plus(1))}
            }
            R.id.refreshStats -> {
                MainScope().launch {
                    model.getDataFromInternet()
                }
            }
        }
    }
}

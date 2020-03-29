package by.tms.androidtestapp.dz7

import android.provider.Settings.Global.getString
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import by.tms.androidtestapp.R
import by.tms.androidtestapp.dz7.coins.Coins
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.cryptocurrency_item.view.*
import kotlin.math.roundToInt

class CryptoAdapter(val coins: Coins) : RecyclerView.Adapter<CryptoAdapter.CryptoViewHolder>() {

    class CryptoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.cryptocurrency_item, parent, false)
        return CryptoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return coins.data.size
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {
        val item = holder.itemView

        item.apply {

            Picasso.get()
                .load("https://s2.coinmarketcap.com/static/img/coins/200x200/${coins.data[position].id}.png")
                .into(cryptoImage)
            cryptoName.text = coins.data[position].name
            val price = (coins.data[position].quote.USD.price * 1000).roundToInt() / 1000.0
            cryptoPrice.text = context.getString(R.string.usd_sign)
            cryptoPrice.append(price.toString())
            val change =
                (coins.data[position].quote.USD.percent_change_1h * 100).roundToInt() / 100.0
            when {
                change > 0.0 -> {
                    cryptoChange.setTextColor(getColor(this.context, R.color.green))
                }
                change == 0.0 -> {
                    cryptoChange.setTextColor(getColor(this.context, R.color.black))
                }
                change < 0.0 -> {
                    cryptoChange.setTextColor(getColor(this.context, R.color.red))
                }
            }
            cryptoChange.text = change.toString()
            cryptoChange.append(context.getString(R.string.percent))
        }
    }
}
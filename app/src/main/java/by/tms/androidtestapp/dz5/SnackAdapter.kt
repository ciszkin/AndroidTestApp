package by.tms.androidtestapp.dz5

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import by.tms.androidtestapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.snack_item.view.*

class SnackAdapter(private val list: ArrayList<Snack>, private val recycler: RecyclerView, private val supportFragmentManager: FragmentManager) : RecyclerView.Adapter<SnackAdapter.SnackViewHolder>() {

    class SnackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnackViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.snack_item, parent, false)
        return SnackViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SnackViewHolder, position: Int) {
        val item = holder.itemView

        item.apply{
            Picasso.get().load(list[position].imageUrl).into(snackImage)
            snackName.text = list[position].name
        }
        item.setOnClickListener {
            SnackCollection.instance.selectSnack(position)
            println(SnackCollection.instance.selectedSnack?.name)

            if (SnackCollection.instance.selectedSnack != null) {
                when(recycler.tag) {
                    recycler.context.getString(R.string.landscape) -> supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.landscapeContainer, DetailsFragment())
                        .commit()

                    recycler.context.getString(R.string.portrait) -> {
                        val intent = Intent(recycler.context, DetailsActivity::class.java)
                        recycler.context.startActivity(intent)
                    }
                }
            }
        }
    }
}
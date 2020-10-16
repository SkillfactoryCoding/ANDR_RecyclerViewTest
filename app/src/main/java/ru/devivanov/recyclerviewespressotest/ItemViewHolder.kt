package ru.devivanov.recyclerviewespressotest

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name: TextView = itemView.check_box
    val image = itemView.image_view

    fun bind(item: Item) {
        name.text = item.itemName
        image.setImageResource(R.drawable.ic_launcher_foreground)
    }
}
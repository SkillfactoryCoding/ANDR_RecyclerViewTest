package ru.devivanov.recyclerviewespressotest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var list = listOf<Item>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ItemViewHolder -> holder.bind(list[position])
        }
    }

    fun setItems (itemsList: List<Item>) {
        list = itemsList
        notifyDataSetChanged()
    }
}
package ru.devivanov.recyclerviewespressotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val itemsList = mutableListOf<Item>()
    private lateinit var itemAdapter: ItemRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..20) {
            itemsList.add(Item("Item #$i"))
        }

        recycler_view.apply {
            itemAdapter = ItemRecyclerAdapter()
            adapter = itemAdapter
        }

        itemAdapter.setItems(itemsList)
    }
}
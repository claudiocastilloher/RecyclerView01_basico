package com.claudiocastillo.recyclerview01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        //Datos de ejemplo
        val items = listOf(
            Item("Item 1", R.drawable.ic_item1),
            Item("Item 2", R.drawable.ic_item2),
            Item("Item 3", R.drawable.ic_item3),
        )

        recyclerView.adapter = ItemAdapter(items)

    }
}
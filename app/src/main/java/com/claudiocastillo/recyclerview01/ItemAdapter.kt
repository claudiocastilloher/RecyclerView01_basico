package com.claudiocastillo.recyclerview01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val items: List<Item>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //1.- ViewHolder: Administra las vistas del item
    class ItemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.textView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    //2.- Inflar el diseño del item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view,parent,false)
        return ItemViewHolder(view)
    }
//3.- Vincular datos con la vista
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.textView.text = item.text
        holder.imageView.setImageResource(item.imageRes)
    }

    //4. Tamaño de la lista
    override fun getItemCount() = items.size

}
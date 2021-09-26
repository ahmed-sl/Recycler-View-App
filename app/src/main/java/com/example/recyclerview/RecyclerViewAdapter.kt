package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerViewAdapter(val context: Context, val masg: ArrayList<String>):
    RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       return ItemViewHolder(
           LayoutInflater.from(parent.context).inflate(
               R.layout.item_row,
               parent,
               false
           )
       )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val color = masg[position]

        holder.itemView.apply {
            tvMessage.text = color
        }
    }

    override fun getItemCount() = masg.size
}
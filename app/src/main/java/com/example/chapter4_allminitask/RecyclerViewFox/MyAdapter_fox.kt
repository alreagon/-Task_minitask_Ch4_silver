package com.example.chapter4_allminitask.RecyclerViewFox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_allminitask.R
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter_fox(private val newlist: ArrayList<News_fox>) :
    RecyclerView.Adapter<MyAdapter_fox.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_fox, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newlist[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading
    }

    override fun getItemCount(): Int {
        return newlist.size
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleImage: ShapeableImageView = itemView.findViewById(R.id.tittle_image_fox)
        val tvHeading: TextView = itemView.findViewById(R.id.tvHeading_fox)
    }

}
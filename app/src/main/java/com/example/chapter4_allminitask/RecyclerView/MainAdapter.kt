package com.example.chapter4_allminitask.RecyclerView

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter4_allminitask.R

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    private val myList = ArrayList<DataRecyclerView>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view =inflater.inflate(R.layout.custom_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data = myList[position]
        holder.avatar.setImageResource(data.gambar)
        holder.nama.text = "nama : ${data.nama}"

    }
    fun setData(myData: List<DataRecyclerView>){
        myList.clear()
        myList.addAll(myData)
    }

    override fun getItemCount(): Int {
        return myList.size
    }
    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val avatar: ImageView = itemView.findViewById(R.id.title_image)
        val nama: TextView = itemView.findViewById(R.id.tvHeading)
    }
}
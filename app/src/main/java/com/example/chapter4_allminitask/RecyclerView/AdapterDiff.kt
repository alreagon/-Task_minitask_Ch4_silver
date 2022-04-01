package com.example.chapter4_allminitask.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.chapter4_allminitask.R

class AdapterDiff(val listData: ArrayList<DataRecyclerView>) :
    RecyclerView.Adapter<AdapterDiff.ViewHolder>() {


    private val diffCallback = object : DiffUtil.ItemCallback<DataRecyclerView>() {
        override fun areItemsTheSame(
            oldItem: DataRecyclerView,
            newItem: DataRecyclerView
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: DataRecyclerView,
            newItem: DataRecyclerView
        ): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }

    val differ = AsyncListDiffer( this, diffCallback)
    fun submitData(value: ArrayList<DataRecyclerView>) = differ.submitList(value)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.custom_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = differ.currentList[position]
        Glide.with(holder.itemView.context)
            .load(data.gambar)
            .apply(RequestOptions())
            .into(holder.avatar)
        holder.nama.text = data.nama
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val avatar: ImageView = itemView.findViewById(R.id.title_image)
        val nama: TextView = itemView.findViewById(R.id.tvHeading)
    }


}
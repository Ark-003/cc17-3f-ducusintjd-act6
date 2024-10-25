package com.example.cc17_3f_ducusintjd_act6.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_ducusintjd_act6.R
import com.example.cc17_3f_ducusintjd_act6.model.Days

class DaysAdapter (val data : List<Days>):
    RecyclerView.Adapter<DaysAdapter.DaysItemViewHolder>() {

    class DaysItemViewHolder (val row: View) : RecyclerView.ViewHolder(row){
        val daysCountTextView = row.findViewById<TextView>(R.id.dayCountText)
        val daysHeaderTextView = row.findViewById<TextView>(R.id.dayHeaderText)
        val daysImageView = row.findViewById<ImageView>(R.id.imageView)
        val daysDescTextView = row.findViewById<TextView>(R.id.descText)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaysItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.items_recycler_view, parent, false)
        return DaysItemViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: DaysItemViewHolder, position: Int) {
        holder.daysCountTextView.text = data.get(position).day
        holder.daysHeaderTextView.text = data.get(position).header
        holder.daysImageView.setImageResource(data.get(position).imageResId)
        holder.daysDescTextView.text = data.get(position).desc

    }
}
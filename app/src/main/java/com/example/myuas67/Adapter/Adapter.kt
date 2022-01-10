package com.example.myuas67.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myuas67.Model.Model
import com.example.myuas67.R

class Adapter (
    val ps: ArrayList<Model.Data>
): RecyclerView.Adapter<Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter, parent, false)
    )

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val data = ps[position]
        holder.textps.text = data.nama
        holder.textAlamat.text = data.harga
    }

    override fun getItemCount() = ps.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textps = view.findViewById<TextView>(R.id.textnama)
        val textAlamat = view.findViewById<TextView>(R.id.textalamat)
    }

    public fun setData(data: List<Model.Data>){
        ps.clear()
        ps.addAll(data)
        notifyDataSetChanged()
    }

}
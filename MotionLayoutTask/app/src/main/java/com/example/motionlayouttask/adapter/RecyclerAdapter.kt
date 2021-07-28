package com.example.motionlayouttask.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayouttask.R

class RecyclerAdapter(private val data : ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {
    class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView

        init {
            textView = view.findViewById(R.id.simple_text)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout , parent , false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = data.get(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
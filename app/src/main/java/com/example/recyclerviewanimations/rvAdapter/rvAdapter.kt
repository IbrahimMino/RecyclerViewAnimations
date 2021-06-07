package com.example.recyclerviewanimations.rvAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewanimations.R
import com.example.recyclerviewanimations.model.Item

class rvAdapter(val listItems:List<Item>):RecyclerView.Adapter<rvAdapter.ViewHolder>() {

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        fun onBind(item: Item){
            val title = itemView.findViewById<TextView>(R.id.tv_title)
            val desc = itemView.findViewById<TextView>(R.id.desc)

            title.text = item.title
            desc.text = item.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(listItems[position])
    }
}
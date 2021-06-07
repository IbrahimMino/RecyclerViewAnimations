package com.example.recyclerviewanimations

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewanimations.model.Item
import com.example.recyclerviewanimations.rvAdapter.rvAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var rvAdapter: rvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<Item>(
            Item("Ibrohim","1999"),
            Item("Muhammad","2002"),
            Item("Dilrabo","2006"),
            Item("Nilufar","2004"),
            Item("Xudayberdi","2007"),
            Item("Diyora","2008"),
            Item("Shohjahon","2007"),
            Item("Shahrizoda","2010"),
            Item("Og'abek","2012")
        )

        var listItem:MutableList<Item> = ArrayList()
        var counter = 1
        for (i in 0 until 25){
            listItem.add(Item("Item $counter","Description $counter"))
            counter++
        }
        rvAdapter = rvAdapter(listItem)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = rvAdapter
    }
}
package com.example.myapplication.tuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class Tuan22Main3Activity : AppCompatActivity() {
    var lv:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main3)
        lv = findViewById(R.id.tuan22Lv)
        //nguon du lieu
        val arr = arrayOf("item1","item2","item3","so 4","item5","so 6","7")
        //adapter
        val ad=ArrayAdapter(this,
            android.R.layout.simple_list_item_1,arr)
        //hien thi len list view
        lv!!.adapter=ad
    }
}
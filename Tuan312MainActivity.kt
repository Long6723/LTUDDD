package com.example.myapplication.tuan312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class Tuan312MainActivity : AppCompatActivity() {
    var adap:Tuan312Adapter? = null
    var ls: ArrayList<Tuan312Comtact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main)
        var lv=findViewById<ListView>(R.id.tuan312lv)//anh xa
        //tao nguon du lieu
        ls.add(Tuan312Comtact("Nguyen Van A", "18", R.drawable.android))
        ls.add(Tuan312Comtact("Tran Van B", "20", R.drawable.apple))
        ls.add(Tuan312Comtact("Vu Van C", "17", R.drawable.dell))
        ls.add(Tuan312Comtact("Nguyen Thi D", "21", R.drawable.hp))
        ls.add(Tuan312Comtact("Nguyen Van A", "18", R.drawable.hancock))
        //gan vao adater
        adap=Tuan312Adapter(this, ls)
        lv.adapter=adap

    }
}
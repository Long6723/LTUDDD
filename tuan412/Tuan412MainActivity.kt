package com.example.myapplication.tuan412

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class Tuan412MainActivity : AppCompatActivity() {
    var btn:Button? = null
    var tvKQ:TextView? = null
    var context:Context = this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan412_main)
        btn=findViewById(R.id.tuan412)
        tvKQ=findViewById(R.id.tuan412TvKQ)
        val fn=VolleyKotlinFn()
        btn!!.setOnClickListener {
            fn.getJSONArrayObject(context, tvKQ!!)
        }
    }
}
package com.example.myapplication.tuan22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class Tuan22aMainActivity : AppCompatActivity() {
    var txt1: EditText? = null
    var txt2: EditText? = null
    var btn1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22a_main)
        txt1=findViewById(R.id.tuan22Txt1)
        txt2=findViewById(R.id.tuan22Txt2)
        btn1=findViewById(R.id.tuan22Btn1)
        btn1!!.setOnClickListener(View.OnClickListener {
            var i=Intent(this@Tuan22aMainActivity,
                 Tuan22bMainActivity::class.java)
            i.putExtra("so1",txt1!!.text.toString())
            i.putExtra("so2",txt2!!.text.toString())
            startActivity(i)
        })
    }
}
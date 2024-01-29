package com.example.myapplication.tuan41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan413MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvKQ;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan413_main);
        Tuan41VolleyFn volleyFn=new Tuan41VolleyFn();
        tvKQ=findViewById(R.id.tuan413TvQk);
        btnGetData=findViewById(R.id.tuan413Btn);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context,tvKQ);
            }
        });
    }
}
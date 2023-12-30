package com.example.myapplication.tuan32;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adaprer adaprer;
    ArrayList<T32Contact> ls=new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv=findViewById(R.id.tuan32Lv);
        //tao nguon du lieu
        ls.add(new T32Contact("Nguyen Van A", "18", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van B", "18", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van C", "18", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van D", "18", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van E", "18", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Van F", "18", R.drawable.ic_launcher_background));
        //tao adapter
        adaprer=new T32Adaprer(ls, this);
        lv.setAdapter(adaprer);

    }
}
package com.example.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class tuan11 extends AppCompatActivity {
    //khai bao cac control
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11);
        //anh xa cac control
        txt1=findViewById(R.id.So1);
        txt2=findViewById(R.id.So2);
        btn1=findViewById(R.id.Bam);
        tv1=findViewById(R.id.Tong);
        //xu ly su kien
        btn1.setOnClickListener(v->{
            //goi ham tinh tong
            tinhTong();

        });
    }
    //dinh nghia ham tinh tong
    private void tinhTong(){
        //lay du lieu nhap vao tu Editext1
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1);//chuyen du lieu sang so
        //lay du lieu nhap vao tu Editext2
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        //tinh tong
        float tong=so1 + so2;
        // in ket qua ra man hinh
        tv1.setText(String.valueOf(tong));
    }
}
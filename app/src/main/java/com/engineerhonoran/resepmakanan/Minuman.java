package com.engineerhonoran.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Minuman extends AppCompatActivity {
    Button tombolcendol,tomboleslilin,tombolsakoteng,tombolgoyobot,tombolesoyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);
        init();

        tombolcendol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Minuman.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",1);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        tomboleslilin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Minuman.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",2);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        tombolsakoteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Minuman.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",3);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        tombolgoyobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Minuman.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",4);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        tombolesoyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Minuman.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",5);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

    }
    private void init(){

        tombolcendol = (Button) findViewById(R.id.btn_cendol);
        tomboleslilin = (Button) findViewById(R.id.btn_eslilin);
        tombolsakoteng = (Button) findViewById(R.id.btn_sakoteng);
        tombolgoyobot = (Button) findViewById(R.id.btn_goyobot);
        tombolesoyen = (Button) findViewById(R.id.btn_esoyen);
    }
}

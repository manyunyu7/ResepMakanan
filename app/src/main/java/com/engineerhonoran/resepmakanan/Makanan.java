package com.engineerhonoran.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Makanan extends AppCompatActivity {
Button bkaredok,bempal,bliwet,bkocok,btumis,burap,blodeh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);
        init();


        bkaredok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Makanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",13);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        bempal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Makanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",14);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        bliwet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Makanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",15);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        bkocok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Makanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",16);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        btumis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Makanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",17);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        burap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Makanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",18);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

        blodeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Makanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",19);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

    }



    private void init(){
        bkaredok = (Button) findViewById(R.id.btnkaredok);
        bempal = (Button) findViewById(R.id.btnempal);
        bliwet = (Button) findViewById(R.id.btnliwet);
        bkocok = (Button) findViewById(R.id.btnmiekocok);
        btumis = (Button) findViewById(R.id.btntumis);
        burap = (Button) findViewById(R.id.btnurap);
        blodeh = (Button) findViewById(R.id.btnlodeh);

    }
}

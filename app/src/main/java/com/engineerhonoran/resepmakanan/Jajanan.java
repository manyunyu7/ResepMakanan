package com.engineerhonoran.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jajanan extends AppCompatActivity {
    Button tombolcilok,tombolbatagor,tombolcireng,tombolcimol,tombolcibay,tombolseblakceker,tombolcolenak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajanan);
        init();
        tombolcilok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Jajanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",6);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });
        tombolbatagor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Jajanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",7);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });
        tombolcireng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Jajanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",8);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });
        tombolcimol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Jajanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",9);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });
        tombolcibay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Jajanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",10);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });
        tombolseblakceker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Jajanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",11);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });
        tombolcolenak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Jajanan.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.putInt("id",12);
                pindah.putExtras(datanya);
                startActivity(pindah);
            }
        });

    }
    private void init(){
        tombolcilok = (Button) findViewById(R.id.btn_cilok);
        tombolbatagor = (Button) findViewById(R.id.btn_batagor);
        tombolcireng = (Button) findViewById(R.id.btn_cireng);
        tombolcimol = (Button) findViewById(R.id.btn_cimol);
        tombolcibay = (Button) findViewById(R.id.btn_cibay);
        tombolseblakceker = (Button) findViewById(R.id.btn_seblakceker);
        tombolcolenak = (Button) findViewById(R.id.btn_colenak);
    }

}

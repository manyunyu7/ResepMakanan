package com.engineerhonoran.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Minuman extends AppCompatActivity {
    Button tombolcendol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);


        tombolcendol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(Minuman.this,Appear.class);
                Bundle datanya=new Bundle();
                datanya.put
            }
        });

    }
    private void init(){

        tombolcendol = (Button) findViewById(R.id.btn_cendol);
    }
}

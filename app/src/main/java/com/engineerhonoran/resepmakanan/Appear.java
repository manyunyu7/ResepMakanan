package com.engineerhonoran.resepmakanan;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Appear extends AppCompatActivity {
ImageView tpfoto;
TextView tpnama,tpresep;
VideoView tpvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appear);
        init();

        if(getIntent().getExtras().isEmpty()){
            Toast.makeText(Appear.this,"Gagal mengambil data",Toast.LENGTH_SHORT).show();
            onBackPressed();
            finish();
        }
        DatabaseHelper dbnya=new DatabaseHelper(Appear.this);
        Bundle datanya=getIntent().getExtras();
        Log.d("idappear",datanya.getInt("id",0)+"");
        Cursor datacursor  = dbnya.ambilId(datanya.getInt("id",0));
        if(datacursor.moveToFirst()){
            tpnama.setText(datacursor.getString(datacursor.getColumnIndex("nama")));
            tpresep.setText(datacursor.getString(datacursor.getColumnIndex("resep")));
            tpfoto.setImageResource(datacursor.getInt(datacursor.getColumnIndex("foto")));
            tpvideo.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + datacursor.getInt(datacursor.getColumnIndex("video"))));
            tpvideo.start();
            datacursor.close();
        }else {
            datacursor.close();
            Toast.makeText(Appear.this,"Gagal mengambil data",Toast.LENGTH_SHORT).show();
            onBackPressed();
            finish();
        }

    }

    private void init() {
        tpvideo = (VideoView)findViewById(R.id.tampilvideo);
        tpnama = (TextView) findViewById(R.id.tampilnama);
        tpfoto = (ImageView) findViewById(R.id.tampilfoto);
        tpresep = (TextView) findViewById(R.id.tampilresep);
    }
}

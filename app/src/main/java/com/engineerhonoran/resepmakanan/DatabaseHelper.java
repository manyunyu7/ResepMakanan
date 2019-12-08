package com.engineerhonoran.resepmakanan;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "db_resep";

    // Table Names
    private static final String DB_TABLE = "tb_resep";

    // column names
    private static final String KEY_NAMA = "nama";
    private static final String KEY_RESEP = "resep";
    private static final String KEY_IMAGE = "foto";
    private static final String KEY_VIDEO = "link";

    // Table create statement
    private static final String CREATE_TABLE_RESEP = "CREATE TABLE " + DB_TABLE + "("+
            KEY_NAMA + " TEXT," +
            KEY_RESEP+  "TEXT,"+
            KEY_IMAGE + " BLOB,"+
            KEY_VIDEO+"TEXT"+")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // creating table
        db.execSQL(CREATE_TABLE_RESEP);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE);
        // create new table
        onCreate(db);
    }
}
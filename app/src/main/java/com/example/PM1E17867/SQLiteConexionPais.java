package com.example.PM1E17867;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.examen1.transacciones.Transacciones;
import com.example.examen1.transacciones.TransaccionesPais;

public class SQLiteConexionPais extends SQLiteOpenHelper {
    public SQLiteConexionPais(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version){

        super(context, dbname, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(TransaccionesPais.CreateTablePais);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(TransaccionesPais.DropTablePais);
        onCreate(db);
    }
}

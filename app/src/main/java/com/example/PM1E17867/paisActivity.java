package com.example.PM1E17867;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.examen1.transacciones.Transacciones;
import com.example.examen1.transacciones.TransaccionesPais;

public class paisActivity extends AppCompatActivity {
    EditText codigo, nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais);


        Button btn = (Button) findViewById(R.id.btnPguardar);
        codigo = (EditText) findViewById(R.id.txtNcodigo);
        nombre = (EditText) findViewById(R.id.txtpais);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AgregarPais();
            }
        });
    }

    private void AgregarPais() {
        SQLiteConexion conexion= new SQLiteConexion(this, TransaccionesPais.NameDataBase, null, 1);
        SQLiteDatabase bd= conexion.getWritableDatabase();
        ContentValues valores=new ContentValues();
        valores.put(TransaccionesPais.codigo, codigo.getText().toString());
        valores.put(TransaccionesPais.nombre, nombre.getText().toString());

        Long resultado=bd.insert(TransaccionesPais.tablapais,TransaccionesPais.id ,valores);
        Toast.makeText(getApplicationContext(), "Ingresado"   + resultado.toString(), Toast.LENGTH_LONG).show();
        bd.close();
    }

}
package com.example.PM1E17867;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.examen1.transacciones.Transacciones;

import java.io.IOException;

@RequiresApi(api = Build.VERSION_CODES.Q)
public class MainActivity extends AppCompatActivity {

    EditText  nombres, telefono, nota;
    Spinner pais;
    String pais1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnG=(Button)findViewById(R.id.btnguardados);
        Button btn= (Button)findViewById(R.id.btnSalvar);
        pais=(Spinner)findViewById(R.id.SpCombo);
        pais1=pais.getSelectedItem().toString();
        nombres=(EditText)findViewById(R.id.txtAnombre);
        telefono=(EditText)findViewById(R.id.txtATelefono);
        nota=(EditText)findViewById(R.id.txtAnots);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AgregarPersonas();
            }
        });


        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListaActivity.class);
                startActivity(intent);
            }
        });
    }

    public void AgregarPersonas() {

            SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.NameDataBase, null, 1);
            SQLiteDatabase bd = conexion.getWritableDatabase();

            ContentValues valores = new ContentValues();
            valores.put(Transacciones.pais, pais1);
            valores.put(Transacciones.nombre, nombres.getText().toString());
            valores.put(Transacciones.numero, telefono.getText().toString());
            valores.put(Transacciones.nota, nota.getText().toString());

            Long resultado = bd.insert(Transacciones.tablapersonas, Transacciones.id, valores);
            Toast.makeText(getApplicationContext(), "Ingresado" + resultado.toString(), Toast.LENGTH_LONG).show();
            bd.close();

            limpiar();
    }

    private void limpiar() {
        nombres.setText("");
        telefono.setText("");
        nota.setText("");
    }

    public void clickNew(View view) {
        Intent intent = new Intent(this, paisActivity.class);
        startActivity(intent);
    }

    public void guardarImagen() throws IOException {
        Uri fotos = null;
        Bitmap thumbnail = getApplicationContext().getContentResolver().loadThumbnail(fotos, new Size(640, 480), null);
    }

    public boolean validar()
    {
        boolean retorno=true;
        String nom = nombres.getText().toString();
        String num = telefono.getText().toString();
        String not = nota.getText().toString();

        if(nom.length()==0)
        {
            nombres.setError("El campo vacio");
            retorno=false;
            //Toast.makeText(this, "ingresar datos", Toast.LENGTH_SHORT).show();
        }
        if(num.length()==0)
        {
            telefono.setError("El campo vacio");
            retorno=false;
            //Toast.makeText(this, "ingresar datos", Toast.LENGTH_SHORT).show();
        }
        if(not.length()==0)
        {
            nota.setError("El campo vacio");
            retorno=false;
            //Toast.makeText(this, "ingresar datos", Toast.LENGTH_SHORT).show();
        }
        return retorno;
    }

}
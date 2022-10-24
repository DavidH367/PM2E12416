package com.example.examen1.transacciones;

public class Transacciones {
    /* tablas */
    public static final String tablapersonas = "personas";
    /* Campos */
    public static final String id = "id";
    public static final String pais = "pais";
    public static final String nombre = "nombre";
    public static final String numero = "numero";
    public static final String nota = "nota";
    /* tablas - CREATE , DROP */
    public static final String CreateTablePersonas = "CREATE TABLE " + tablapersonas+"(" + id + " INTEGER PRIMARY KEY AUTOINCREMENT, "+pais+" TEXT, "+nombre+" TEXT, "+numero+" INTEGER, "+nota+" TEXT)";
         // public static final String CreateTablePersonas1 =  "CREATE TABLE " +tablapersonas+ " ("+NOMBRE+ " TEXT, "+EDAD+" INTEGER, "+CIUDAD+" TEXT, "+CODIGOPOSTAL+" INTEGER, "+SEXO+" TEXT, "+PAIS+" TEXT)";
    public static final String DropTablePersonas = "DROP TABLE IF EXISTS personas";




    /* Creacion del nombre de la base de datos */
    public static final String NameDataBase = "DBExamen";
}

package com.example.examen1.transacciones;

public class TransaccionesPais {

    /* tablas */
    public static final String tablapais = "pais";
    /* Campos */
    public static final String id = "id";
    public static final String codigo = "codigo";
    public static final String nombre = "nombre";
    /* tablas - CREATE , DROP */
    public static final String CreateTablePais = "CREATE TABLE " + tablapais+"(" + id + " INTEGER PRIMARY KEY AUTOINCREMENT, "+codigo+" TEXT, "+nombre+" TEXT)";
    // public static final String CreateTablePersonas1 =  "CREATE TABLE " +tablapais+ " ("+NOMBRE+ " TEXT, "+EDAD+" INTEGER, "+CIUDAD+" TEXT, "+CODIGOPOSTAL+" INTEGER, "+SEXO+" TEXT, "+PAIS+" TEXT)";
    public static final String DropTablePais = "DROP TABLE IF EXISTS pais";

    /* Creacion del nombre de la base de datos */
    public static final String NameDataBase = "DBExamen";
}

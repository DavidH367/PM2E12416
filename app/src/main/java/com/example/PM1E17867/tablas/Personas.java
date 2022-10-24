package com.example.PM1E17867.tablas;

public class Personas {
    public Integer id;
    public String pais;
    public String nombre;
    public Integer numero;
    public String nota;

    public Personas(){

    }

    public Personas(Integer id, String pais, String nombre, Integer numero, String nota) {
        this.id = id;
        this.pais = pais;
        this.nombre = nombre;
        this.numero = numero;
        this.nota = nota;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}

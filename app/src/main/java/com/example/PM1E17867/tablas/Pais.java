package com.example.PM1E17867.tablas;

public class Pais {
    public Integer id1;
    public String codigoPostal;
    public String nombrePais;

    public Pais() {
    }

    public Pais(Integer id1, String codigoPostal, String nombrePais) {
        this.id1 = id1;
        this.codigoPostal = codigoPostal;
        this.nombrePais = nombrePais;
    }


    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getId() {
        return id1;
    }

    public void setId(String id1) {
        id1 = id1;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }



}

package com.hunter.controlmantenimientocampo.Entidad;

public class E_Maquinaria {

    private String maq_Id;
    private String maq_descripcion;
    private String maq_modelo;
    private String maq_serie;
    private String maq_serieMot;
    private String maq_anioFab;

    public E_Maquinaria() {
    }

    public E_Maquinaria(String maq_Id, String maq_descripcion, String maq_modelo, String maq_serie, String maq_serieMot, String maq_anioFab) {
        this.maq_Id = maq_Id;
        this.maq_descripcion = maq_descripcion;
        this.maq_modelo = maq_modelo;
        this.maq_serie = maq_serie;
        this.maq_serieMot = maq_serieMot;
        this.maq_anioFab = maq_anioFab;
    }

    public String getMaq_Id() {
        return maq_Id;
    }

    public void setMaq_Id(String maq_Id) {
        this.maq_Id = maq_Id;
    }

    public String getMaq_descripcion() {
        return maq_descripcion;
    }

    public void setMaq_descripcion(String maq_descripcion) {
        this.maq_descripcion = maq_descripcion;
    }

    public String getMaq_modelo() {
        return maq_modelo;
    }

    public void setMaq_modelo(String maq_modelo) {
        this.maq_modelo = maq_modelo;
    }

    public String getMaq_serie() {
        return maq_serie;
    }

    public void setMaq_serie(String maq_serie) {
        this.maq_serie = maq_serie;
    }

    public String getMaq_serieMot() {
        return maq_serieMot;
    }

    public void setMaq_serieMot(String maq_serieMot) {
        this.maq_serieMot = maq_serieMot;
    }

    public String getMaq_anioFab() {
        return maq_anioFab;
    }

    public void setMaq_anioFab(String maq_anioFab) {
        this.maq_anioFab = maq_anioFab;
    }

    @Override
    public String toString() {
        return getMaq_descripcion();
    }
}

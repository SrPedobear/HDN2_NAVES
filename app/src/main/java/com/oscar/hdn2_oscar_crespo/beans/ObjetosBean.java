package com.oscar.hdn2_oscar_crespo.beans;

import java.io.Serializable;

/**
 * Created by oscar on 17/03/2017.
 */

public class ObjetosBean implements Serializable{

    private int foto;
    private String nombre;
    private String descripcion;

    public ObjetosBean(int foto, String nombre, String descripcion) {
        this.foto = foto;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

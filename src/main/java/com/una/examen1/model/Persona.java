package com.una.examen1.model;

public class Persona {

    public Persona(Integer id, String nombre, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Persona() {
        id = -1;
        nombre = "";
        cantidad = 0;
    }

    public Integer getID() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    private Integer id;
    private String nombre;
    private Integer cantidad;
}

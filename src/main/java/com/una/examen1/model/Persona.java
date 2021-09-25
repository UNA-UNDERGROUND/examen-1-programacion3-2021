package com.una.examen1.model;

public class Persona {
    private int id;
    private String nombre;
    private int cantidad;

    public Persona(int id, String nombre, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return id;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the cantidad de premios
     */
    public int getCantidad() {
        return cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

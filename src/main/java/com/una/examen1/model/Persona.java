package com.una.examen1.model;

public class Persona {
    private String id;
    private String name;
    private int cantidad;

    public Persona(String id, String name, int cantidad) {
        this.id = id;
        this.name = name;
        this.cantidad = cantidad;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the cantidad de premios
     */
    public int getCantidad() {
        return cantidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

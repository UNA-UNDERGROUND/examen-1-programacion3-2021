package com.una.examen1.model;

public class Pelicula {

    public Pelicula(int id, String nombre, float duracion, Actor actor, Director director) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.actor = actor;
        this.director = director;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    private int id;
    private String nombre;
    private float duracion;
    private Actor actor;
    private Director director;

}

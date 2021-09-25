package com.una.examen1.model;

public class Pelicula {

    public Pelicula(Integer id, String nombre, Float duracion, Actor actor, Director director) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.actor = actor;
        this.director = director;
    }

    public Pelicula() {

    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getDuracion() {
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

    private Integer id;
    private String nombre;
    private Float duracion;
    private Actor actor;
    private Director director;

}
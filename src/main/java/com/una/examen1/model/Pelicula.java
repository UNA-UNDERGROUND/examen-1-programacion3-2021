package com.una.examen1.model;

public class Pelicula {

    public Pelicula(String name, float time, Actor actor, Director director) {
        this.name = name;
        this.time = time;
        this.actor = actor;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
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

    private String name;
    private float time;
    private Actor actor;
    private Director director;

}

package com.una.examen1.model;

import java.util.ArrayList;

public class Cinema {

    public Cinema() {
        directores = new ArrayList<>();
        actores = new ArrayList<>();
        peliculas = new ArrayList<>();
    }

    public ArrayList<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Director> directores) {
        this.directores = directores;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Actor> actores) {
        this.actores = actores;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    private ArrayList<Director> directores;
    private ArrayList<Actor> actores;
    private ArrayList<Pelicula> peliculas;
}

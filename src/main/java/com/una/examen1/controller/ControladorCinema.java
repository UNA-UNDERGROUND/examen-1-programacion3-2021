package com.una.examen1.controller;

import java.util.ArrayList;

import com.una.examen1.model.Actor;
import com.una.examen1.model.Director;
import com.una.examen1.model.Pelicula;

public class ControladorCinema {

    private ControladorCinema() {
        directores = new ArrayList<>();
        actores = new ArrayList<>();
        peliculas = new ArrayList<>();
    }

    // Actor

    public Actor recuperarActor(int id) {
        for (Actor actor : actores) {
            if (actor.getID() == id) {
                return actor;
            }
        }
        return null;
    }

    public boolean agregarActor(Actor actor) {
        if (recuperarDirector(actor.getID()) != null) {
            return false;
        }
        actores.add(actor);
        return true;
    }

    public boolean actualizarActor(Actor actor) {
        Actor actual = recuperarActor(actor.getID());
        if (actual == null) {
            return false;
        }
        actual.setNombre(actor.getNombre());
        actual.setCantidad(actor.getCantidad());
        return true;
    }

    public ArrayList<Actor> buscarActores(Integer id) {
        ArrayList<Actor> resultado = new ArrayList<>();
        for (Actor actual : actores) {
            if (Integer.valueOf(actual.getID()).toString().startsWith(id.toString())) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    // Director

    public Director recuperarDirector(int id) {
        for (Director director : directores) {
            if (director.getID() == id) {
                return director;
            }
        }
        return null;
    }

    public boolean agregarDirector(Director director) {
        if (recuperarDirector(director.getID()) != null) {
            return false;
        }
        directores.add(director);
        return true;
    }

    public boolean actualizarDirector(Director director) {
        Director actual = recuperarDirector(director.getID());
        if (actual == null) {
            return false;
        }
        actual.setNombre(director.getNombre());
        actual.setCantidad(director.getCantidad());
        return true;
    }

    public ArrayList<Director> buscarDirectores(Integer id) {
        ArrayList<Director> resultado = new ArrayList<>();
        for (Director actual : directores) {
            if (Integer.valueOf(actual.getID()).toString().startsWith(id.toString())) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    // Pelicula

    public Pelicula recuperarPelicula(int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getID() == id) {
                return pelicula;
            }
        }
        return null;
    }

    public boolean agregarPelicula(Pelicula pelicula) {
        if (recuperarPelicula(pelicula.getID()) != null) {
            return false;
        }
        peliculas.add(pelicula);
        return true;
    }

    public boolean actualizarPelicula(Pelicula pelicula) {
        Pelicula actual = recuperarPelicula(pelicula.getID());
        if (actual == null) {
            return false;
        }
        actual.setNombre(pelicula.getNombre());
        actual.setDuracion(pelicula.getDuracion());
        actual.setDirector(pelicula.getDirector());
        actual.setActor(pelicula.getActor());
        return true;
    }

    public ArrayList<Pelicula> buscarPeliculas(Integer id) {
        ArrayList<Pelicula> resultado = new ArrayList<>();
        for (Pelicula actual : peliculas) {
            if (Integer.valueOf(actual.getID()).toString().startsWith(id.toString())) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    private ArrayList<Director> directores;
    private ArrayList<Actor> actores;
    private ArrayList<Pelicula> peliculas;

    private static ControladorCinema instancia = null;

    public static ControladorCinema getInstancia() {
        if (instancia == null) {
            instancia = new ControladorCinema();
        }
        return instancia;
    }
}

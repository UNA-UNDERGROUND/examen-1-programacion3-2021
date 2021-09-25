package com.una.examen1.controller;

import java.util.ArrayList;
import java.util.List;

import com.una.examen1.controller.xml.JAXBParser;
import com.una.examen1.model.Actor;
import com.una.examen1.model.Cinema;
import com.una.examen1.model.Director;
import com.una.examen1.model.Pelicula;

public class ControladorCinema {

    private ControladorCinema() {
        cargar();
    }

    // Actor

    public Actor recuperarActor(int id) {
        for (Actor actor : cinema.getActores()) {
            if (actor.getID() == id) {
                return actor;
            }
        }
        return null;
    }

    public boolean agregarActor(Actor actor) {
        if (recuperarActor(actor.getID()) != null) {
            return false;
        }
        cinema.getActores().add(actor);
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

    public List<Actor> buscarActores(Integer id) {
        List<Actor> resultado = new ArrayList<>();
        for (Actor actual : cinema.getActores()) {
            if (Integer.valueOf(actual.getID()).toString().startsWith(id.toString())) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    public List<Actor> recuperarActores() {
        return cinema.getActores();
    }

    // Director

    public Director recuperarDirector(int id) {
        for (Director director : cinema.getDirectores()) {
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
        cinema.getDirectores().add(director);
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

    public List<Director> buscarDirectores(Integer id) {
        List<Director> resultado = new ArrayList<>();
        for (Director actual : cinema.getDirectores()) {
            if (Integer.valueOf(actual.getID()).toString().startsWith(id.toString())) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    public List<Director> recuperarDirectores() {
        return cinema.getDirectores();
    }

    // Pelicula

    public Pelicula recuperarPelicula(int id) {
        for (Pelicula pelicula : cinema.getPeliculas()) {
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
        cinema.getPeliculas().add(pelicula);
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

    public List<Pelicula> buscarPeliculas(Integer id) {
        List<Pelicula> resultado = new ArrayList<>();
        for (Pelicula actual : cinema.getPeliculas()) {
            if (Integer.valueOf(actual.getID()).toString().startsWith(id.toString())) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    public List<Pelicula> recuperarPeliculas() {
        return cinema.getPeliculas();
    }

    public void guardar() {
        JAXBParser.marshall(cinema, "cinema.xml");
    }

    public void cargar() {
        cinema = (Cinema) JAXBParser.unmarshall(new Cinema(), "cinema.xml");
    }

    private Cinema cinema;

    private static ControladorCinema instancia = null;

    public static ControladorCinema getInstancia() {
        if (instancia == null) {
            instancia = new ControladorCinema();
        }
        return instancia;
    }
}

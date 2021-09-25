package com.una.examen1.controller;

import java.util.ArrayList;

import com.una.examen1.model.Actor;
import com.una.examen1.model.Director;
import com.una.examen1.model.Pelicula;

public class ControladorCinema {

    private ControladorCinema(){

    }



    private ArrayList<Director> directores;
    private ArrayList<Actor> actores;
    private ArrayList<Pelicula> peliculas;

    private static ControladorCinema instancia = null;

    public static ControladorCinema getInstancia(){
        if(instancia == null){
            instancia = new ControladorCinema();
        }
        return instancia;
    }
}

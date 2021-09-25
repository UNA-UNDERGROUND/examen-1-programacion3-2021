/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.examen1.model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CinemaTest {
    private JAXBContext context;

    @BeforeEach
    public void init() throws JAXBException {
        this.context = JAXBContext.newInstance(Cinema.class);
    }

    @Test
    public void serializacion() throws JAXBException{
        Marshaller marshaller = this.context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        Cinema c = new Cinema();
        Actor actor = new Actor(1, "Najwa Nimri", 102);
        Director director = new Director(2, "Carlos Vermut", 1);
        c.getActores().add(actor);
        c.getDirectores().add(director);
        c.getPeliculas().add(new Pelicula(3, "Quien te cantará", (float) 2.0, actor, director));
        marshaller.marshal(c, new File("cinema-test.xml"));
    }
}

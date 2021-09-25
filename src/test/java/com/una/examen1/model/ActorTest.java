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

public class ActorTest {
    private JAXBContext context;

    @BeforeEach
    public void init() throws JAXBException {
        this.context = JAXBContext.newInstance(Actor.class);
    }

    @Test
    public void serializacion() throws JAXBException {
        Marshaller marshaller = this.context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(new Actor(1, "Najwa Nimri", 100), new File("actor-test.xml"));
    }
}

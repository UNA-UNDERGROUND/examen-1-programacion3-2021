package com.una.examen1.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Actor extends Persona {
    public Actor(Integer id, String nombre, Integer cantidad) {
        super(id, nombre, cantidad);
    }

    public Actor() {

    }
}
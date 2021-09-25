package com.una.examen1.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Director extends Persona {
    public Director(Integer id, String nombre, int cantidad) {
        super(id, nombre, cantidad);
    }

    public Director() {

    }
}
package com.una.examen1.view;

import com.una.examen1.model.Persona;

public class ItemPersona {

    ItemPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return persona.getNombre();
    }

    private Persona persona;
}

package com.una.examen1.view.tablemodel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

import com.una.examen1.model.Persona;

public class PersonaTableModel extends AbstractTableModel {

    public PersonaTableModel() {
        this(new ArrayList<Persona>());
    }

    public PersonaTableModel(List<? extends Persona> personas) {
        this.personas = personas;
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        suscriptores.add(l);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return COLUMNAS[columnIndex];
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = personas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getID();
            case 1:
                return p.getNombre();
            case 2:
                return p.getCantidad();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        suscriptores.remove(l);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // ningun campo se puede editar
    }

    private List<? extends Persona> personas;
    private LinkedList<TableModelListener> suscriptores = new LinkedList<>();
    private final static String[] COLUMNAS = { "Id", "Nombre", "Premios" };
}
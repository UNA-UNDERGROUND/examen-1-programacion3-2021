package com.una.examen1.view.tablemodel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

import com.una.examen1.model.Pelicula;

public class PeliculaTableModel extends AbstractTableModel {

    public PeliculaTableModel() {
        this(new ArrayList<Pelicula>());
    }

    public PeliculaTableModel(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        suscriptores.add(l);
    }

    @Override
    public Class<?> getColumnClass(int columIndex) {
        return Integer.class;
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
        return peliculas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pelicula p = peliculas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return String.format("%-2d", p.getID());
            case 1:
                return String.format("%s", p.getNombre());
            case 2:
                return String.format("%.1f", p.getDuracion());
            case 3:
                return String.format("%s", p.getDirector().getNombre());
            case 4:
                return String.format("%s", p.getActor().getNombre());
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

    private List<Pelicula> peliculas;
    private LinkedList<TableModelListener> suscriptores = new LinkedList<>();
    private final static String[] COLUMNAS = { "Id", "Nombre", "Duracion", "Director", "Actor Principal" };
}
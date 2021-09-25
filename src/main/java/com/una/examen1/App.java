package com.una.examen1;

import com.una.examen1.view.MenuPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {

    static void mostrarUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.err.println(ex.getLocalizedMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });
    }

    public static void main(String[] args) {
        mostrarUI();
    }

}

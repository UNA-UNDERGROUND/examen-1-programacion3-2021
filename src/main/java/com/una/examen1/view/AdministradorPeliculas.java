/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.examen1.view;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.una.examen1.controller.ControladorCinema;
import com.una.examen1.model.Actor;
import com.una.examen1.model.Director;
import com.una.examen1.model.Pelicula;
import com.una.examen1.view.tablemodel.PeliculaTableModel;

public class AdministradorPeliculas extends javax.swing.JFrame {

    private MenuPrincipal padre;

    /**
     * Creates new form AdministradorPeliculas
     */
    public AdministradorPeliculas(MenuPrincipal padre) {
        initComponents();
        getContentPane().setBackground(java.awt.Color.decode("#FFFFCC"));
        init();
        this.padre = padre;

    }

    private void init() {

        List<Actor> actores = ControladorCinema.getInstancia().recuperarActores();
        List<Director> directores = ControladorCinema.getInstancia().recuperarDirectores();

        for (Actor actor : actores) {
            cmbActor.addItem(new ItemPersona(actor));
        }
        for (Director director : directores) {
            cmbDirector.addItem(new ItemPersona(director));
        }

        tablePeliculas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                txtID.setText(tablePeliculas.getValueAt(tablePeliculas.getSelectedRow(), 0).toString());
                buscarPelicula();
            }
        });
        actualizarLista();
    }

    private void buscarPelicula() {
        try {
            Integer id = Integer.parseInt(txtID.getText());
            Pelicula p = ControladorCinema.getInstancia().recuperarPelicula(id);

            if (p != null) {
                txtID.setText(Integer.valueOf(p.getID()).toString());
                txtNombre.setText(p.getNombre());
                cmbDuracion.setSelectedItem(p.getDuracion());
                cmbDirector.setSelectedItem(p.getDirector());
                cmbActor.setSelectedItem(p.getActor());
            } else {
                JOptionPane.showMessageDialog(this, "Pelicula no encontrada", "no se encontro la pelicula",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error de formato", "el ID debe ser un numero entero",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarLista() {
        PeliculaTableModel modelo;
        modelo = new PeliculaTableModel(ControladorCinema.getInstancia().recuperarPeliculas());
        tablePeliculas.setModel(modelo);
    }

    private Pelicula generarPelicula() {
        try {
            Integer id = Integer.parseInt(txtID.getText());
            String nombre = txtNombre.getText();
            Float duracion = Float.parseFloat(cmbDuracion.getSelectedItem().toString());
            Actor actor = (Actor) ((ItemPersona) cmbActor.getSelectedItem()).getPersona();
            Director director = (Director) ((ItemPersona) cmbDirector.getSelectedItem()).getPersona();
            return new Pelicula(id, nombre, duracion, actor, director);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbDirector = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cmbActor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePeliculas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        cmbDuracion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(" Nombre: ");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jLabel1.setText("ID:");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Duracion :");

        jLabel5.setText("Actor:");

        jLabel6.setText("Director: ");

        tablePeliculas.setModel(new PeliculaTableModel());
        jScrollPane1.setViewportView(tablePeliculas);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        cmbDuracion.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup().addGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                                        .createSequentialGroup().addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3).addComponent(jLabel1).addComponent(jLabel6)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbActor, javax.swing.GroupLayout.Alignment.LEADING, 0, 127,
                                                Short.MAX_VALUE)
                                        .addComponent(cmbDirector, javax.swing.GroupLayout.Alignment.LEADING, 0,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbDuracion, javax.swing.GroupLayout.Alignment.LEADING, 0,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtID))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                        .createSequentialGroup().addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnRegresar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                        .createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1).addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3).addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbDuracion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbDirector, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbActor, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAgregar).addComponent(btnBuscar).addComponent(btnListar)
                                        .addComponent(btnActualizar).addComponent(btnRegresar))
                                .addGap(34, 34, 34)))
                .addComponent(jLabel2)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAgregarActionPerformed

        Pelicula p = generarPelicula();
        if (p != null) {
            ControladorCinema.getInstancia().agregarPelicula(p);
            actualizarLista();
        } else {
            JOptionPane.showMessageDialog(this, "Error de formato", "El id debe de ser numeros enteros",
                    JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_btnAgregarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnListarActionPerformed
        try {
            PeliculaTableModel modelo;
            Integer id = Integer.parseInt(txtID.getText());
            modelo = new PeliculaTableModel(ControladorCinema.getInstancia().buscarPeliculas(id));
            tablePeliculas.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de formato", "el ID debe ser un numero entero",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_btnListarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnActualizarActionPerformed
        Pelicula p = generarPelicula();
        if (p != null && ControladorCinema.getInstancia().actualizarPelicula(p)) {
            actualizarLista();
        } else {
            JOptionPane.showMessageDialog(this, "Error de formato", "El id y los premios deben de ser numeros enteros",
                    JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBuscarActionPerformed
        buscarPelicula();
    }// GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRegresarActionPerformed
        padre.setVisible(true);
        dispose();
    }// GEN-LAST:event_btnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<ItemPersona> cmbActor;
    private javax.swing.JComboBox<ItemPersona> cmbDirector;
    private javax.swing.JComboBox<String> cmbDuracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePeliculas;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

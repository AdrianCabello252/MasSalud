
package vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import mutualgrupo36.Entidades.Prestador;
import Datos.PrestadorData;
import Datos.EspecialidadData;
import java.awt.Dimension;
import mutualgrupo36.Entidades.Especialidad;
import java.util.List;
import javax.swing.JOptionPane;

public class PrestadorMedVista extends javax.swing.JInternalFrame {
    EspecialidadData espeData= new EspecialidadData();
    PrestadorData pData=new PrestadorData();
    DefaultTableModel P;
    DefaultComboBoxModel<Especialidad> model;
    
    public PrestadorMedVista() {
        initComponents();
        setTitle("MasSalud SRL");
        P = new DefaultTableModel(); 
        jTable1.setModel(P);
        armarCabecera();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prestador Medico");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        int filaSeleccionada = jTable1.getSelectedRow();
//        if (filaSeleccionada != -1) {
//            Prestador prestadorSelec = (Prestador) jComboBox1.getSelectedItem();
//        if (prestadorSelec != null) {
//            int idPrestador = (int) jTable1.getValueAt(filaSeleccionada, 0); 
//            pData.eliminarPrestador(idPrestador);
//        } else {
//            JOptionPane.showMessageDialog(null, "Selecciona un prestador válido de la lista");
//        }
//        } else {
//        JOptionPane.showMessageDialog(null, "Selecciona una fila en la tabla de materias.");
//        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        jDesktopPane1.removeAll();
//        jDesktopPane1.repaint();
        PlanillaPrestadorN pp=new PlanillaPrestadorN();
//        Dimension desktopSize = jDesktopPane1.getSize();
//        Dimension frameSize = pp.getSize();
//
//        int x = (desktopSize.width - frameSize.width) / 2;
//        int y = (desktopSize.height - frameSize.height) / 2;
//        pp.setLocation(x, y);
//        pp.setVisible(true);
//        jDesktopPane1.add(pp);
        Principal.jDesktopPane1.add(pp);
        pp.toFront();
        pp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PlanillaPrestadorM ppm=new PlanillaPrestadorM();
        Principal.jDesktopPane1.add(ppm);
        ppm.toFront();
        ppm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JComboBox<Especialidad> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
    private void cargarCombo(){
        
        model = new DefaultComboBoxModel<>();
        jComboBox1.setModel(model);

        EspecialidadData espeData = new EspecialidadData();
        List<Especialidad> listaEspecialidades = espeData.listarEspecialidad();

        for (Especialidad especialidad : listaEspecialidades) {
            model.addElement(especialidad);
        }
        
//        EspecialidadData espeData = new EspecialidadData();
//        List<Especialidad> listaEspecialidades = espeData.listarEspecialidad();
////        DefaultComboBoxModel<Especialidad> model = new DefaultComboBoxModel<>(listaEspecialidades.toArray(new Especialidad[0]));
////        jComboBox1.setModel(model);
//        model = new DefaultComboBoxModel<>(listaEspecialidades.toArray(new Especialidad[0]));
//        jComboBox1.setModel(model);
    }

    private void armarCabecera(){
        P.addColumn("ID ");
        P.addColumn("Nombre");
        P.addColumn("Domicilio");
        P.addColumn("Telefono");
        jTable1.setModel(P);
        P.setRowCount(0);
    }
    
    private void cargarDatos(){
        PrestadorData prestadorData = new PrestadorData();
        Especialidad especialidadSeleccionada = (Especialidad) jComboBox1.getSelectedItem();
        List<Prestador> prestadoresPorEspecialidad = prestadorData.buscarPrestadorPorEspecialidad(especialidadSeleccionada.getIdEspecialidad());
        P.setRowCount(0);

            for (Prestador prestador : prestadoresPorEspecialidad) {
                P.addRow(new Object[]{prestador.getIdPrestador(), prestador.getNombre(),prestador.getDomicilio(),prestador.getTelefono()});
            }
    }
    
}


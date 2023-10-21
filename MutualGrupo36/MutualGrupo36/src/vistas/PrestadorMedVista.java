
package Vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import mutualgrupo36.Entidades.Prestador;
import Datos.PrestadorData;
import Datos.EspecialidadData;
import mutualgrupo36.Entidades.Especialidad;
import java.util.List;

public class PrestadorMedVista extends javax.swing.JInternalFrame {
    EspecialidadData espeData= new EspecialidadData();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prestador Medico");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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


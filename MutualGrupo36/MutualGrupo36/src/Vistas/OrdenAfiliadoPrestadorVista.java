
package Vistas;
/**
 *
 * @author pinch
 */

import Datos.AfiliadoData;
import Datos.OrdenData;
import Datos.PrestadorData;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mutualgrupo36.Entidades.Afiliado;
import mutualgrupo36.Entidades.Orden;
import mutualgrupo36.Entidades.Prestador;


public class OrdenAfiliadoPrestadorVista extends javax.swing.JInternalFrame {
    
    OrdenData orData = new OrdenData();
    AfiliadoData afiData = new AfiliadoData();
    PrestadorData presData = new PrestadorData();
    
    DefaultTableModel m = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0;
    }
};

  
    public OrdenAfiliadoPrestadorVista() {
        initComponents();
        jtOrdenes.setModel(m); 
        armarCabecera();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfIDAfiliado = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrdenes = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfIDPrestador = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Ordenes Por Afiliado y/o Prestador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("ID Afiliado");

        jbBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 102));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtOrdenes);

        jbModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 102));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 0, 102));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("ID Prestador");

        jbLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 102));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jtfIDAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfIDPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbModificar)
                .addGap(33, 33, 33)
                .addComponent(jbEliminar)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jbSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtfIDAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbBuscar)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIDPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbEliminar)
                    .addComponent(jbLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String idAfiliadoText = jtfIDAfiliado.getText();
        String idPrestadorText = jtfIDPrestador.getText();
        int idAfiliado = 0;
        int idPrestador = 0;
    try {
        if (!idAfiliadoText.isEmpty()) {
            idAfiliado = Integer.parseInt(idAfiliadoText);
        }

        if (!idPrestadorText.isEmpty()) {
            idPrestador = Integer.parseInt(idPrestadorText);
        }

        if (idAfiliado != 0 || idPrestador != 0) {
            cargarDatos(idAfiliado, idPrestador);
        } else {
            JOptionPane.showMessageDialog(null, "Debes proporcionar al menos un valor válido.");
        }
    } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Has ingresado un carácter incorrecto. Debes ingresar números enteros válidos.");   
    }    
    }//GEN-LAST:event_jbBuscarActionPerformed

    
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int filaSeleccionada = jtOrdenes.getSelectedRow();
        if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona una orden para modificar.");
        return;
        }

    try {       
        Object ObjidOrden = jtOrdenes.getValueAt(filaSeleccionada, 0);
        Object ObjidAfiliado = jtOrdenes.getValueAt(filaSeleccionada, 1); 
        Object ObjidPrestador = jtOrdenes.getValueAt(filaSeleccionada, 2); 
        Object Objfecha = jtOrdenes.getValueAt(filaSeleccionada, 3); 
        Object ObjformaDePago = jtOrdenes.getValueAt(filaSeleccionada, 4); 
        Object Objimporte = jtOrdenes.getValueAt(filaSeleccionada, 5);

        int idOrden = Integer.parseInt(ObjidOrden.toString());
        int idAfiliado = Integer.parseInt(ObjidAfiliado.toString());
        int idPrestador = Integer.parseInt(ObjidPrestador.toString());
        LocalDate fecha = (LocalDate) Objfecha;
        String formaDePago = (String) ObjformaDePago;
        double importe = (double) Objimporte;

        Afiliado afiliado = afiData.buscarAfiliado(idAfiliado);
        Prestador prestador = presData.buscarPrestador(idPrestador);
        Orden orden = new Orden();
        orden.setIdOrden(idOrden);
        orden.setAfiliado(afiliado);
        orden.setPrestador(prestador);
        orden.setFecha(fecha);
        orden.setFormaDePago(formaDePago);
        orden.setImporte(importe);
        
        orData.modificarOrden(orden);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Has ingresado un carácter incorrecto en alguna de las celdas");
    }     
    }//GEN-LAST:event_jbModificarActionPerformed

    
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int filaSeleccionada = jtOrdenes.getSelectedRow();
        if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona una orden para eliminar.");
        return;
        }
        Object ObjidOrden = jtOrdenes.getValueAt(filaSeleccionada, 0);
        int idOrden = Integer.parseInt(ObjidOrden.toString());
        orData.eliminarOrden(idOrden);
        m.removeRow(filaSeleccionada);
    }//GEN-LAST:event_jbEliminarActionPerformed

    
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfIDAfiliado.setText("");
        jtfIDPrestador.setText("");
        DefaultTableModel model = (DefaultTableModel) jtOrdenes.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Principal principal = new Principal();
        principal.repaint();
        this.dispose();
        principal.setEnabled(true);
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable jtOrdenes;
    private javax.swing.JTextField jtfIDAfiliado;
    private javax.swing.JTextField jtfIDPrestador;
    // End of variables declaration//GEN-END:variables

 private void armarCabecera(){
        m.addColumn("ID Orden");
        m.addColumn("Afiliado #");
        m.addColumn("Prestador #");
        m.addColumn("Fecha");
        m.addColumn("formaDePago");
        m.addColumn("importe");
        jtOrdenes.setModel(m);
        m.setRowCount(0);
    }  
    
    
    private void cargarDatos(int idAfiliado, int idPrestador) {
        OrdenData orData = new OrdenData();
        List<Orden> ordenesAfiliadoPrestador = orData.listarOrdenesAfiliadoPrestador(idAfiliado, idPrestador);
        m.setRowCount(0);
        
        if (ordenesAfiliadoPrestador.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontraron órdenes para el afiliado o prestador seleccionado.");
        return; 
        }

        for (Orden orden : ordenesAfiliadoPrestador) {
            Afiliado afiliado = orden.getAfiliado();
            Prestador prestador = orden.getPrestador();

            m.addRow(new Object[]{orden.getIdOrden(), orden.getAfiliado().getIdAfiliado(), orden.getPrestador().getIdPrestador(), orden.getFecha(), orden.getFormaDePago(), orden.getImporte()});
        }
    }


}

package vistas;

import Datos.AfiliadoData;
import Datos.OrdenData;
import Datos.PrestadorData;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mutualgrupo36.Entidades.Afiliado;
import mutualgrupo36.Entidades.Orden;
import mutualgrupo36.Entidades.Prestador;

/**
 *
 * @author pinch
 */
public class OrdenFechaVista extends javax.swing.JInternalFrame {

    OrdenData orData = new OrdenData();
    AfiliadoData afiData = new AfiliadoData();
    PrestadorData presData = new PrestadorData();
    
    DefaultTableModel m = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0;
    }
};
    
    public OrdenFechaVista() {
        initComponents();
        jtOrdenes.setModel(m); 
        armarCabecera();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrdenes = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Consultar ordenes Por Fecha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Fecha");

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

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 0, 102));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 102));
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 51));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 102));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbModificar)
                .addGap(39, 39, 39)
                .addComponent(jbEliminar)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbModificar)
                    .addComponent(jbLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       LocalDate fecha = jdFecha.getDate() != null ? jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate() : null;

        if (fecha != null) {
            cargarDatos(fecha);
        } else {
            JOptionPane.showMessageDialog(null, "La fecha que ingresaste no es valida");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int filaSeleccionada = jtOrdenes.getSelectedRow();
        if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona una orden para modificar.");
        return;
        }

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
        
        DefaultTableModel model = (DefaultTableModel) jtOrdenes.getModel();
        model.removeRow(filaSeleccionada);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jdFecha.setCalendar(null);
        DefaultTableModel model = (DefaultTableModel) jtOrdenes.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTable jtOrdenes;
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
    
    
    private void cargarDatos(LocalDate fecha) {
        OrdenData orData = new OrdenData();
        List<Orden> ordenesFecha = orData.listarOrdenesXFecha(fecha);
        m.setRowCount(0);

        for (Orden orden : ordenesFecha) {
            Afiliado afiliado = orden.getAfiliado();
            Prestador prestador = orden.getPrestador();

            m.addRow(new Object[]{orden.getIdOrden(), orden.getAfiliado().getIdAfiliado(), orden.getPrestador().getIdPrestador(), orden.getFecha(), orden.getFormaDePago(), orden.getImporte()});
        }
    }


}


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
public class OrdenVista extends javax.swing.JInternalFrame {

    OrdenData orData = new OrdenData();
//    DefaultTableModel m;
    AfiliadoData afiData = new AfiliadoData();
    PrestadorData presData = new PrestadorData();
    
    DefaultTableModel m = new DefaultTableModel() {
    @Override
    public boolean isCellEditable(int row, int column) {
        return column != 0;
    }
};
    
    public OrdenVista() {
        initComponents();
//        m = new DefaultTableModel(); 
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
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

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

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 0, 51));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 0, 51));
        jbEliminar.setText("Eliminar");

        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 51));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbGuardar)
                .addGap(46, 46, 46)
                .addComponent(jbModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbEliminar)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBuscar)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jbBuscar))
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbModificar))
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

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

//    int filaSeleccionada = jtOrdenes.getSelectedRow();
//    if (filaSeleccionada == -1) {
//        JOptionPane.showMessageDialog(null, "Selecciona una fila para crear una nueva orden.");
//        return;
//    }
//    
//    Object ObjidAfiliado = jtOrdenes.getValueAt(filaSeleccionada, 1); 
//    Object ObjidPrestador = jtOrdenes.getValueAt(filaSeleccionada, 2); 
//    Object Objfecha = jtOrdenes.getValueAt(filaSeleccionada, 3); 
//    Object ObjformaDePago = jtOrdenes.getValueAt(filaSeleccionada, 4); 
//    Object Objimporte = jtOrdenes.getValueAt(filaSeleccionada, 5);
//    
//    int idAfiliado = Integer.parseInt(ObjidAfiliado.toString());
//    int idPrestador = Integer.parseInt(ObjidPrestador.toString());
//    LocalDate fecha = (LocalDate) Objfecha;
//    String formaDePago = (String) ObjformaDePago;
//    double importe = (double) Objimporte;
//    
//    Afiliado afiliado = afiData.buscarAfiliado(idAfiliado);
//    Prestador prestador = presData.buscarPrestador(idPrestador);
//    Orden orden = new Orden();
//    orden.setAfiliado(afiliado);
//    orden.setPrestador(prestador);
//    orden.setFecha(fecha);
//    orden.setFormaDePago(formaDePago);
//    orden.setImporte(importe);
//    
//    orData.guardarOrden(orden);
        
    }//GEN-LAST:event_jbGuardarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
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

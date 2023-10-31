
package Vistas;

import javax.swing.table.DefaultTableModel;
import Datos.AfiliadoData;
import Datos.OrdenData;
import javax.swing.JOptionPane;
import java.util.List;
import mutualgrupo36.Entidades.Afiliado;

/**
 *
 * @author Martin
 */
public class AfiliadoVista extends javax.swing.JInternalFrame {
    //    DefaultTableModel modelo;
    OrdenData orData = new OrdenData();
    AfiliadoData afiData = new AfiliadoData();
    
    public List<Afiliado> listaA;
    
    DefaultTableModel modelo = new DefaultTableModel ();
    
    public boolean isCellEditable(int row, int column) {
        return column != 0;
    }
    
    public AfiliadoVista() {
        initComponents();
        listaA=afiData.listarAfiliados();
        jTabla.setModel(modelo);
        armarCabecera();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlAfiliado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        jlDomicilio = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtDNI = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jlTituloBuscar = new javax.swing.JLabel();
        jlBuscarDNI = new javax.swing.JLabel();
        jtBuscarDNI = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JCheckBox();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        lbLimpiar = new javax.swing.JButton();

        jlAfiliado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlAfiliado.setText("Afiliado");

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Domicilio", "Teléfono", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTabla);

        jlNombre.setText("Nombre");

        jlApellido.setText("Apellido");

        jlDNI.setText("DNI");

        jlDomicilio.setText("Domicilio");

        jlTelefono.setText("Teléfono");

        jlEstado.setText("Estado");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jlTituloBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlTituloBuscar.setText("Buscar por DNI");

        jlBuscarDNI.setText("Dni");

        jtBuscarDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarDNIKeyReleased(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        lbLimpiar.setText("Limpiar");
        lbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbLimpiarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlApellido)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlDNI, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlEstado, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtDNI, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jcbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbLimpiar)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbGuardar)
                                .addGap(13, 13, 13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jlAfiliado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jlTituloBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jtBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jbBuscar)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jbSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlAfiliado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNI)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDomicilio)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlEstado)
                        .addComponent(jbGuardar)
                        .addComponent(jcbEstado))
                    .addComponent(lbLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlTituloBuscar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuscarDNI)
                    .addComponent(jtBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbEliminar))
                .addGap(19, 19, 19)
                .addComponent(jbSalir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

    try {   
    String nombre = jtNombre.getText();
    String apellido = jtApellido.getText();
    String dniText = jtDNI.getText();
    String domicilio = jtDomicilio.getText();
    String telefonoText = jtTelefono.getText();
    boolean estado = jcbEstado.isSelected();

    if (nombre.isEmpty() || apellido.isEmpty() || dniText.isEmpty()|| domicilio.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No debe haber campos vacíos");
        return;
    }

        int telefono = Integer.parseInt(jtTelefono.getText());
        int dni = Integer.parseInt(jtDNI.getText());
        Afiliado afiliado = new Afiliado(nombre, apellido, dni, domicilio, telefono, estado);
        afiData.guardarAfiliado(afiliado);
        cargarAfiliado(afiliado);
        listaA=afiData.listarAfiliados();
        cargarTabla();

        jtNombre.setText("");
        jtApellido.setText("");
        jtDNI.setText("");
        jtDomicilio.setText("");
        jtTelefono.setText("");
        jcbEstado.setSelected(false);
        
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "En el campo DNI o Teléfono debe ingresar números enteros");
        }

    }//GEN-LAST:event_jbGuardarActionPerformed
    
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
     
//        int filaS = jTabla.getSelectedRow();
//        if (filaS!=-1){
//        modelo.removeRow(filaS);
//       }else {
//            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para eliminar");
//        }
    int filaSeleccionada = jTabla.getSelectedRow();
    if (filaSeleccionada != -1) {
        Object objIdAfiliado = modelo.getValueAt(filaSeleccionada, 0);
        int idAfiliado = Integer.parseInt(objIdAfiliado.toString());
        afiData.borrarAfiliado(idAfiliado);
        modelo.removeRow(filaSeleccionada);
    } else {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para eliminar");
    }


    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        int filaS = jTabla.getSelectedRow();
        if (filaS == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila para poder editar");
        return;
        }
        
        Object ObNombre = jTabla.getValueAt(filaS, 0);
        Object ObApellido = jTabla.getValueAt(filaS, 1); 
        Object ObDNI = jTabla.getValueAt(filaS, 2); 
        Object ObDomicilio = jTabla.getValueAt(filaS, 3); 
        Object ObTelefono = jTabla.getValueAt(filaS, 4); 
        Object ObEstado = jTabla.getValueAt(filaS, 5);
        
        String nombreAfiliado = ObNombre.toString();
        String apellidoAfiliado = ObApellido.toString();
        int dniAfiliado = Integer.parseInt(ObDNI.toString());
        String domicilioAfiliado = ObDomicilio.toString();
        int telefonoAfiliado = Integer.parseInt(ObTelefono.toString());
//        boolean estadoAfiliado = ObEstado.toString();
//        Afiliado afiliado = afiData.buscarAfiliado(nombreAfiliado);
                
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jtBuscarDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarDNIKeyReleased

    }//GEN-LAST:event_jtBuscarDNIKeyReleased

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        Principal principal = new Principal();
        principal.repaint();
        this.dispose();
        principal.setEnabled(true);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        String dniText = jtBuscarDNI.getText();
        int dni = 0;
        try {    
        if (!dniText.isEmpty()) {
            dni = Integer.parseInt(dniText);
        }else {
            JOptionPane.showMessageDialog(null, "Debes proporcionar un valor válido.");
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Has ingresado un carácter incorrecto.");   
        }
        afiData.buscarAfiliadoPorDNI(dni);
        Afiliado afiliadoEncontrado = afiData.buscarAfiliadoPorDNI(dni);
        
        if (afiliadoEncontrado != null) {
 
        DefaultTableModel modeloTabla = (DefaultTableModel) jTabla.getModel();
       
        modeloTabla.addRow(new Object[]{
        afiliadoEncontrado.getIdAfiliado(),
        afiliadoEncontrado.getNombre(),
        afiliadoEncontrado.getApellido(),
        afiliadoEncontrado.getDni(),
        afiliadoEncontrado.getDomicilio(),
        afiliadoEncontrado.getTelefono()
    });
        
        jTabla.setModel(modeloTabla);
    } else {
        JOptionPane.showMessageDialog(null, "Afiliado no encontrado.");
    }
       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void lbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbLimpiarActionPerformed

        jtBuscarDNI.setText("");
        DefaultTableModel model = (DefaultTableModel) jTabla.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_lbLimpiarActionPerformed
       

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JLabel jlAfiliado;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlBuscarDNI;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlTituloBuscar;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtBuscarDNI;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JButton lbLimpiar;
    // End of variables declaration//GEN-END:variables

private void armarCabecera (){
    
    modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("DNI");
    modelo.addColumn("Domicilio");
    modelo.addColumn("Teléfono");
    modelo.addColumn("Estado");
    jTabla.setModel(modelo);
    modelo.setRowCount(0);
}

private void cargarAfiliado(Afiliado afiliado){
    
    modelo.addRow(new Object[]{afiliado.getIdAfiliado(), afiliado.getNombre(), afiliado.getApellido(), afiliado.getDni(),afiliado.getDomicilio(), afiliado.getTelefono(), afiliado.getActivo()}); //falta estado
    
}

public void cargarTabla(){
    modelo.setRowCount(0);
    for(Afiliado afiliado: listaA){
        modelo.addRow(new Object[]{afiliado.getIdAfiliado(), afiliado.getNombre(), afiliado.getApellido(), afiliado.getDni(),afiliado.getDomicilio(), afiliado.getTelefono(), afiliado.getActivo()});
    }
}

}



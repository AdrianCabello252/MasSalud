
package Datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mutualgrupo36.Entidades.Orden;


public class OrdenData {
    
    private Connection con=null;
    private AfiliadoData afiData;
    private PrestadorData presData;
    
    public OrdenData() {
    con=Conexion.getConexion();
    }
    
    
    public void guardarOrden(Orden orden){
        String sql= "INSERT INTO orden (idAfiliado, idPrestador, fecha, formaDePago, importe) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, orden.getAfiliado().getIdAfiliado());
            ps.setInt(2, orden.getPrestador().getIdPrestador());
            ps.setDate(3,Date.valueOf(orden.getFecha()));
            ps.setString(4,orden.getFormaDePago());
            ps.setDouble(5, orden.getImporte());
            ps.executeUpdate();

            ResultSet rs=ps.getGeneratedKeys();

           if (rs.next()) {
                orden.setIdOrden(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Orden guardada con éxito.");
           } else {
                JOptionPane.showMessageDialog(null, "Error al guardar la orden");
           }
           rs.close();
           ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Orden: " + ex.getMessage());
        }
    }
    
    
    public void modificarOrden(Orden orden){
        
        String sql="UPDATE orden SET idAfiliado=?, idPrestador=?, fecha=?, formaDePago=?, importe=? where idOrden=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, orden.getAfiliado().getIdAfiliado());
            ps.setInt(2, orden.getPrestador().getIdPrestador());
            ps.setDate(3,Date.valueOf(orden.getFecha()));
            ps.setString(4,orden.getFormaDePago());
            ps.setDouble(5, orden.getImporte());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "orden modificada exitosamente");
            }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'orden' ");
            }
    }
    
    
    public void borrarOrden(int idOrden){
        String sql="update orden SET estado=0 WHERE idOrden = ? ";
        try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, idOrden);
             int exito=ps.executeUpdate();
             if(exito==1){
                JOptionPane.showMessageDialog(null, "Orden eliminada exitosamente");
             }else{
                 JOptionPane.showMessageDialog(null, "Orden no encontrado");
             }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'orden' ");
            }
    }
    
    public Orden buscarOrden(int idOrden){
        String sql="select * from orden where idOrden=?";
        Orden orden=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idOrden);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                orden=new Orden();
                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setAfiliado(afiData.buscarAfiliado(rs.getInt("idAfiliado")));
                orden.setPrestador(presData.buscarPrestador(rs.getInt("idPrestador")));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setImporte(rs.getDouble("importe"));
            }else{
                 JOptionPane.showMessageDialog(null, "No existe esa orden");
            }
             ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'orden'");
            }
        return orden;
    }
    
    
    
    public List<Orden> listarOrdenesXAfiliado(int idAfiliado) {
        List<Orden> ordenesAfiliado = new ArrayList<>();

        try {
            String sql = "SELECT idOrden, idPrestador, fecha, importe FROM orden WHERE idAfiliado = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAfiliado); 

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();

                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setPrestador(presData.buscarPrestador(rs.getInt("idPrestador")));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setImporte(rs.getDouble("importe"));
                ordenesAfiliado.add(orden);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'orden': " + ex.getMessage());
        }
        return ordenesAfiliado;
    }

    
    public List<Orden> listarOrdenesXPrestador(int idPrestador) {
        List<Orden> ordenesPrestador = new ArrayList<>();

        try {
            String sql = "SELECT idOrden, idAfiliado, fecha, importe FROM orden WHERE idPrestador = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPrestador); 

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();

                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setAfiliado(afiData.buscarAfiliado(rs.getInt("idAfililado")));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setImporte(rs.getDouble("importe"));
                ordenesPrestador.add(orden);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'orden': " + ex.getMessage());
        }
        return ordenesPrestador;
    }
    
    
    
//   public List<Orden> listarOrdenesXFecha(LocalDate fecha) {
//        List<Orden> ordenesFecha = new ArrayList<>();
//
//        try {
//            String sql = "SELECT * FROM orden WHERE fecha = ?";
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Orden orden = new Orden();
//
//                orden.setIdOrden(rs.getInt("idOrden"));
//                orden.setAfiliado(afiData.buscarAfiliado(rs.getInt("idAfililado")));
//                orden.setPrestador(presData.buscarPrestador(rs.getInt("idPrestador")));
//                orden.setFecha(rs.getDate("fecha").toLocalDate());
//                orden.setImporte(rs.getDouble("importe"));
//                ordenesFecha.add(orden);
//            }
//
//            rs.close();
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'orden': " + ex.getMessage());
//        }
//        return ordenesFecha;
//    }
    
    
    public List<Orden> listarOrdenesXFecha(LocalDate fecha) {
    List<Orden> ordenesFecha = new ArrayList<>();

    try {
        String sql = "SELECT * FROM orden WHERE fecha = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        
        java.sql.Date fechaSQL = java.sql.Date.valueOf(fecha);
        ps.setDate(1, fechaSQL); 

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Orden orden = new Orden();

            orden.setIdOrden(rs.getInt("idOrden"));
            orden.setAfiliado(afiData.buscarAfiliado(rs.getInt("idAfiliado")));
            orden.setPrestador(presData.buscarPrestador(rs.getInt("idPrestador")));
            orden.setFecha(rs.getDate("fecha").toLocalDate());
            orden.setImporte(rs.getDouble("importe"));
            ordenesFecha.add(orden);
        }

        rs.close();
        ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'orden': " + ex.getMessage());
        }
        return ordenesFecha;
    }

    
    public List<Orden> obtenerAfiliadosXPrestador(int idPrestador, int idAfiliado){  
        List<Orden> ordenesAfiliadoPrestador = new ArrayList<>();
        try {
            String sql = "SELECT * FROM orden WHERE idAfiliado=? AND idPrestador = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPrestador); 
            ps.setInt(1, idAfiliado); 
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Orden orden = new Orden();

                orden.setIdOrden(rs.getInt("idOrden"));
                orden.setAfiliado(afiData.buscarAfiliado(rs.getInt("idAfililado")));
                orden.setFecha(rs.getDate("fecha").toLocalDate());
                orden.setImporte(rs.getDouble("importe"));
                ordenesAfiliadoPrestador.add(orden);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'orden': " + ex.getMessage());
        }
        return ordenesAfiliadoPrestador;
    }

    
}

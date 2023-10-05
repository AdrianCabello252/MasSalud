
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; //para la funcion listas
import javax.swing.JOptionPane;
import mutualgrupo36.Entidades.Afiliado;



public class AfiliadoData {
    
    private Connection con=null;
     public AfiliadoData(){
         con=Conexion.getConexion();
     }
     
    public void guardaAfiliado(Afiliado afiliado){
        String sql="INSERT INTO afiliado(nombre,apellido,dni,domicilio,telefono,estado)"
                    + " VALUES(?,?,?,?,?,?) ";
            try {
                 PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                 ps.setString(1, afiliado.getNombre());
                 ps.setString(2, afiliado.getApellido());
                 ps.setInt(3, afiliado.getDni());
                 ps.setString(4,afiliado.getDomicilio());
                 ps.setInt(5, afiliado.getTelefono());
                 ps.setBoolean(6, afiliado.setActivo());
                 ps.executeUpdate();

                 ResultSet rs=ps.getGeneratedKeys();

                 if(rs.next()){
                     afiliado.setIdAfiliado(rs.getInt(1)); //se toma la columna nro 1 donde se encuentran los ID
                     JOptionPane.showMessageDialog(null, "Afiliado guardado");
                 }
                 ps.close(); //para cerrar el objeto
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de afiliados");
                }
    }
    
    
    public void modificarAfiliado(Afiliado afiliado){
        
        String sql="UPDATE afiliado SET (nombre=?, apellido=?, dni=?, domicilio=?, telefono=?) where idAfiliado=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, afiliado.getNombre());
            ps.setString(2, afiliado.getApellido());
            ps.setInt(3, afiliado.getDni());
            ps.setString(4,afiliado.getDomicilio());
            ps.setInt (5,afiliado.getTelefono());
            ps.setInt(6, afiliado.getIdAfiliado());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "afiliado modificado exitosamente");
            }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'afiliado' ");
            }
    }
    
    
    public void borrarAfiliado(int idAfiliado){
        String sql="update afiliado SET estado=0 WHERE idAfiliado = ? ";
        try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, idAfiliado);
             int exito=ps.executeUpdate();
             if(exito==1){
                JOptionPane.showMessageDialog(null, "afiliado eliminado exitosamente");
             }else{
                 JOptionPane.showMessageDialog(null, "afiliado no encontrado");
             }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'afiliado' ");
            }
    }
    
    public List<Afiliado> listarAfiliados(){ 
        String sql="SELECT FROM afiliado (idAfiliado, nombre, apellido, dni, domicilio,telefono) WHERE estado=1";
        ArrayList<Afiliado> listaAfiliados= new ArrayList<>(); 
        try {
        PreparedStatement ps=con.prepareStatement (sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
                Afiliado afiliado=new Afiliado(); 
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setDni(rs.getInt("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getInt("telefono"));
                afiliado.setActivo(true);
                listaAfiliados.add(afiliado); 
            }
        ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'afiliados' ");
        }
        return listaAfiliados;
    }
    
    public Afiliado buscarAfiliado(int idAfiliado){
        String sql="select nombre,apellido,dni,domicilio,telefono from afiliado where idAfiliado=? and estado=1";
        Afiliado afiliado=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAfiliado);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                afiliado=new Afiliado();
            afiliado.setIdAfiliado(idAfiliado);
                 afiliado.setNombre(rs.getString("nombre"));
                 afiliado.setApellido(rs.getString("apellido"));
                 afiliado.setDni(rs.getInt("dni"));
                 afiliado.setDomicilio(rs.getString("domicilio"));
                 afiliado.setTelefono(rs.getInt("telefono"));
                 afiliado.setActivo(true);
             }else{
                 JOptionPane.showMessageDialog(null, "No existe afiliado");
             }
             ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla afiliados");
            }
        return afiliado;
    }
}     

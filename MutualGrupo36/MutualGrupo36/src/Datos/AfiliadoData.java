
package Datos;

import java.sql.Connection;
import java.sql.Date;
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
             ps.setBoolean(6, afiliado.isIsActivo());
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
}

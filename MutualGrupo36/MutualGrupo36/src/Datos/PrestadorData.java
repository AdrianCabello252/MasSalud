package Datos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mutualgrupo36.Entidades.Especialidad;
import mutualgrupo36.Entidades.Prestador;

public class PrestadorData {
    
    private Connection con = null;
    private EspecialidadData esData;

    public PrestadorData() {
        con = Conexion.getConexion();
    }

    
    public void guardarPrestador(Prestador prestador) {
        String sql= "INSERT INTO prestador (nombre, dni, domicilio, telefono, idEspecialidad, estado)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try {
                 PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                 ps.setString(1, prestador.getNombre());
                 ps.setInt(2, prestador.getDni());
                 ps.setString(3,prestador.getDomicilio());
                 ps.setInt(4, prestador.getTelefono());
                 ps.setInt(5, prestador.getEspecialidad().getIdEspecialidad());
                 ps.setBoolean(6, prestador.isEstado());
                 ps.executeUpdate();

                 ResultSet rs=ps.getGeneratedKeys();

                 if(rs.next()){
                     prestador.setIdPrestador(rs.getInt(1)); 
                     JOptionPane.showMessageDialog(null, "prestador guardado");
                 }
                 ps.close(); //para cerrar el objeto
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'prestador' ");
            }
    }
    
    
    public void modificarPrestador(Prestador prestador) {
        String query = "UPDATE prestador SET nombre =?, domicilio =?, telefono =?, idEspecialidad =? WHERE idPrestador =?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, prestador.getNombre());
            stmt.setString(2, prestador.getDomicilio());
            stmt.setInt(3, prestador.getTelefono());
            stmt.setInt(4, prestador.getEspecialidad().getIdEspecialidad()); 
            stmt.setInt(5, prestador.getIdPrestador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestador modificado");
        } catch (SQLException e) {
            e.printStackTrace();
         
        }
    }

    
    public Prestador buscarPrestador(int idPrestador) {
    String query = "SELECT * FROM Prestador WHERE idPrestador = ?";
    Prestador prestador = null;

    try (PreparedStatement stmt = con.prepareStatement(query)) {
        stmt.setInt(1, idPrestador);
        ResultSet resultSet = stmt.executeQuery();

        if (resultSet.next()) {
        prestador = new Prestador();
        prestador.setIdPrestador(resultSet.getInt("idPrestador"));
        prestador.setNombre(resultSet.getString("nombre"));
        prestador.setDni(resultSet.getInt("dni")); 
        prestador.setDomicilio(resultSet.getString("domicilio")); 
        Especialidad especialidad = new Especialidad(); 
        especialidad.setIdEspecialidad(resultSet.getInt("idEspecialidad"));
        prestador.setEspecialidad(especialidad);

        }
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return prestador;
    }


    public List<Prestador> buscarPrestadorPorEspecialidad(int idEspecialidad) {
    String query = "SELECT idPrestador, nombre, dni, domicilio FROM Prestador WHERE idEspecialidad = ?";
    List<Prestador> prestadoresPorEspecialidad = new ArrayList<>();

    try (PreparedStatement stmt = con.prepareStatement(query)) {
        stmt.setInt(1, idEspecialidad);
        ResultSet resultSet = stmt.executeQuery();

        while (resultSet.next()) {
            Prestador prestador = new Prestador();
            prestador.setIdPrestador(resultSet.getInt("idPrestador"));
            prestador.setNombre(resultSet.getString("nombre"));
            prestador.setDni(resultSet.getInt("dni"));
            prestador.setDomicilio(resultSet.getString("domicilio"));
            prestadoresPorEspecialidad.add(prestador);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return prestadoresPorEspecialidad;
    }
        
        
//    String query = "SELECT idPrestador,nombre,dni,domicilio FROM Prestador WHERE idEspecialidad = ?";
//    Prestador prestador = null;
//
//    try (PreparedStatement stmt = con.prepareStatement(query)) {
//        Especialidad especialidad = new Especialidad(); //
//        stmt.setEspecialidad(1, idEspecialidad);        // cosas a arreglar para que funcione
//        prestador.setEspecialidad(especialidad);    //
//        ResultSet resultSet = stmt.executeQuery();
//
//        if (resultSet.next()) {
//        prestador = new Prestador();
//        prestador.setIdPrestador(resultSet.getInt("idPrestador"));
//        prestador.setNombre(resultSet.getString("nombre"));
//        prestador.setDni(resultSet.getInt("dni")); 
//        prestador.setDomicilio(resultSet.getString("domicilio")); 
//        }
//        
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, e.getMessage());
//    }
////    return prestador;
    //}
    
    
    public void eliminarPrestador(int idPrestador) {
        String query = "DELETE FROM Prestador WHERE idPrestador = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setInt(1, idPrestador);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestador eliminado con exito");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void desactivarPrestador (int idPrestador){
        String sql="update prestador SET estado=0 WHERE idPrestador = ? ";
        try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, idPrestador);
             int exito=ps.executeUpdate();
             if(exito==1){
                JOptionPane.showMessageDialog(null, "Prestador desactivado exitosamente");
             }else{
                 JOptionPane.showMessageDialog(null, "Prestador no encontrado");
             }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla 'prestador' ");
            }
    }
    

    public List<Prestador> listarPrestadores() {
    List<Prestador> prestadores = new ArrayList<>();
    String query = "SELECT * FROM prestador";
    try (PreparedStatement stmt = con.prepareStatement(query);
         ResultSet resultSet = stmt.executeQuery()) {
        while (resultSet.next()) {
            Prestador prestador = new Prestador();
            prestador.setIdPrestador(resultSet.getInt("idPrestador"));
            prestador.setNombre(resultSet.getString("nombre"));
            prestador.setDni(resultSet.getInt("dni")); 
            prestador.setDomicilio(resultSet.getString("domicilio")); 
            Especialidad especialidad = new Especialidad(); 
            especialidad.setIdEspecialidad(resultSet.getInt("idEspecialidad"));
            prestador.setEspecialidad(especialidad);
            prestadores.add(prestador);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return prestadores;
}

    

}
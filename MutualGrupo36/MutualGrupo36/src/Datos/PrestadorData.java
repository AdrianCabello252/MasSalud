package Datos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mutualgrupo36.Entidades.Prestador;

public class PrestadorData {
    private Connection connection=null;
    private EspecialidadData esData;

    public PrestadorData() {
        connection=Conexion.getConexion();
    }

    public void guardarPrestador(Prestador prestador) {
        String sql= "INSERT INTO prestador (nombre, dni, domicilio, telefono, idEspecialidad, estado)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try {
                 PreparedStatement ps=connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
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
                     JOptionPane.showMessageDialog(null, "Afiliado guardado");
                 }
                 ps.close(); //para cerrar el objeto
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de afiliados");
                }
    }

    public void modificarPrestador(Prestador prestador) {
        String query = "UPDATE Prestadores SET nombre = ?, idEspecialidad = ? WHERE telefono = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, prestador.getNombre());
            stmt.setInt(5, prestador.getEspecialidad().getIdEspecialidad()); // Ajusta esto según tus campos
            stmt.setInt(3, prestador.getTelefono());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public Prestador buscarPrestador(int id) {
//        String query = "SELECT * FROM Prestadores WHERE id = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(query)) {
//            stmt.setInt(1, id);
//            ResultSet resultSet = stmt.executeQuery();
//            if (resultSet.next()) {
//                String nombre = resultSet.getString("nombre");
//                String especialidad = resultSet.getString("especialidad"); // Ajusta esto según tus campos
//                return new Prestador(id, nombre, especialidad);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null; 
//    }
    
    public Prestador buscarPrestador(int idPrestador) {
    String query = "SELECT * FROM Prestador WHERE idPrestador = ?";
    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        stmt.setInt(1, idPrestador);
        ResultSet resultSet = stmt.executeQuery();
        if (resultSet.next()) {
            String nombre = resultSet.getString("nombre");
            int dni = resultSet.getInt("dni");
            String domicilio = resultSet.getString("domicilio");
            int telefono = resultSet.getInt("telefono");
            int idEspecialidad = resultSet.getInt("idEspecialidad"); 
            boolean estado = resultSet.getBoolean("estado");

            Prestador prestador = new Prestador();
            prestador.setIdPrestador(idPrestador);
            prestador.setNombre(nombre);
            prestador.setDni(dni);
            prestador.setDomicilio(domicilio);
            prestador.setTelefono(telefono);
            prestador.setEspecialidad(esData.buscarEspecialidad(resultSet.getInt("idEspecialidad")));
            prestador.setEstado(estado);

            return prestador;
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void eliminarPrestador(int id) {
        String query = "DELETE FROM Prestadores WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Prestador> listarPrestadores() {
        List<Prestador> prestadores = new ArrayList<>();
        String query = "SELECT * FROM Prestadores";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet resultSet = stmt.executeQuery()) {
            while (resultSet.next()) {
                Prestador prestador = new Prestador();
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int idEspecialidad = resultSet.getInt("idEspecialidad"); 
                prestadores.add(prestador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestadores;
    }
    

}
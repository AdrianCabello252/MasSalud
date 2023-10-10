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
    private Connection connection;

    public PrestadorData(Connection connection) {
        this.connection = connection;
    }

    public void guardarPrestador(Prestador prestador) {
        String sql= "INSERT INTO prestador (nombre, dni, domicilio, telefono, especialidad, estado)"
                + " VALUES (?, ?, ?, ?, ?, ?)";
        try {
                 PreparedStatement ps=connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                 ps.setString(1, prestador.getNombre());
                 ps.setInt(2, prestador.getDni());
                 ps.setString(3,prestador.getDomicilio());
                 ps.setInt(4, prestador.getTelefono());
                 ps.setString(5, prestador.getIdEspecialidad());
                 ps.setBoolean(6, prestador.setEstado());
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
        String query = "UPDATE Prestadores SET nombre = ?, especialidad = ? WHERE telefono = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, prestador.getNombre());
            stmt.setString(2, prestador.getIdEspecialidad()); // Ajusta esto según tus campos
            stmt.setInt(3, prestador.getTelefono());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Prestador buscarPrestador(int id) {
        String query = "SELECT * FROM Prestadores WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String especialidad = resultSet.getString("especialidad"); // Ajusta esto según tus campos
                return new Prestador(id, nombre, especialidad);
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
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String especialidad = resultSet.getString("especialidad"); // Ajusta esto según tus campos
                Prestador prestador = new Prestador(id, nombre, especialidad);
                prestadores.add(prestador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestadores;
    }
}
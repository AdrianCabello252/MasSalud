
package Datos;

import Datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mutualgrupo36.Entidades.Especialidad;


public class EspecialidadData {
    private Connection con=null;

    public EspecialidadData() {
        con=Conexion.getConexion();
    }
    
    public void guardarEspecialidad(Especialidad especie){
        String sql="INSERT INTO Especialidad(especialidad) VALUES(?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, especie.getTipoEspecialidad());
            
            ps.executeQuery();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if (rs.next()) {
                especie.setIdEspecialidad(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Especialidad guardado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Eroor al guardar especialidad");
        }
    }
    
    public List<Especialidad> listarEspecualidad(){
         String sql="SELECT * FROM `especialidad` WHERE 1";
        ArrayList<Especialidad> especie= new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement (sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Especialidad especialidad=new Especialidad();
                especialidad.setTipoEspecialidad(rs.getString("especialidad"));
                especie.add(especialidad);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return especie;
    }
    
    /*public void buscarEspecialidad(String espec){
        for(Especialidad especi:listarEspecualidad()){
            
            if(especi.getTipoEspecialidad().startsWith(jtNombre.getText())){
                modelo.addRow(new Object[]{
                    especi.getIdEspecialidad(),
                    especi.getTipoEspecialidad()
                });
            }
        }
    }  //metodo para vistas
    
    public void borrarFila(){
        int f=jtTabla.getRowCount()-1;
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }*/  //metodo para vistas
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author marce
 */
public class DataPrestador {
    private int idPrestador;
    private String nombre;
    private String apellido;
    private int dni;
    private boolean activo;
    private DataEspecialidad especialidad;

    public DataPrestador(int idPrestador, String nombre, String apellido, int dni, boolean activo, DataEspecialidad especialidad) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.activo = activo;
        this.especialidad = especialidad;
    }

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public DataEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(DataEspecialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    
}

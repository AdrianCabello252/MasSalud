
package mutualgrupo36.Entidades;


public class Prestador {
    
    private int idPrestador;
    private String nombre;
    private int dni;
    private String domicilio;
    private int telefono;
    private String especialidad;
    private boolean estado;

    public Prestador() {
    }

    public Prestador(String nombre, int dni, String especialidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.especialidad = especialidad;
    }

    public Prestador(int idPrestador, String nombre, int dni, String domicilio, String especialidad, boolean estado) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public Prestador(int idPrestador, String nombre, int dni, String domicilio, int telefono, String especialidad, boolean estado) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.estado = estado;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
   @Override
    public String toString() {
    return nombre+", "+dni+", "+especialidad;
    }
    
    
}

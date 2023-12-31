
package mutualgrupo36.Entidades;


public class Afiliado {
    
    private int idAfiliado;
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private int telefono;
    private boolean Activo;

    public Afiliado() {
    }

    public Afiliado(int idAfiliado, String nombre, String apellido, int dni, String domicilio, int telefono, boolean Activo) {
        this.idAfiliado = idAfiliado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.Activo = Activo;
    }

    public Afiliado(String nombre, String apellido, int dni, String domicilio, int telefono, boolean Activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.Activo = Activo;
    }

    public Afiliado(int idAfiliado, String nombre, String apellido, int dni, String domicilio, boolean Activo) {
        this.idAfiliado = idAfiliado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.Activo = Activo;
    }

    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
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

    public boolean setActivo() {
        return Activo;
    }
    
    public boolean getActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    
    @Override
    public String toString() {
    return nombre+", "+apellido+", "+dni;
    }
    
}

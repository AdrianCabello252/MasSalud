
package mutualgrupo36.Entidades;

import java.time.LocalDate;

public class Orden {
    
    private int idOrden;
    Afiliado afiliado;
    Prestador prestador;
    private LocalDate fecha;
    private String formaDePago;
    private double importe;

    public Orden() {
    }

    public Orden(Afiliado afiliado, Prestador prestador, LocalDate fecha, String formaDePago, double importe) {
        this.afiliado = afiliado;
        this.prestador = prestador;
        this.fecha = fecha;
        this.formaDePago = formaDePago;
        this.importe = importe;
    }

    public Orden(int idOrden, Afiliado afiliado, Prestador prestador, LocalDate fecha, String formaDePago, double importe) {
        this.idOrden = idOrden;
        this.afiliado = afiliado;
        this.prestador = prestador;
        this.fecha = fecha;
        this.formaDePago = formaDePago;
        this.importe = importe;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    @Override
    public String toString() {
    return afiliado+", "+prestador+", "+formaDePago+", "+importe;
    
    }
        
    
}

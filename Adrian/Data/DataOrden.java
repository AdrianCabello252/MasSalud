/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.time.LocalDate;

/**
 *
 * @author marce
 */
public class DataOrden {
    private int idOrden;
    private LocalDate fecha;
    private String formaPago;
    private double importe;
    private DataAfiliado idAfiliado;
    private DataPrestador prestador;

    public DataOrden() {
    }
    
    

    public DataOrden(int idOrden, LocalDate fecha, String formaPago, double importe, DataAfiliado idAfiliado, DataPrestador prestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.idAfiliado = idAfiliado;
        this.prestador = prestador;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public DataAfiliado getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(DataAfiliado idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public DataPrestador getPrestador() {
        return prestador;
    }

    public void setPrestador(DataPrestador prestador) {
        this.prestador = prestador;
    }
    
    
}

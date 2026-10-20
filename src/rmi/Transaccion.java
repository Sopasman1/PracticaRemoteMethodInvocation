package rmi;

import java.io.Serializable;
import java.util.Date;

public class Transaccion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String idTransaccion;
    private double monto;
    private Date fecha;

    public Transaccion(String idTransaccion, double monto) {
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.fecha = new Date();
    }

    public String getIdTransaccion() { return idTransaccion; }
    public double getMonto() { return monto; }
    public Date getFecha() { return fecha; }

    @Override
    public String toString() {
        return "Transaccion{id='" + idTransaccion + "', monto=" + monto + ", fecha=" + fecha + "}";
    }
}
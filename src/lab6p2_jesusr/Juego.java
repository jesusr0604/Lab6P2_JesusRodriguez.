
package lab6p2_jesusr;

import java.util.Date;


public class Juego {
    private String nombre,descripcion,estado;
    private double precio;
    private Date fecha;
    private int cantidad;
    private boolean rentable,agregado;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, String estado, double precio, Date fecha, int cantidad, boolean rentable, boolean agregado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.precio = precio;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.rentable = rentable;
        this.agregado = agregado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    @Override
    public String toString() {
        return nombre +" "+"Cantidad"+cantidad;
    }
    
    
}

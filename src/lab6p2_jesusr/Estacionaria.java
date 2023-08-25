/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_jesusr;

import java.util.Date;

/**
 *
 * @author Jesus
 */
public class Estacionaria extends Consola {
    private int controles,almacenamiento;
    private String tipo;

    public Estacionaria() {
    }

    public Estacionaria(int controles, int almacenamiento, String tipo, String identificación, String fabricante, String modelo, Date añouso, double precio) {
        super(identificación, fabricante, modelo, añouso, precio);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.tipo = tipo;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    
}

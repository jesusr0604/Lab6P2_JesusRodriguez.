
package lab6p2_jesusr;

import java.util.ArrayList;
import java.util.Date;


public class Consola {
    private String identificación, fabricante,modelo;
    private Date añouso;
    private ArrayList<Juego>game;
    private double precio;

    public Consola() {
    }

    public Consola(String identificación, String fabricante, String modelo, Date añouso, double precio) {
        this.identificación = identificación;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.añouso = añouso;
  
        this.precio = precio;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getAñouso() {
        return añouso;
    }

    public void setAñouso(Date añouso) {
        this.añouso = añouso;
    }

    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}


package lab6p2_jesusr;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class Consola {
    private String identificación, fabricante,modelo;
    private int añouso;
    private ArrayList<Juego>game;
    private double precio;

    public Consola() {
    }

    public Consola(String identificación, String fabricante, String modelo, int añouso, double precio) {
        this.identificación = identificación;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.añouso=añouso;
  
        this.precio = precio;
    }

    public Consola(ArrayList<Juego> game) {
        this.game = game;
    }

    public String getIdentificación() {
        return identificación;
    }

    public void setIdentificación(String identificación) {
        
        if (identificación.length()==4) {
           this.identificación = identificación;
        
        }
         JOptionPane.showMessageDialog(null, "Esto no es de 4letras");
        ;
        
        
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

    public int getAñouso() {
        return añouso;
    }

    public void setAñouso(int añouso) {
        this.añouso = añouso;
    }

    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getGame() {
        return game;
    }

    public void setGame(ArrayList<Juego> game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return identificación ;
    }
    
    
}

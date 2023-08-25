
package lab6p2_jesusr;

import java.util.Date;

public class Portatil extends Consola {
    private String tam;
    private int bat;
    private boolean estuche;

    public Portatil() {
    super();
    }

    public Portatil(String tam, int bat, boolean estuche, String identificación, String fabricante, String modelo, Date añouso, double precio) {
        super(identificación, fabricante, modelo, añouso, precio);
        this.tam = tam;
        this.bat = bat;
        this.estuche = estuche;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public int getBat() {
        return bat;
    }

    public void setBat(int bat) {
        this.bat = bat;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domains;

/**
 *
 * @author Andrés
 */
public class Trayecto {

    String desde;
    String hasta;
    String distancia;
    String duracion;
    
    public Trayecto() {
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}

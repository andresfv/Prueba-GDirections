/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import domains.Trayecto;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author sigesa
 */
@ManagedBean
@SessionScoped
public class TrayectoBean {

    private Trayecto trayecto;

    public TrayectoBean() {
        trayecto = new Trayecto();
    }

    public Trayecto getTrayecto() {
        return trayecto;
    }

    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    public void getFromJs() {
        Map<String, String> fromJSF = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String duracion = fromJSF.get("duracion");
        String distancia = fromJSF.get("distancia");
        this.trayecto.setDuracion(duracion);
        this.trayecto.setDistancia(distancia);
    }
}

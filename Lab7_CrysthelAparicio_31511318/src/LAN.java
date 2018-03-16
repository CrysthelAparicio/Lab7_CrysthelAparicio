
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COPECO -13
 */
public class LAN {
    private Ventana_LAN ventana_lan;
    private String nombre;
    private int v_transmision;
    private int v_recepcion;
    private Router router;
    private ArrayList<PC> pc = new ArrayList<>();

    public LAN() {
    }

    public LAN(Ventana_LAN ventana_lan, String nombre, int v_transmision, int v_recepcion, Router router) {
        this.ventana_lan = ventana_lan;
        this.nombre = nombre;
        this.v_transmision = v_transmision;
        this.v_recepcion = v_recepcion;
        this.router = router;
    }

    public Ventana_LAN getVentana_lan() {
        return ventana_lan;
    }

    public void setVentana_lan(Ventana_LAN ventana_lan) {
        this.ventana_lan = ventana_lan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getV_transmision() {
        return v_transmision;
    }

    public void setV_transmision(int v_transmision) {
        this.v_transmision = v_transmision;
    }

    public int getV_recepcion() {
        return v_recepcion;
    }

    public void setV_recepcion(int v_recepcion) {
        this.v_recepcion = v_recepcion;
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public ArrayList<PC> getPc() {
        return pc;
    }

    public void setPc(ArrayList<PC> pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}

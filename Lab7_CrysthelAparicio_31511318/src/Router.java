
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
public class Router {

    private String ip_router;
    private String mascara;
    private LAN lan;
    private int v_transf;
    private int v_recep;

    private ArrayList<Router> routers = new ArrayList<>();

    public Router() {
    }

    public Router(String ip_router, String mascara, LAN lan, int v_transf, int v_recep) {
        this.ip_router = ip_router;
        this.mascara = mascara;
        this.lan = lan;
        this.v_transf = v_transf;
        this.v_recep = v_recep;
    }

    public String getIp_router() {
        return ip_router;
    }

    public void setIp_router(String ip_router) {
        this.ip_router = ip_router;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public LAN getLan() {
        return lan;
    }

    public void setLan(LAN lan) {
        this.lan = lan;
    }

    public int getV_transf() {
        return v_transf;
    }

    public void setV_transf(int v_transf) {
        this.v_transf = v_transf;
    }

    public int getV_recep() {
        return v_recep;
    }

    public void setV_recep(int v_recep) {
        this.v_recep = v_recep;
    }

    public ArrayList<Router> getRouters() {
        return routers;
    }

    public void setRouters(ArrayList<Router> routers) {
        this.routers = routers;
    }
 
    
}

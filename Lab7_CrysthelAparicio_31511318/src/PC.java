
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
public class PC {

    private String IP;
    private String mascara;
    private String gateway_ip;
    private ArrayList<mensajes> mensajes = new ArrayList<>();

    public PC() {
    }

    public PC(String IP, String mascara, String gateway_ip) {
        this.IP = IP;
        this.mascara = mascara;
        this.gateway_ip = gateway_ip;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getGateway_ip() {
        return gateway_ip;
    }

    public void setGateway_ip(String gateway_ip) {
        this.gateway_ip = gateway_ip;
    }

    public ArrayList<mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<mensajes> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return IP;
    }

}

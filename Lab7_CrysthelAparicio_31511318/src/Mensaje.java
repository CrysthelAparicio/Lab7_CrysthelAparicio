/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author COPECO -13
 */
public class Mensaje {

    private String ip_origen;
    private String ip_destino;
    private String titulo;
    private String contenido;

    public Mensaje() {
    }

    public Mensaje(String ip_origen, String ip_destino, String titulo, String contenido) {
        this.ip_origen = ip_origen;
        this.ip_destino = ip_destino;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getIp_origen() {
        return ip_origen;
    }

    public void setIp_origen(String ip_origen) {
        this.ip_origen = ip_origen;
    }

    public String getIp_destino() {
        return ip_destino;
    }

    public void setIp_destino(String ip_destino) {
        this.ip_destino = ip_destino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return titulo;
    }

}

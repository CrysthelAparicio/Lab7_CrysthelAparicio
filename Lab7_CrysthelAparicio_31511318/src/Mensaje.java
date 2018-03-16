
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author COPECO -13
 */
public class Mensaje extends Thread {

    private String ip_origen;
    private String ip_destino;
    private String titulo;
    private String contenido;
    private JTable tabla;
    private boolean avanzar;
    private boolean bandera;
    private LAN lan;

    public Mensaje() {
    }

    public Mensaje(String ip_origen, String ip_destino, String titulo, String contenido, JTable tabla, LAN lan) {
        this.ip_origen = ip_origen;
        this.ip_destino = ip_destino;
        this.titulo = titulo;
        this.contenido = contenido;
        this.tabla = tabla;
        this.lan = lan;
        avanzar = true;
        bandera = true;
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

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public LAN getLan() {
        return lan;
    }

    public void setLan(LAN lan) {
        this.lan = lan;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public void run() {
        String estado1 = "Entregado";
        String estado2 = "Error";
        System.out.println(lan.getV_recepcion());
        if (avanzar) {
            //recepcion de swicth
            try {
                Thread.sleep(lan.getV_recepcion());
                Object row[] = {titulo, lan.getNombre(), lan.getV_recepcion(), "Entregado"};
//          
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.addRow(row);
                tabla.setModel(modelo);
            } catch (InterruptedException e) {
            }

            //transcicion de swicth
            try {
                Thread.sleep(lan.getV_transmicion());
            } catch (InterruptedException e) {
            }

            //recepcion receptor
            Object row[] = {titulo, lan.getNombre(), lan.getV_recepcion(), "Entregado"};
//          
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(row);
            tabla.setModel(modelo);

            try {
                Thread.sleep(lan.getV_recepcion());
            } catch (Exception e) {
            }
        }
    }
}

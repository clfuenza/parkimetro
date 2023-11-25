/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author clfue
 */
public class EstacionamientoFrecuente {
    private String ubicacionAsignada;
    private char jornada;
    private String periodoArriendo;
    private int valorArriendo;
    private String fechaPago;

    public EstacionamientoFrecuente() {
    }

    public EstacionamientoFrecuente(String ubicacionAsignada, char jornada, String periodoArriendo, int valorArriendo, String fechaPago) {
        this.ubicacionAsignada = ubicacionAsignada;
        this.jornada = jornada;
        this.periodoArriendo = periodoArriendo;
        this.valorArriendo = valorArriendo;
        this.fechaPago = fechaPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getUbicacionAsignada() {
        return ubicacionAsignada;
    }

    public void setUbicacionAsignada(String ubicacionAsignada) {
        this.ubicacionAsignada = ubicacionAsignada;
    }

    public char getJornada() {
        return jornada;
    }

    public void setJornada(char jornada) {
        this.jornada = jornada;
    }

    public String getPeriodoArriendo() {
        return periodoArriendo;
    }

    public void setPeriodoArriendo(String periodoArriendo) {
        this.periodoArriendo = periodoArriendo;
    }

    public int getValorArriendo() {
        return valorArriendo;
    }

    public void setValorArriendo(int valorArriendo) {
        this.valorArriendo = valorArriendo;
    }
    
    
    
}

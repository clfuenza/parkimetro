/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Date;

/**
 *
 * @author clfue
 */
public class Entrada {
    private int id;
    private String patente;
    private String tipo; 
    private String fecha;
    private String hora;
    private boolean estacionado;

    public Entrada() {
    }

    public Entrada(int id, String patente, String tipo, String fecha, String hora, boolean estacionado) {
        this.id = id;
        this.patente = patente;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.estacionado = estacionado;
    }

       
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public boolean isEstacionado() {
        return estacionado;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }
    
     @Override
    public String toString() {
        return "Entrada{" + "id=" + id + ", patente=" + patente + ", tipo=" + tipo + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
}

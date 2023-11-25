/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author clfue
 */
public class Salida {
    private int id;
    private int id_entrada;
    private String hora_salida;
    private String fecha_salida;

    public Salida() {
        id = 0;
    }

    public Salida(int id, int id_entrada, String hora_salida, String fecha_salida) {
        this.id = id;
        this.id_entrada = id_entrada;
        this.hora_salida = hora_salida;
        this.fecha_salida = fecha_salida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.CrudSalida;

/**
 *
 * @author clfue
 */
public class Detalle implements ICalculable {
    private Entrada entrada;
    private Salida salida;

    public Detalle() {
    }

    public Detalle(Entrada entrada, Salida salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    public Salida getSalida() {
        return salida;
    }

    public void setSalida(Salida salida) {
        this.salida = salida;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    
    public String informacionEstacionamiento()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t===== Detalle Estacionamiento ======\n");
        sb.append("\tFecha               : "+entrada.getFecha()+"\n");
        sb.append("\tHora de Entrada : "+entrada.getHora()+"\n");
        sb.append("\tHora de Salida    :  "+salida.getHora_salida()+"\n");
        sb.append("\t----------------------------------------------------\n");
        sb.append("\tMinutos aparcado: "+minutos()+"\n");
        sb.append("\t----------------------------------------------------\n");
        sb.append(("\tTotal a pagar:$"+calcularTotal()));
        
        return sb.toString();
    }
    
    @Override
    public int minutos()
    {
        GestionMinutos gm = new GestionMinutos();
        int min = (int)(gm.minutosEstacionado(this.entrada.getHora(),this.salida.getHora_salida()));
        return min;
    }
    
    @Override
    public int calcularTotal()
    {
        CrudSalida crudSalida = new CrudSalida();
        int valorMinuto = crudSalida.valorMinuto();
        return minutos() * valorMinuto;
    }

    @Override
    public int vuelto(int dinero) {
        int vuelto = dinero - calcularTotal();
        return vuelto;
    }
    
    
}

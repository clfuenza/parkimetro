/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author clfue
 */
public class Fechas {
    
        Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH)+1;
        int anio = calendar.get(Calendar.YEAR);
    
        
    
    public String fechaActual()
    {
        return dia+"/"+mes+"/"+anio;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author clfue
 */
public class GestionMinutos {
    
    public long minutosEstacionado(String h1, String h2){       
            
            LocalTime hora_entrada = LocalTime.parse(h1);
            LocalTime hora_salida = LocalTime.parse(h2);
            long diferencia = ChronoUnit.MINUTES.between(hora_entrada, hora_salida);
            Double h = diferencia / 60.00;
            Long m = diferencia % 60;
            LocalTime hf = LocalTime.of(h.intValue(), m.intValue());
                  
        return diferencia;
    }
    
    
    
    
}

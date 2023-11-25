/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.CrudEntrada;
import datos.CrudSalida;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import negocio.Entrada;
import negocio.Salida;

/**
 *
 * @author clfue
 */
public class InicioTest {
    public static void main(String [] args)
    {
        try{
            CrudEntrada crud= new CrudEntrada();
            if (crud.entradaDuplicada("HHVV22"))
            {
                System.out.println("Entrada Duplicada...");
            }
            else
            {
                System.out.println("No existe duplicación de entrada...");
            }
            
//           Entrada e = new Entrada();
//           CrudSalida obj = new CrudSalida();
//           e = obj.buscarEntrada("AABBCC");
//            System.out.println(e);
          
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        
    }
}

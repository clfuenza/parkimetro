/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import negocio.Entrada;

/**
 * Clase hace referencia a un CRUD relacionada con la interfaz GUI panel interno
 * de entrada.
 * Tablas involucradas: entrada, total_estac 
 * @author Claudio Fuenzalida 
 */
public class CrudEntrada extends Conexion {

    private PreparedStatement ps;
    ResultSet rs;
    
public boolean insertar(Entrada entrada)
{
  boolean ingresado = false;
  try{
      
      con = super.getConection();
      ps = con.prepareStatement("INSERT INTO entrada (patente,tipo,fecha,hora,estacionado) VALUES (?,?,?,?,?)");
      ps.setString(1,entrada.getPatente());
      ps.setString(2, entrada.getTipo());
      ps.setString(3, entrada.getFecha());
      ps.setString(4, entrada.getHora());
      ps.setBoolean(5, entrada.isEstacionado());
      int valor =  ps.executeUpdate();
      con.close();    
      if (valor>0)
      {
          ingresado = true;
      }
     
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
  return ingresado;
}

 public boolean restarEstacionamiento()
 {
     boolean descontado = false;
     try{
         con = super.getConection();
         ps = con.prepareStatement("update total_estac set actual = actual - 1;");
         int valor = ps.executeUpdate();
         con.close();
         if (valor>0)
        {
            descontado = true;
        }
     }catch(Exception ex){
         ex.printStackTrace();
     }
     return descontado;
 }
 
 /**
  * método que cambia el estado, estacionamiento de ocupado (1)
  * a disponible (0)
  * @return estado
  */
 public boolean cambiarEstado(String patente)
 {
      boolean estado = false;
     try{
         con = super.getConection();
         ps = con.prepareStatement("update entrada set estacionado = 0 where patente = ? and estacionado = 1");
         ps.setString(1,patente);  //Confirmar si esto funciona
         int valor = ps.executeUpdate();
         con.close();
         if (valor>0)
        {
            estado = true;
        }
     }catch(Exception ex){
         ex.printStackTrace();
     }
     return estado;
 }
 
 
 
 
 
 public int estacionamientosDisponibles()
 {
     int cantidad_disponible = 999;
     try{
         con = super.getConection();
         ps = con.prepareStatement("select actual from total_estac;");
         rs = ps.executeQuery();
         if (rs.next())
         {
          cantidad_disponible =  rs.getInt("actual");
         }
         
         con.close();
     }catch(Exception ex)
     {
         ex.printStackTrace();
     }
     return cantidad_disponible;
 }
 
 
 public boolean entradaDuplicada(String patenteIngresada)
 {
    boolean duplicado = false;
     try{
         con = super.getConection();
         ps = con.prepareStatement("select patente from entrada where patente = ? and estacionado = 1;");
         ps.setString(1, patenteIngresada);
         rs = ps.executeQuery();
         if (rs.next())
         {
           duplicado = true;
         }
         
         con.close();
     }catch(Exception ex)
     {
         ex.printStackTrace();
     }
     return duplicado;
 }
 
}

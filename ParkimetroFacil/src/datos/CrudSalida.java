/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import negocio.Entrada;
import negocio.Salida;

/**
 * Clase hace referencia a un CRUD relacionada con la interfaz GUI panel interno
 * de salida.
 * @author clfue
 */
public class CrudSalida extends Conexion {
   
    private PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Método que busca la última coincidencia por patente retornando un objeto 
     * con datos de entrada o un objeto vacío de no encontrar. Esto por si un vehiculo
     * ocupa más de una vez el estacionamiento durante el día.
     * @param patente_entrada
     * @return entrada
     */
    public Entrada buscarEntrada(String patente_entrada)
    {
        Entrada entrada = new Entrada();
        try{
            con = super.getConection();
            ps = con.prepareStatement("SELECT * from entrada WHERE patente = ? and estacionado = true");
            ps.setString(1, patente_entrada);
            rs = ps.executeQuery();
            if (rs.next())
            {
                entrada.setId(rs.getInt("id"));
                entrada.setPatente(rs.getString("patente"));
                entrada.setTipo(rs.getString("tipo"));
                entrada.setFecha(rs.getString("fecha"));
                entrada.setHora(rs.getString("hora"));
                entrada.setEstacionado(rs.getBoolean("estacionado"));
            }            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return entrada;
    }
    
    public boolean insertarSalida(Salida salida)
    {
      boolean ingresado = false;
      try{

          con = super.getConection();
          ps = con.prepareStatement("INSERT INTO salida (id_entrada, hora_salida, fecha_salida) VALUES (?,?,?)");          
          ps.setInt(1, salida.getId_entrada()); //Obtenida desde el método: buscarEntrada(String patente_entrada)
          ps.setString(2, salida.getHora_salida());
          ps.setString(3, salida.getFecha_salida());
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
    
    
 public boolean esEstacionado()
 {
     boolean agregado = false;
     try{
         con = super.getConection();
         ps = con.prepareStatement("UPDATE entrada SET estacionado = false ;");
         int valor = ps.executeUpdate();
         con.close();
         if (valor>0)
        {
            agregado = true;
        }
     }catch(Exception ex){
         ex.printStackTrace();
     }
     return agregado;
 }
    
    
    
 /**
  * Suma 1 al estacionemiento cuando un vehiculo lo abandona (Excepto motocicletas)
  * @return 
  */   
 public boolean agregarEstacionameiento()
 {
     boolean agregado = false;
     try{
         con = super.getConection();
         ps = con.prepareStatement("UPDATE total_estac SET actual = actual + 1;");
         int valor = ps.executeUpdate();
         con.close();
         if (valor>0)
        {
            agregado = true;
        }
     }catch(Exception ex){
         ex.printStackTrace();
     }
     return agregado;
 }
    
 /**
  * Obtiene el valor del minuto desde la tabla tarifa
  * @return valorMinuto
  */
 public int valorMinuto()
 {
     int valorMinuto = 0;
     try{
         con = super.getConection();
         ps = con.prepareStatement("select valor_minuto from tarifa;");
         rs = ps.executeQuery();
         if (rs.next())
         {
          valorMinuto =  rs.getInt("valor_minuto");
         }         
         con.close();
     }catch(Exception ex)
     {
         ex.printStackTrace();
     }
     return valorMinuto;
 }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.sql.*;
import java.util.*;

/**
 * Clase para acceder a la cadena conexión de la BBDD parking
 * @author Claudio Fuenzalida
 */
public class Conexion {
    
    protected Connection con;
   
    
    /**
     * Método que conecta a la base de datos parking
     * con los parámetros a MySql
     * @return Connection 
     */    
    public Connection getConection()
    {
        String base = "parking";
        String url = "jdbc:mysql://localhost:3306/" + base;
        String user = "root";
        String password = null;
         try{       
                   
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);   
             System.out.println("CONEXION ESTABLECIDA...");
        }catch(Exception e){
            System.out.println("error:"+e.getMessage());
        }
        return con;
    }
    

    
   

}

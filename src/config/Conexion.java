
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/poo2","root","alvaro123");
        } catch (Exception e) {
            System.err.println("Error:"+e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
  }

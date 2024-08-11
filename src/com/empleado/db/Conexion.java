
package com.empleado.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author By Shakur
 */
public class Conexion 
{
    private static Connection conn = null;
    private static String login = "EMPLEADO";
    private static  String clave = "123456";
    private  static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,clave);
            conn.setAutoCommit(false);
            if (conn != null){
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("Conexion es Erronea");
            }
            
        } catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Conexion Erronea " + e.getMessage());
        }
        return conn;
    }
    
    public void desconexion (){
        try {
            conn.close();
        } catch (Exception e)
        {
            System.out.println("Error al desconectar " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.getConnection();
    }
}



package com.empleado.bo;
import com.empleado.dao.EmpleadoDAO;
import com.empleado.db.Conexion;
import com.empleado.entidad.Empleado;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Arely
 */
public class EmpleadoBO {
    private String mensaje = "";
    private  EmpleadoDAO edao = new EmpleadoDAO();
   
  
    public String agregarEmpleado( Empleado emp){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarEmpleado(conn, emp);
            //conn.rollback();
        } catch (Exception e)
        {
               mensaje = mensaje + " " +  e.getMessage();
               
        }finally{
            try {
                if (conn != null){
                    conn.close();
                    
                }
            } catch (Exception e) {
                
                mensaje = mensaje + " " +  e.getMessage();
            }
        
        }
            
        return mensaje;
    }
    
    public String modificarEmpleado( Empleado emp){
          Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.modificarEmpleado(conn, emp);
            conn.rollback();
        } catch (Exception e)
        {
               mensaje = mensaje + " " +  e.getMessage();
               
        }finally{
            try {
                if (conn != null){
                    conn.close();
                    
                }
            } catch (Exception e) {
                
                mensaje = mensaje + " " +  e.getMessage();
            }
        
        }
            
        return mensaje;
    }
    
    
    public String eliminarEmpleado( int id){
         Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarEmpleado(conn, id);
            conn.rollback();
        } catch (Exception e)
        {
               mensaje = mensaje + " " +  e.getMessage();
               
        }finally{
            try {
                if (conn != null){
                    conn.close();
                    
                }
            } catch (Exception e) {
                
                mensaje = mensaje + " " +  e.getMessage();
            }
        
        }
            
        return mensaje;
    }
    
    public void  listarEmpleado(JTable tabla){
         Connection conn = Conexion.getConnection();
        edao.listarEmpleado(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
    }
    
}



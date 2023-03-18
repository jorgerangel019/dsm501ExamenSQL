package org.utl.dsm.db;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 52477
 */
public class ConexionMySQL {
    Connection conn;
    
    public Connection open(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
            "jdbc:mysql://us-east.connect.psdb.cloud/dsm501?sslMode=VERIFY_IDENTITY",
            "gazmha8h2ums2rpxto69",
            "pscale_pw_5uz4HRvMuAUzExB2QO6ZzbOKwSqmXOmr5M0JbLRN5Ex");
            return conn;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void close(){
        if(conn != null){
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Sesion cerrada");
            }
        }
    }
    
}

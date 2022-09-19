
package co.edu.unab.mototrix.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    
        private static Connection conect;

    public static Connection getConect() {
        return conect;
    }

   public static void conectar(){
       
       String url="jdbc:mysql://localhost:3306/tallermototrix?serverTimezone=UTC";
       String usr="root";
       String ctr="Rendon42730325";
       
        try {
            
            conect=DriverManager.getConnection(url,usr,ctr);
            JOptionPane.showMessageDialog(null,"¡¡ Conectado OK !!");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"¡¡ NO conecto !!");
        }
       
       
   }
    
    
   public static void desconectar(){
   
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
}

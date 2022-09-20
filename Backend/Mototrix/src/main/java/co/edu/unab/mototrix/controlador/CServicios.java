
package co.edu.unab.mototrix.controlador;

import co.edu.unab.mototrix.modelo.Servicios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CServicios {
    public static void registrarServicio(int idServicios, String nombre_serv, Short tiene_insumos, Short tiene_refaciones){
        
        try {
            Servicios e = new Servicios(idServicios, nombre_serv, tiene_insumos, tiene_refaciones);
            Statement st = Conexion.getConect().createStatement();
            st.execute("insert into servicios values('"+e.getIdServicios()+"','"+e.getNombre_serv()+"','"+e.getTiene_insumos()+"','"+e.getTiene_refaciones()+"')");
            JOptionPane.showMessageDialog(null, "Servicio registrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CServicios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Servicio no registrado");
            
        }
    }
    
    public static ResultSet consultarTodosServicios(){
        
        ResultSet rs = null;
        
        
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from Servicios");
            
        } catch (SQLException ex) {
            Logger.getLogger(CServicios.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return rs;
    }
    
    public static ResultSet consultarServicio(int id){
        
        ResultSet rs = null;
        
        
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from servicios where idServicios = '"+id+"'");
            
        } catch (SQLException ex) {
            Logger.getLogger(CServicios.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return rs;
    }
    
        public static void editarServicio(int idServicios, String nombre_serv, Short tiene_insumos, Short tiene_refaciones){
        
        try {
            Servicios e = new Servicios(idServicios, nombre_serv, tiene_insumos, tiene_refaciones);
            Statement st = Conexion.getConect().createStatement();
            st.execute("update servicios set nombre = '"+e.getNombre_serv()+"', tiene_insumos = '"+e.getTiene_insumos()+"', tiene_refacciones = '"+e.getTiene_refaciones()+"'");
            JOptionPane.showMessageDialog(null, "Servicio Actualizado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CServicios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Servicio no actualizado");
            
        }
    }
    
    public static void pintarTablaServicio(JTable tabla, ResultSet rs){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TIENE INSUMOS");
        modelo.addColumn("TIENE REFACCIONES");
        
        
        try {
            while (rs.next()) {
                
                String[]fila = {rs.getString("idServicios"), rs.getString("nombre_serv"), rs.getString("tiene_insumos"), rs.getString("tiene_refaciones")};
                modelo.addRow(fila);
            
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(CServicios.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
    }
    
            
    public static void eliminarServicio(int idServicios){
        try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("delete from servicios where idServicios = '"+idServicios+"'");
            JOptionPane.showMessageDialog(null, "Servicio eliminado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CServicios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Servicio no eliminado");
            
        }
                    
    }
    
}

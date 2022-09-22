
package co.edu.unab.mototrix.controlador;

import co.edu.unab.mototrix.modelo.Proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CProveedor {
    
    public static void registrarProveedor(int idProveedor, String nombre, String correo, String telefono){
        
        try {
            Proveedor e = new Proveedor(idProveedor, nombre, correo, telefono);
            Statement st = Conexion.getConect().createStatement();
            st.execute("insert into proveedor values ('"+e.getIdProveedor()+"','"+e.getNombre()+"','"+e.getCorreo()+"','"+e.getTelefono()+"')");
            JOptionPane.showMessageDialog(null, "Proveedor actualizado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CProveedor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Proveedor no actualizado");
        }
    }
    
    public static void eliminarProveedor(int id){
        
        try {
            Statement st = Conexion.getConect().createStatement();
            
            st.execute("delete from proveedor where idProveedor='"+id+"'");
            
            JOptionPane.showMessageDialog(null, "Proveedor Eliminado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CProveedor.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el proveedor, puede que no exista");
        }
        
    }
    
    public static void modificarProveedor(int id, String nombre, String telefono, String correo){
        
        try {
            
            Statement st = Conexion.getConect().createStatement();
            
            st.execute("update proveedor set nombre = '"+nombre+"', telefono = '"+telefono+"', correo = '"+correo+"' where idProveedor = '"+id+"'");
            
            JOptionPane.showMessageDialog(null, "¡¡Proveedor acualizado!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CProveedor.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "!!Proveedor no actualizado¡¡");
        }
    }
    
    public static ResultSet consultarProveedor(int id){
        
        ResultSet rs = null;
        
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from proveedor where idProveedor = '"+id+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(CProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return rs;
    }
    
    public static ResultSet consultarTodosProveedores(){
        ResultSet rs = null;
        
        try { 
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from proveedor");
        } catch (SQLException ex) {
            Logger.getLogger(CProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static void pintarTablaProveedor(JTable tabla, ResultSet rs){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("CORREO");
        
        try {
            while(rs.next()){
                
                String[]fila = {rs.getString("idProveedor"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("correo")};
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(CProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

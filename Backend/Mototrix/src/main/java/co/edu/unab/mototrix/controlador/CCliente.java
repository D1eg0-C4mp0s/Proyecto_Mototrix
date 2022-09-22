
package co.edu.unab.mototrix.controlador;

import co.edu.unab.mototrix.modelo.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CCliente { 
    
    public static void registrarCliente(int idCliente, String nombre, String telefono, String correo){
        
        try {
            Cliente e = new Cliente(idCliente, nombre, telefono, correo);
            
            Statement st = Conexion.getConect().createStatement();
            
            st.execute("insert into cliente values ('"+e.getIdCliente()+"','"+e.getNombre()+"','"+e.getTelefono()+"','"+e.getCorreo()+"')");
            
            JOptionPane.showMessageDialog(null, "¡¡Cliente registrado!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "!!Cliente no Registrado¡¡¡");
        }
    }
    
    public static void eliminarCliente(int id){
        
        try {
            Statement st = Conexion.getConect().createStatement();
            
            st.execute("delete from cliente where idCliente='"+id+"'");
            
            JOptionPane.showMessageDialog(null, "Cliente Eliminado");
            
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el Cliente, puede que no exista");
        }
        
    }
    
    public static void modificarCliente(int id, String nombre, String telefono, String correo){
        
        try {
            
            Statement st = Conexion.getConect().createStatement();
            
            st.execute("update cliente set nombre = '"+nombre+"', telefono = '"+telefono+"', correo = '"+correo+"' where idCliente = '"+id+"'");
            
            JOptionPane.showMessageDialog(null, "¡¡Cliente acualizado!!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "!!Cliente no actualizado¡¡");
        }
    }
    
    public static ResultSet consultarCliente(int id){
        
        ResultSet rs = null;
        
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from cliente where idCliente = '"+id+"' ");
            
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return rs;
    }
    
    public static ResultSet consultarTodosClientes(){
        ResultSet rs = null;
        
        try { 
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from cliente");
        } catch (SQLException ex) {
            Logger.getLogger(CCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static void pintarTablaCliente(JTable tabla, ResultSet rs){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("CORREO");
        
        try {
            while(rs.next()){
                
                String[]fila = {rs.getString("idServicios"), rs.getString("nombre"), rs.getString("tiene_insumos"), rs.getString("tiene_refaciones")};
                modelo.addRow(fila);
            }
            
            tabla.setModel(modelo);
            
        } catch (SQLException ex) {
            Logger.getLogger(CServicios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
